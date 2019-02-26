package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-24
 */
public class Duplicate {
    /**
     * 题目描述：在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
     * 但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
     * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2
     * <p>
     * 思路：
     */
    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length <= 0) {
            duplication[0] = -1;
            return false;
        }
        int[] temp = new int[length];
        for (int n : numbers) {
            if (temp[n % length] == 0) {
                temp[n % length] = 1;
            } else {
                duplication[0] = n;
                System.out.println(duplication[0]);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 3, 1, 0, 2, 5, 3};
        int length = numbers.length;
        int[] d = new int[length];
        duplicate(numbers, length, d);
    }
}
