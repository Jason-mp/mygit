package com.algorithm.offerday;

import java.util.ArrayList;

/**
 * @Author xp
 * @Date：2019-02-23
 */
public class FindContinuousSequence {
    /**
     * 题目描述：输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
     * <p>
     * 思路：控制一个滑动窗口，求和
     * if(==sum) 加入，然后开始往后移动
     * if(<sum) 增加一个大数，即high++
     * if(>sum) 去掉最小的数，即low++
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (sum < 3) {
            return result;
        }
        int low = 1;
        int high = 2;
        while (low < high) {
            int temp = (low + high) * (high - low + 1) / 2;
            if (temp == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = low; i <= high; i++) {
                    list.add(i);
                }
                result.add(list);
                low++;
            } else if (temp > sum) {
                low++;
            } else {
                high++;
            }
        }
        return result;
    }
}
