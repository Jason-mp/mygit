package com.algorithm.mytry;

import java.util.Scanner;

public class BubbleSort {

    private void sort(double[] list) {
        int length = list.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                double tmp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = tmp;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        double[] list = scanner.nextLine();
    }
}
