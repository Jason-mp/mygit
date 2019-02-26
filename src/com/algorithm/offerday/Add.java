package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-24
 */
public class Add {
    /**
     * 题目描述：求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号
     * <p>
     * 思路：求和各位相异或^，求进位就是各位相与&左移1位<<1，循环直到有一个数为0
     */
    public int Add(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 ^ num2;
            num2 = (num2 & num1) << 1;
            num1 = temp;
        }
        return num1;
    }


}
