package com.algorithm.offerday;

/**
 * @Author xp
 * @Date: 2019-01-12
 */
public class Convert {
    /**
     * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
     */

    /*public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            return pRootOfTree;
        }


        return null;
    }*/

    /**
     * 中序遍历二叉搜索树
     * 得到的就是有序的数字列
     */

    TreeNode leftHead = null;
    TreeNode rightHead = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        Convert(pRootOfTree.left);
        if (rightHead == null) {
            leftHead = rightHead = pRootOfTree;
        } else {
            rightHead.right = pRootOfTree;
            pRootOfTree.left = rightHead;
            rightHead = pRootOfTree;
        }

        Convert(pRootOfTree.right);
        return leftHead;
    }
}
