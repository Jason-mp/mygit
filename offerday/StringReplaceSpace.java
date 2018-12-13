package com.algorithm.offerday;

public class StringReplaceSpace {
    //02.替换空格
    public String replaceSpace(StringBuffer str) {

        if (null == str) {
            return null;
        }
        for (int i = 0; i < str.length(); i ++) {
            char c = str.charAt(i);
            if (' ' == c) {
                str.replace(i, i+1, "%20");
            }
        }
        return str.toString();
    }
}
