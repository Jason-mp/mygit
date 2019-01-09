package com.algorithm.offerday;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @Author xp
 * @Date: 2019-01-09
 */
public class PrintFromTopToBottom {

    /**
     * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
     *
     * 思路：广度优先遍历，使用队列来存储，
     * 1. 初始化一个队列，并把根结点入列队；
     * 2. 当队列为非空时，循环执行步骤3到步骤5，否则执行6；
     * 3. 出队列取得一个结点，访问该结点；
     * 4. 若该结点的左子树为非空，则将该结点的左子树入队列；
     * 5. 若该结点的右子树为非空，则将该结点的右子树入队列；
     * 6. 结束。
     */

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() != 0) {
            TreeNode temp = queue.remove();
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            list.add(temp.val);

        }
        return list;
    }
}
