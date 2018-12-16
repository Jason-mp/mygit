package com.algorithm.offerday;

public class NumberOf1 {
    //11.二进制中1的个数
    //可以使用&1移位的方式，但是负数右移会补1，陷入死循环
    //可以将1左移与数相与
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(12));
    }
}
