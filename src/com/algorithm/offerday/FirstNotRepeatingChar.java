package com.algorithm.offerday;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author xp
 * @Date：2019-02-20
 */
public class FirstNotRepeatingChar {
    /**
     * 题目描述：
     * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)
     * 中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
     *
     * 思路：
     *
     */

    public int FirstNotRepeatingChar(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++){
            if (!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            }
        }

        for (int i=0;i<str.length();i++){
            if (map.get(str.charAt(i))==1){
                return i;
            }

        }


        return -1;
    }
}
