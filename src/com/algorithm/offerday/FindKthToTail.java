package com.algorithm.offerday;

public class FindKthToTail {
    //14.链表中倒数第k个结点
    //先让当前节点走K次，然后遍历到尾获取倒数第k个结点
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode tail = head;
        ListNode pre=head;
        for (int i = 0; i < k-1; i++) {
            if (tail.next != null) {
                tail = tail.next;
            }else {
                return null;
            }
        }
        while (tail.next != null) {
            tail = tail.next;
            pre = pre.next;
        }
        return pre;
    }
}
