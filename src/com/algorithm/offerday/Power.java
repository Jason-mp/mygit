package com.algorithm.offerday;

public class Power {
    //12.浮点数值的整数次方
    public static double Power(double base, int exponent) {
        double result;
        result= Math.pow(base, exponent);
        return result;
    }

    //如果不使用库函数，如何实现
    public static double PowerBySelf(double base, int exponent) {
        //初始化时已经考虑了指数为0的情况
        double result = 1;
        if (exponent < 0) {
            for (int i = 0; i < (-exponent); i++) {
                result *= base;
            }
            result = 1.0/result;
            return result;
        }
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }
        return result;
    }

}
