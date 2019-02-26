package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-24
 */
public class Sum {
    /**
     * 题目描述：求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句。
     * <p>
     * 思路：利用&&短路性质实现递归的终止条件
     */
    public static int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (n > 0) && (sum += Sum_Solution(n - 1)) > 0;
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(Sum_Solution(5));
    }
}
