package com.algorithm.offerday;

/**
 * @Author xp
 * @Date: 2019-01-12
 */
public class RandomListNode {

    /**
     * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
     * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
     * <p>
     * 思路：
     * 1. 为每个节点copy一份，成为兄弟节点
     * 2. 重新遍历，为兄弟节点赋值random，A1->random = A.random.next
     * 3. 拆分成两个一模一样的链表
     */

    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode current = pHead;
        while (current != null) {
            RandomListNode cloneNode = new RandomListNode(current.label);
            cloneNode.next = current.next;
            current.next = cloneNode;
            current = current.next.next;
        }
        current = pHead;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        current = pHead;
        //复制新链表表头
        RandomListNode cloneHead = pHead.next;
        while (current != null) {
            RandomListNode cloneNode = current.next;
            current.next = cloneNode.next;
            if (cloneNode.next != null) {
                cloneNode.next = cloneNode.next.next;
            }

            current = current.next;
        }

        return cloneHead;
    }
}


