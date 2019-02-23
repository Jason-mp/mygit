package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-23
 */
public class FindNumsAppearOnce {
    /**
     * 题目描述：一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
     * <p>
     * 思路：异或所有相同偶数次数字都变成0，只剩下两个一次的数字异或
     */
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length <= 0) {
            num1[0] = num2[0] = 0;
            return;
        }

        int sum = 0, index = 0;
        for (int i = 0; i < array.length; i++) {
            sum ^= array[i];
        }
        //计算出剩余的两个数字中一个那一位为1的，按照这个将所有数字分成两组
        for (index = 0; index < 32; index++) {
            if ((sum & (1 << index)) != 0) break;
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & (1 << index)) != 0) {
                num2[0] ^= array[i];
            } else {
                num1[0] ^= array[i];
            }
        }
    }
}
