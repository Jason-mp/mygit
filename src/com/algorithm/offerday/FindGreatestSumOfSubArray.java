package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-20
 */
public class FindGreatestSumOfSubArray {

    /**
     * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)
     * 思路：
     */

    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int max = array[0];
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max + array[i], array[i]);
            sum = Math.max(max, sum);
        }
        return sum;
    }
}
