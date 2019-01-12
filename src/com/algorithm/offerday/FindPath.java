package com.algorithm.offerday;

import java.util.ArrayList;

/**
 * @Author xp
 * @Date: 2019-01-10
 */
public class FindPath {
    /**
     * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
     * (注意: 在返回值的list中，数组长度大的数组靠前)
     * <p>
     * 思路：根据先序遍历，先找到到达叶子节点的路径，如果此时和==target，那么继续
     * 否则回退，然后把最后一个叶子节点删除
     * 总思想就是递归了
     */

    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        if (null == root) {
            return lists;
        }
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            lists.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1);
        return lists;

    }
}
