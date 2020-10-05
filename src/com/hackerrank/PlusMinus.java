package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {
	
	static int positive, negative, zero = 0;

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            checkSignum(arr[i]);
        }

        System.out.println(String.format("%.6f", positive / Double.valueOf(arr.length)));
        System.out.println(String.format("%.6f", negative / Double.valueOf(arr.length)));
        System.out.println(String.format("%.6f", zero / Double.valueOf(arr.length)));

    }

    static void checkSignum(double number) {

        Double value = Math.signum(number);

        switch (value.intValue()) {
            case -1: negative++;
                break;
            case 1: positive++;
                break;
            default: zero++;
                break;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }

}
