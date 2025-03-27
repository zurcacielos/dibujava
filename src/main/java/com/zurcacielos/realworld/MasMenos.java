package com.zurcacielos.realworld;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Cuenta los positivos y negativos
     */
    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0) {
                positivos++;
            } else if (arr.get(i) < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.printf("%.6f\n", (double) positivos / n);
        System.out.printf("%.6f\n", (double) negativos / n);
        System.out.printf("%.6f\n", (double) ceros / n);
    }

}

public class MasMenos {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
