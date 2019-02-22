package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-20
 */
public class NumberOf1Between1AndN {

    /**
     * 求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）
     * <p>
     * 思路：
     * 某一位数为0， 取决于高位 *i
     * 某一位数为1， 取决于高位*i+低位+本身1
     * 某一位数>1， 取决于(高位+1)*i
     */
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;

        int i = 1;
        int current = 0, before = 0, after = 0;
        while ((n / i) != 0) {
            current = (n / i) % 10;
            before = n / (i * 10);
            after = n % i;
            if (current == 0) {
                count += before * i;
            } else if (current == 1) {
                count += before * i + after + 1;
            } else {
                count += (before + 1) * i;
            }

            i = i * 10;
        }
        return count;
    }
}
