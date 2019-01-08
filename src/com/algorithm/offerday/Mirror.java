package com.algorithm.offerday;

/**
 * @Author xp
 * @Date: 2019-01-08
 */

public class Mirror {
    /**
        18.操作给定的二叉树，将其变换为源二叉树的镜像。
        思路1：根据树的性质，先交换跟的左右节点，递归操作
        思路2：非递归
     */
    public void Mirror(TreeNode root) {
        TreeNode tmp;
        if (root != null) {
            tmp  = root.left;
            root.left = root.right;
            root.right = tmp;
            if (root.right != null) {
                Mirror(root.right);
            }
            if (root.left != null) {
                Mirror(root.left);
            }
        }
    }
}
