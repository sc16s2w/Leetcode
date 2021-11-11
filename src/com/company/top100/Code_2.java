package com.company.top100;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Code_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode dummy = new ListNode();
        ListNode head = new ListNode();
        dummy.next = head;
        int carrier = 0;
        while(p!=null&&q!=null){
            int sum = p.val+q.val+carrier;
            if(sum>9){
                sum = sum-10;
                carrier = 1;
            }
            else carrier = 0;
            ListNode temp = new ListNode(sum);
            head.next = temp;
            head = head.next;
            p = p.next;
            q =q.next;
        }
        while(p!=null){
            int sum = p.val+carrier;
            if(sum>9){
                sum = sum-10;
                carrier = 1;
            }
            else carrier = 0;
            ListNode temp = new ListNode(sum);
            head.next = temp;
            head = head.next;
            p = p.next;
        }
        while(q!=null){
            int sum = q.val+carrier;
            if(sum>9){
                sum = sum-10;
                carrier = 1;
            }
            else carrier = 0;
            ListNode temp = new ListNode(sum);
            head.next = temp;
            head = head.next;
            q = q.next;
        }
        if(carrier!=0){
            ListNode temp = new ListNode(carrier);
            head.next = temp;
        }
        return dummy.next.next;

    }
}
