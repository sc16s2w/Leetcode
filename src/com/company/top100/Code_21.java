package com.company.top100;

public class Code_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p = list1;
        ListNode q = list2;
        ListNode dummy = new ListNode(0);
        ListNode temp = new ListNode(0);
        dummy.next = temp;
        while(p!=null&&q!=null){
            if(p.val< q.val){
                ListNode t = new ListNode(p.val);
                temp.next = t;
                p = p.next;
            }
            else{
                ListNode t = new ListNode(q.val);
                temp.next = t;
                q= q.next;
            }
            temp = temp.next;
        }
        while(p!=null){
            temp.next = p;
            temp = temp.next;
            p = p.next;
        }
        while(q!=null){
            temp.next = q;
            temp = temp.next;
            q = q.next;
        }
        return dummy.next.next;
    }
}
