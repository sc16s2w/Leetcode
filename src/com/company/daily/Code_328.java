package com.company.daily;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Code_328 {
    /**
     * 解题思路是拆成两个链表，奇链表和偶链表，然后奇数和偶数相连接。
     * @param head
     * @return
     */
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode p = head;
        ListNode q = head.next;
        ListNode dummy = new ListNode(0,head);
        ListNode dummy2 = new ListNode(0,head.next);
        while(q!=null&&q.next!=null){
            p.next = p.next.next;
            q.next = q.next.next;
            p = p.next;
            q = q.next;
        }
        p.next = dummy2.next;
        return dummy.next;

    }
}
