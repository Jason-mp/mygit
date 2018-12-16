package com.algorithm.offerday;

public class Fibonacci {

    //07. 斐波那契数列  递归直观，但由于中间过程的计算值都没有保存下来，会导致重复计算
    //基数过大会爆栈，抛出OutOfStackException，可用循环代替
    public static int Fibonacci(int n) {
        int c = 1, b = 1, a = 0;
        if (n == 0) {
            return 0;
        }if (n == 1) {
            return 1;
        }
        else {
            for (int i = 2; i <= n; i++) {
                a = b + c;
                b = c;
                c = a;
            }
            return c;
        }
    }

    public static int FibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        }if (n == 1) {
            return 1;
        }
        return FibonacciRecursion(n-2) + FibonacciRecursion(n-1);
    }
}
