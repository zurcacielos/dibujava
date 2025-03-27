package com.zurcacielos.realworld;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEndOfWord = false;
}

class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public boolean insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            current = current.children.computeIfAbsent(ch, c -> new TrieNode());
            if (current.isEndOfWord) {
                System.out.println("BAD SET");
                System.out.println(word);
                return false; // Found a prefix
            }
        }
        if (!current.children.isEmpty()) {
            System.out.println("BAD SET");
            System.out.println(word);
            return false; // The word is a prefix of another word
        }
        current.isEndOfWord = true;
        return true;
    }
}

class ResultNoPrefixSet {

    /*
     * Complete the 'noPrefix' function below.
     *
     * The function accepts STRING_ARRAY words as parameter.
     */

    public static void noPrefix(List<String> words) {
        // Write your code here
        Trie trie = new Trie();
        for (String word : words) {
            if (!trie.insert(word)) {
                return;
            }
        }
        System.out.println("GOOD SET");
    }

}

public class NoPrefixSet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> words = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        ResultNoPrefixSet.noPrefix(words);

        bufferedReader.close();
    }
}
