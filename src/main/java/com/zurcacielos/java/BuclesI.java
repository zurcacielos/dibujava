package com.zurcacielos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// hacker rank java loops I
public class BuclesI {
    // imprime las primeras 10 multiplicaciones de un número
    // Tomando numeros de Scanner
    public static void multiplos1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    public static void multiploUno(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d c %d = %d\n", n, i, n* i );
        }
    }

    // imprime las primeras 10 multiplicaciones de un número
    // Tomando numeros de BufferedReader
    public static void multiplos2(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        try {
            blind(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void blind(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i =1 ; i<=10 ; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }

}
