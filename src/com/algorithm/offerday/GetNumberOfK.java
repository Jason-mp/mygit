package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-22
 */
public class GetNumberOfK {
    /**
     * 题目描述：统计一个数字在排序数组中出现的次数
     * <p>
     * 思路：二分查找找到开始的K和结尾的K
     */
    public static int GetNumberOfK(int[] array, int k) {
        int length = array.length;
        if (length == 0) {
            return 0;
        }
        int first = getFirstK(array, k, 0, length - 1);
        int last = getLastK(array, k, 0, length - 1);
        if (last >= 0 && first >= 0) {
            return last - first + 1;
        }
        return 0;

    }

    public static int getFirstK(int[] array, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) >> 1;
        while (start <= end) {
            if (array[mid] < k) {
                start = mid + 1;
            } else if (array[mid] > k) {
                end = mid - 1;
            } else if ((mid - 1) >= 0 && array[mid - 1] == k) {
                end = mid - 1;
            } else {
                return mid;
            }
            mid = (start + end) >> 1;
        }
        return -1;
    }

    public static int getLastK(int[] array, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int length = array.length;
        int mid = (start + end) >> 1;
        while (start <= end) {
            if (array[mid] < k) {
                start = mid + 1;
            } else if (array[mid] > k) {
                end = mid - 1;
            } else if (mid + 1 < length && array[mid + 1] == k) {
                start = mid + 1;
            } else {
                return mid;
            }
            mid = (start + end) >> 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 3, 3, 4, 5};
        int k = 3;
        int n = GetNumberOfK(a, k);
        System.out.println(n);
    }
}
