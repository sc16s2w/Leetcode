package com.company.bytedance;

public class Code_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return null;
        ListNode p = head;
        ListNode pre = null;
        while(p.val!=left){
            pre = p;
            p = p.next;
        }
        ListNode pre_now = null;
        while(p.val!=right){
            ListNode next = p.next;
            p.next = pre_now;
            pre_now = p;
            p = next;
        }
        pre.next = pre_now;
        return head;
    }
}
