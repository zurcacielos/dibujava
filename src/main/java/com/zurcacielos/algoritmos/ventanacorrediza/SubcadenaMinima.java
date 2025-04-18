package com.zurcacielos.algoritmos.ventanacorrediza;

import java.util.HashMap;
import java.util.Objects;

// Minimum Window Substrng - leetcode 76
public class SubcadenaMinima {
    public static String subcadenaMinima(String s, String t) {
        int l = 0, r = 0;
        int resL = -1, resR = -1;

        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> windowMap = new HashMap<Character, Integer>();
        for (Character c : t.toCharArray()) {
            incrementMap(tMap, tMap, c, true);
        }

        // initial load for the length of t, which is the minimum length of the window
        // even counting the duplicates
        while (r < s.length() && r < t.length()) {
            incrementMap(tMap, windowMap, s.charAt(r), false);
            r++;
        }

        while (r - l >= t.length()) {
            var comp = completa(windowMap, tMap);
            if (comp || r == s.length()) {
                if (comp) {
                    resL = l;
                    resR = r;
                }

                decrementMap(windowMap, s.charAt(l));
                l = l + 1;
            } else {
                incrementMap(tMap, windowMap, s.charAt(r), false);
                r = Math.min(r + 1, s.length());
            }
        }

        return resL + "-" + Math.min(resR, s.length() - 1);
    }

    private static boolean completa(HashMap<Character, Integer> windowMap, HashMap<Character, Integer> tMap) {
        for (Character c : tMap.keySet()) {
            if (!Objects.equals(windowMap.get(c), tMap.get(c))) {
                return false;
            }
        }
        return true;
    }

    private static void incrementMap(HashMap<Character, Integer> tMap, HashMap<Character, Integer> map, char s, boolean debeExistir) {
        if (!debeExistir && !tMap.containsKey(s)) {
            return;
        }
        if (map.containsKey(s)) {
            map.put(s, map.get(s) + 1);
        } else {
            map.put(s, 1);
        }
    }

    private static void decrementMap(HashMap<Character, Integer> map, char s) {
        if (map.containsKey(s) && map.get(s) > 0) {
            map.put(s, map.get(s) - 1);
        } else {
            map.put(s, 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(subcadenaMinima("ODYXAZXY", "XYZ"));
        System.out.println(subcadenaMinima("ADOBECODEBANC", "ABC"));
    }
}
