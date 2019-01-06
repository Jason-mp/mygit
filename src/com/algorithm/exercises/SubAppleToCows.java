package com.algorithm.exercises;

import java.util.Scanner;

public class SubAppleToCows {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int[] apples = new int[num];
            int sum = 0;
            for (int i = 0; i < num; i++) {
                apples[i] = sc.nextInt();
            }
            for (int i = 0; i < apples.length; i++) {
                sum += apples[i];
            }
            if (sum % num != 0) {
                System.out.println(-1);
                return;
            }
            int avg = sum / num;
            int times = 0;
            for (int n: apples) {
                if (n > avg) {
                    int over = n - avg;
                    if (over % 2 != 0) {
                        System.out.println(-1);
                        break;
                    }else {
                        times += over / 2;
                    }
                }
            }
            System.out.println(times);
        }
    }
}
