package com.algorithm.offerday;

/**
 * @Author xp
 * @Date: 2019-01-08
 */
public class ReverseList {
    //输入一个链表，反转链表后，输出新链表的表头。
    public ListNode ReverseList(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode pre = null;
        ListNode next = null;
        while (null != head) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("naannnasd");
        System.out.println(sb.reverse());
    }
}
