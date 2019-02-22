package com.algorithm.offerday;

import java.util.*;

/**
 * @Author xp
 * @Date：2019-02-20
 */
public class PrintMinNumber {

    /**
     * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
     * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323
     * <p>
     * 思路：将两个数字合起来比较大小，实现comparator接口
     */
    public static String PrintMinNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });
        for (int i : list) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] n = {3,32,321};
        String res = PrintMinNumber(n);
        System.out.println(res);
    }
}
