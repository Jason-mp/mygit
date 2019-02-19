package com.algorithm.offerday;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author xp
 * @Date：2019-02-19
 */
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int[] array) {

        if (array.length == 0) {
            return 0;
        }
        Map<Integer, Integer> number = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!number.containsKey(array[i])) {
                number.put(array[i], 1);
            } else {
                int count = number.get(array[i]);
                number.put(array[i], ++count);
            }
        }
        Iterator iterator = number.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            int key = (int) entry.getKey();
            int value = (int) entry.getValue();
            if (value > array.length / 2) {
                return key;
            }
        }
        return 0;
    }

}
