package com.algorithm.offerday;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author xp
 * @Date：2019-02-23
 */
public class TreeDepth {
    /**
     * 题目描述：输入一棵二叉树，求该树的深度。
     * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度
     * <p>
     * 思路：
     * 最长路径=max(左子树的深度+1,右子树的深度+1)，可递归实现
     */
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(TreeDepth(root.left) + 1, TreeDepth(root.right) + 1);

    }

    public int TreeDepthForLayer(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int depth = 0, count = 0, nextCount = 1;
        while (!queue.isEmpty()) {
            TreeNode top = queue.poll();
            count++;
            if (top.left != null) {
                queue.add(top.left);
            }
            if (top.right != null) {
                queue.add(top.right);
            }
            if (count == nextCount) {
                nextCount = queue.size();
                count = 0;
                depth++;
            }
        }
        return depth;
    }
}
