package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-23
 */
public class IsBalanced {
    /**
     * 题目描述：输入一棵二叉树，判断该二叉树是否是平衡二叉树。
     * <p>
     * 思路：后序遍历二叉树，
     */
    boolean isBalance = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        isBalanced(root);
        return isBalance;
    }

    public int isBalanced(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth1 = isBalanced(root.left);
        int depth2 = isBalanced(root.right);

        if (Math.abs(depth1 - depth2) > 1) {
            isBalance = false;
        }
        return depth1 > depth2 ? depth1 + 1 : depth2 + 1;
    }
}
