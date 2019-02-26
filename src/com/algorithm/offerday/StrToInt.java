package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-24
 */
public class StrToInt {
    /**
     * 题目描述：输入一个字符串,包括数字字母符号,可以为空
     * 如果是合法的数值表达则返回该数字，否则返回0
     * <p>
     * 思路：确定边界条件
     * 字符串为空
     * 串中存在字母
     * 全是+-号
     * 数字越界
     */
    public static int StrToInt(String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        char[] chars = str.toCharArray();
        int start = 0, symbol = 0;
        if (chars[0] == '+') {
            start = 1;
        } else if (chars[0] == '-') {
            start = 1;
            symbol = 1;
        }
        int result = 0;
        for (int i = start; i < chars.length; i++) {
            if (chars[i] > '9' || chars[i] < '0') {
                return 0;
            }
            int sum = result * 10 + (chars[i] - '0');

            if ((sum - (chars[i] - '0')) / 10 != result) {
                return 0;
            }
            result = result * 10 + (chars[i] - '0');
        }
        result = (int) Math.pow(-1, symbol) * result;
        return result;
    }

    public static void main(String[] args) {
        String a="123";
        System.out.println(StrToInt(a));;
    }
}
