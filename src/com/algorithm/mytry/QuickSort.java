package com.algorithm.mytry;

public class QuickSort {
    public static void sort(int[] arrays, int low, int high) {
        int i, j, base, tmp;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        base = arrays[low];
        while (i < j){
            while (i < j && arrays[j] >= base) {
                j--;
            }
            while (i < j && arrays[i] <= base) {
                i++;
            }
            if (i < j) {
                tmp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = tmp;
            }
        }
        tmp = arrays[i];
        arrays[i] = arrays[low];
        arrays[low] = tmp;

        sort(arrays, low, i-1);
        sort(arrays, i+1, high);
    }

    public static void main(String[] args){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print("  ");
        }
    }

    public static void quickSort(int[] arrays, int low, int high) {
        if (low >= high) {
            return;
        }
        int lt = low, i = low + 1, gt = high;
        int base = arrays[low];
        while (i <= gt) {
            if (arrays[i] < base) {
                swap(arrays, lt++, i++);
            } else if (arrays[i] > base) {
                swap(arrays, i, gt--);
            } else {
                i++;
            }
        }
        quickSort(arrays, low, lt - 1);
        quickSort(arrays, gt + 1, high);
    }

    public static void swap(int[] arrays, int start, int end) {
        int temp = arrays[start];
        arrays[start] = arrays[end];
        arrays[end] = temp;
    }

}
