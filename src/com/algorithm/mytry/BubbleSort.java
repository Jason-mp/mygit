package com.algorithm.mytry;

import javax.sound.midi.Soundbank;
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
        int[] a = {3,1,7,9,0,5,6};
        sortPlus(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void sort(int[] array) {
        for (int i = 0;i<array.length;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public static void sortPlus(int[] arr){
        boolean flag=true;
        for(int i=0;i<arr.length-1&&flag;i++){
            flag=false;
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    flag=true;
                    int tmp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }
        }


    }
}
