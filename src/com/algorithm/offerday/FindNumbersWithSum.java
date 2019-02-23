package com.algorithm.offerday;

import java.util.ArrayList;

/**
 * @Author xp
 * @Date：2019-02-23
 */
public class FindNumbersWithSum {
    /**
     * 题目描述：输入一个递增排序的数组和一个数字S，在数组中查找两个数，
     * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
     * <p>
     * 思路：
     */
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        int length = array.length;
        int low = 0, high = length - 1;
        while (low < high) {
            int cur = array[low] + array[high];
            if (cur == sum) {
                result.add(array[low]);
                result.add(array[high]);
                break;
            } else if (cur > sum) {
                high--;
            } else {
                low++;
            }
        }
        return result;
    }
}
