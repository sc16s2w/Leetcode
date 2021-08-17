package com.company.bytedance;

import java.util.ArrayList;
import java.util.List;

public class Code_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;
        ListNode pre = head;
        for(int i = 0;i<left;i++){
            pre = pre.next;
        }
        ListNode leftnode = pre.next;
        ListNode preReverse = null;
        ListNode next = null;
        for(int i = left;i<=right;i++){
            next = leftnode.next;
            leftnode.next = preReverse;
            preReverse = leftnode;
            leftnode = next;
        }
        pre.next = preReverse;
        leftnode.next = next;
        return head;
        }
}
