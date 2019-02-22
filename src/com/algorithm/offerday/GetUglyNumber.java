package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-20
 */
public class GetUglyNumber {
    /**
     * 题目描述：把只包含质因子2、3和5的数称作丑数（Ugly Number）。
     * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
     * 思路：
     * 比较(2*x , 3*y, 5*z) ，x>=y>=z的，
     * 重点说说下面代码中p的作用：int p[] = new int[] { 0, 0, 0 }; p[0]表示最小用于
     * 乘2比较数在数组a中的位置
     */
    final int d[] = {2, 3, 5};
    public int GetUglyNumber_Solution(int index) {
        if (index == 0) return 0;

        int a[] = new int[index];
        a[0] = 1;
        int p[] = new int[]{0, 0, 0};
        int num[] = new int[]{2, 3, 5};
        int i = 1;
        while (i < index) {
            int m = findMin(num[0], num[1], num[2]);
            //这个if判断主要排除等于的情况
            if (a[i - 1] < num[m])
                a[i++] = num[m];
            p[m] += 1;
            num[m] = a[p[m]] * d[m];
        }
        return a[index - 1];
    }

    public int findMin(int num2, int num3, int num5) {
        int min = Math.min(num2, Math.min(num3, num5));
        return min == num2 ? 0 : min == num3 ? 1 : 2;
    }
}
