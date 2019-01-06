package com.algorithm.offerday;


public class MinNumberInRotateArray {
    //06.旋转数组的最小数字
    //思路：非减数组旋转后变成两个排序好的数组，找到中间临界点就是最小数
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                return array[i+1];
            } else {
                if (i == array.length - 2) {
                    return array[0];
                }
            }
        }
        return 0;
    }
}
