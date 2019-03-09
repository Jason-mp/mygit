package com.algorithm.mytry;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author xp
 * @Date：2019-02-27
 */
public class TopK {

    public static int sort(int[] array, int k) {
        Arrays.sort(array);
        int len = array.length;
        int count = 1;
        for (int j = len - 1; j > 0; j--) {
            if (array[j] != array[j - 1]) {
                count++;
            }
            if (count == k) {
                return array[j - 1];
            }
        }
        if (count < k) {
            return array[len - 1];
        }
        return 0;
    }

    public static int heapSort(int[] array, int k) {
        Comparator<Integer> comparable = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //这样写是构造小顶堆，o2-o1是构造大顶堆
                return o1 - o2;
            }
        };
        if (array == null || array.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, comparable);

        for (int i = 0; i < array.length; i++) {
            if (queue.size() < k) {
                queue.add(array[i]);
            } else {
                if (array[i] > queue.peek()) {
                    queue.poll();
                    queue.add(array[i]);
                }
            }
        }
        for (int i : queue) {
            System.out.println(i);
        }
        System.out.println("=============");
        return queue.peek();
    }

    /**
     * 减治法实现找出第K个大的数字，先通过快排的partition获取位置
     */
    public static int getTopK(int[] array, int k) {
        if (array.length < k) {
            return 0;
        }
        int low = 0;
        int high = array.length - 1;
        int j = getNum(array, low, high);
        while (j != k) {
            if (k > j) {
                low = j + 1;
            } else {
                high = j;
            }
            j = getNum(array, low, high);
        }
        return array[array.length-j];
    }

    public static int partition(int[] array, int start, int end, int k) {
        if (start > end) {
            return 0;
        }
        int lt = start, gt = end, i = lt + 1;
        int base = array[start];
        while (i <= gt) {
            if (array[i] > base) {
                swap(array, lt++, i++);
            } else if (array[i] < base) {
                swap(array, i, gt--);
            } else {
                i++;
            }
        }
        if (i - start > k) {
            return partition(array, start, lt, k);
        } else if (i - start < k) {
            return partition(array, gt + 1, end, k - i);
        } else {
            return array[lt + 1];
        }
    }

    public static void swap(int[] arrays, int start, int end) {
        int temp = arrays[start];
        arrays[start] = arrays[end];
        arrays[end] = temp;
    }

    public static int getNum(int[] array, int left, int right) {
        int low = left;
        if (left < right) {
            int key = array[left];

            int high = right;
            while (low < high) {
                while (low < high && array[high] >= key) {
                    high--;
                }
                array[low] = array[high];
                while (low < high && array[low] <= key) {
                    low++;
                }
                array[high] = array[low];
            }
            array[low] = key;
        }
        return low;
    }


    public static void main(String[] args) {
        int[] arr = {10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
        int[] a = {9, 9, 9, 8, 8};
        System.out.println(getTopK(arr, 4));
    }

}
