package com.zurcacielos.java;

import java.util.Scanner;

// hacker rank java loops II
public class Bucles2 {
    // imprime las primeras 10 multiplicaciones de un número
    // Tomando numeros de Scanner
    public static void multiplos1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int suma = a;
            for (int j = 0; j < n; j++) {
                suma += Math.pow(2, j) * b;
                System.out.print(suma + " ");
            }
            System.out.println();
        }
        scanner.close();
    }


    public static void main(String[] args) {
        try {
            multiplos1(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}