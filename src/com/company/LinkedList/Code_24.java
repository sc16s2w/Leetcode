package com.company.LinkedList;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 */
//把这个循环想清楚
public class Code_24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        dummy.next = head;
        ListNode temp = dummy;
        while(temp.next!=null&&temp.next.next!=null){
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next=node2.next;
            node2.next = node1;
            temp = node1;
        }
        return dummy.next;

    }
}
