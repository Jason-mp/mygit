package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-24
 */
public class LastRemaining {
    /**
     * 题目描述：每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
     * 从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,
     * <p>
     * 思路：
     * 1.约瑟夫环解决，将数组看成环形链表
     * 2.总结规律，可推出公式 f(n,m) = 0(n=1),f(n,m) = [f(n-1,m)+m]%n(n>1)
     */
    public int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        int count = n, i = -1;
        //记录走过的数字(0~m-1)
        int step = 0;
        while (count > 0) {
            i++;
            if (i >= n) {
                i = 0;
            }
            if (array[i] == -1) {
                continue;
            }
            step++;
            if (step == m) {
                array[i] = -1;
                step = 0;
                count--;
            }
        }
        return i;
    }
}
