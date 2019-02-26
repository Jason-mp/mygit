package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-23
 */
public class LeftRotateString {
    /**
     * 题目描述：对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
     * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
     * <p>
     * 思路：YX = (X^TY^T)^T，将string分成两部分，然后两部分再翻转，然后将整体翻转
     */
    public static String LeftRotateString(String str, int n) {
        int len = str.length();
        if (len == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        swap(chars, 0, n - 1);
        swap(chars, n, len - 1);
        swap(chars, 0, len - 1);
        StringBuilder sb = new StringBuilder(len);
        for (char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void swap(char[] array, int start, int end) {
        for (int i = start, j = end; i < j; ++i, --j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static String LeftRotateStringTemp(String str, int n) {
        int len = str.length();
        if (len == 0) {
            return "";
        }
        String a = str.substring(0, n);
        String b = str.substring(n);
        return b + a;
    }

    public static void main(String[] args) {
        String a = "abcdefg";
        String n = LeftRotateString(a, 2);
        System.out.println(n);
    }
}
