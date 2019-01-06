package com.algorithm.exercises;

import java.util.Scanner;

public class SortInTwoWaysKaoLa {
    public static boolean sortByLength(String[] array) {
        boolean lengths = true;
        for (int i = 0; i < array.length -1; i++) {
            if (array[i].length() > array[i+1].length()) {
                lengths = false;
                break;
            }
        }
        return lengths;
    }

    public static boolean sortByLexico(String[] array) {
        boolean lexicographically = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i+1]) > 0) {
                lexicographically = false;
                break;
            }
        }
        return lexicographically;
    }

    private static String validate(String[] words) {
        boolean lexicographically = sortByLexico(words);
        boolean lengths = sortByLength(words);
        if (lexicographically && lengths) {
            return "both";
        }
        if (lexicographically) {
            return "lexicographically";
        }
        if (lengths) {
            return "lengths";
        }
        return "none";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = sc.next();
            }
            System.out.println(validate(words));
        }
    }
}
