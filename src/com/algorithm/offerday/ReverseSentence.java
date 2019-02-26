package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-23
 */
public class ReverseSentence {
    /**
     * 题目描述：“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”
     * <p>
     * 思路：先将整个句子翻转，然后逐个单词翻转
     */
    public static String ReverseSentence(String str) {

        if (str.trim().equals("")) {
            return str;
        }
        String[] a = str.split(" ");
        StringBuffer o = new StringBuffer();
        int i;
        for (i = a.length; i > 0; i--) {
            o.append(a[i - 1]);
            if (i > 1) {
                o.append(" ");
            }
        }
        return o.toString();
    }

    public static void main(String[] args) {
        String s = " student. a am  I ";
        String a = ReverseSentence(s);
        System.out.println(a);
    }
}
