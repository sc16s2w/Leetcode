package com.company.LinkedList;

public class Code_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode dummy = new ListNode(1);
        ListNode result = dummy;
        if(l1==null&&l2==null) return null;
        if(l2==null) return l1;
        while(p!=null&&q!=null){
            if(p.val>q.val){
                dummy.next = q;
                q=q.next;
            }
            else{
                dummy.next = p;
                p = p.next;
            }
            dummy = dummy.next;
        }
        while(p != null){
            dummy.next = p;
            p = p.next;
            dummy = dummy.next;
        }
        while(q != null){
            dummy.next = q;
            q = q.next;
            dummy = dummy.next;
        }
        return result.next;

    }
}
