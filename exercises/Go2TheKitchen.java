package com.algorithm.exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Go2TheKitchen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        while (sc.hasNext()) {
            String s = sc.nextLine();
            set.add(s);
        }
        System.out.println(set.size());
        sc.close();
    }
}
