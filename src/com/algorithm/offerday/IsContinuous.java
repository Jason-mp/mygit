package com.algorithm.offerday;

import java.util.Arrays;

/**
 * @Author xp
 * @Date：2019-02-24
 */
public class IsContinuous {
    /**
     * 题目描述：大\小 王可以看成任何数字，实现顺子
     * <p>
     * 思路：先排序
     */
    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }

        Arrays.sort(numbers);
        int countOfZero = 0;
        int countOfGap = 0;
        int length = numbers.length;
        for (int i = 0; i < length && numbers[i] == 0; i++) {
            countOfZero++;
        }
        int small = countOfZero;
        int big = small + 1;
        while (big < length) {
            if (numbers[small] == numbers[big]) {
                return false;
            }
            countOfGap += numbers[big] - numbers[small] - 1;
            small++;
            big++;
        }
        return (countOfGap > countOfZero ? false : true);
    }
}
