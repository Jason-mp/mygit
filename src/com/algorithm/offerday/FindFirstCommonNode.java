package com.algorithm.offerday;

/**
 * @Author xp
 * @Date：2019-02-22
 */
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int length1 = getLength(pHead1);
        int length2 = getLength(pHead2);
        if (length1 > length2) {
            pHead1 = walkLength(pHead1, length1 - length2);
        } else {
            pHead2 = walkLength(pHead2, length2 - length1);
        }
        while (pHead1 != null) {
            if (pHead1 == pHead2) {
                return pHead1;
            }
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }

        return null;
    }
    public int getLength(ListNode pHead) {
        if (pHead == null) {
            return 0;
        }
        int length = 1;
        while ((pHead = pHead.next) != null) {
            length++;
        }
        return length;
    }
    public ListNode walkLength(ListNode pHead, int length) {
        while ((length--) > 0) {
            pHead = pHead.next;
        }
        return pHead;
    }

}
