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

    public static String ReverseSentenceOnly(String str) {

        if (str.trim().equals("")) {
            return str;
        }
        char[] a = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int len = a.length;
        for (int i=0;i<len/2+1;i++){
            char temp = a[i];
            a[i] = a[len-1-i];
            a[len-1-i] = temp;
        }
        for (char c :a){
            sb.append(c);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = " student. a am  I ";
        String a = ReverseSentenceOnly(s);
        System.out.println(a);
    }
}
