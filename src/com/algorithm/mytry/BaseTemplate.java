package com.algorithm.mytry;

public class BaseTemplate {

    public static boolean less(Comparable c, Comparable q) {
        return c.compareTo(q) < 0;
    }

    public static void exchange(Comparable[] c, int i, int j) {
        Comparable t = c[i];
        c[i] = c[j];
        c[j] = t;
    }
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
