package com.algorithm.offerday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author xp
 * @Date：2019-02-19
 */
public class Permutation {
    /**
     * <p>
     * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
     * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。</p>
     * <p>
     * 思路：字典法回溯
     */

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str != null && str.length() > 0) {
            PermutationHelp(str.toCharArray(), 0, res);
            Collections.sort(res);
        }
        return res;
    }

    public void PermutationHelp(char[] cs, int i, ArrayList<String> res) {
        //递归的终止条件，下标已经移动到了最后位置
        if (i == cs.length - 1) {
            if (!res.contains(new String(cs))) {
                res.add(new String(cs));
                return;
            }
        } else {
            for (int j = i; j < cs.length; j++) {
                swap(cs, i, j);
                PermutationHelp(cs, i+1, res);
                swap(cs, i, j);
            }

        }
    }


    public void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }

    public static void main(String[] args) {
        Permutation p = new Permutation();
        System.out.println(p.Permutation("bac").toString());
    }


}
