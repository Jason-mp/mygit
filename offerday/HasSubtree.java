package com.algorithm.offerday;

/**
 * @Author xp
 * @Date: 2018/12/24
 */

public class HasSubtree {
    //17.树的子结构
    //输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean isSub = false;

        if (root1 != null || root2 != null) {
            if (root1.val == root2.val) {
                isSub = isSubTree(root1, root2);
            }
            if (!isSub) {
                isSub = HasSubtree(root1.left, root2);
            }
            if (!isSub) {
                isSub = HasSubtree(root1.right, root2);
            }
        }
        return isSub;
    }

    public boolean isSubTree(TreeNode root1,TreeNode root2) {
        if (root1 == null && root2 != null) {
            return false;
        }
        if (root2 == null) {
            return true;
        }
        if(root1.val != root2.val) return false;
        return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);

    }
}
