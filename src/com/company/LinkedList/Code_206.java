package com.company.LinkedList;

/**
 *给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
//用一个临时节点存current。next，注意最后的返回值
public class Code_206 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

}
