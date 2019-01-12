package com.algorithm.offerday;

/**
 * @Author xp
 * @Date: 2019-01-09
 */
public class VerifySquenceOfBST {

    /**
     * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
     * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
     * <p>
     * 思路：关键->题中要求为二叉搜索树
     * 举个例子，输入5，7，6，9，11，10，8可以的
     * 二叉搜索树的左右节点仍然是二叉搜索树，利用这一特点，可以递归求得
     */
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        if (sequence.length == 1) {
            return true;
        }

        return judge(sequence, 0, sequence.length - 1);
    }

    public boolean judge(int[] array, int start, int end) {
        if (start >= end) {
            return true;
        }
        int i = start;
        while (array[i] < array[end]) {
            ++i;
        }
        for (int j = i; j < end; j++) {
            if(array[j] < array[end]){
                return false;
            }
        }
        return judge(array, start, i-1) && judge(array, i, end-1);
    }

}
