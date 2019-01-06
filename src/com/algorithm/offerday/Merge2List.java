package com.algorithm.offerday;

/**
 * @Author xp
 * @Date: 2018/12/24
 */

public class Merge2List {
    //16.输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode node = null;
        ListNode head = null;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                if (head == null) {
                    head = node = list2;
                }else {
                    node.next = list2;
                    node = node.next;
                }
                list2 = list2.next;
            } else {
                if (head == null) {
                    head = node = list1;
                }else {
                    node.next = list1;
                    node = node.next;
                }
                list1 = list1.next;
            }
        }
        if (list1 == null) {
            node.next = list2;
        }else {
            node.next = list1;
        }

        return head;
    }
}
