package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-22
 */
public class InversePairs {

    public int InversePairs(int[] array) {
        int p = 1000000007;

        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        int count = sort(array, temp, 0, array.length - 1);
        return count % p;
    }

    public int sort(int[] a, int[] temp, int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = (high + low) / 2;
        int leftCount = sort(a, temp, low, mid) % 1000000007;
        int rightCount = sort(a, temp, mid + 1, high) % 1000000007;

        int count = 0;
        int i = mid;
        int j = high;
        int tempIndex = high;
        while (i >= low && j >= mid) {
            if (a[i] > a[j]) {
                count += j - mid;
                temp[tempIndex--] = a[i--];
                if (count >= 1000000007) {
                    count %= 1000000007;
                }
            } else {
                temp[tempIndex--] = a[i--];
            }
        }
        for (; i >= low; i--) {
            temp[tempIndex--] = a[i];
        }
        for (; j > mid; j--) {
            temp[tempIndex--] = a[j];
        }
        for (int s = low; s <= high; s++) {
            a[s] = temp[s];
        }
        return (leftCount + rightCount + count) % 1000000007;
    }
}
