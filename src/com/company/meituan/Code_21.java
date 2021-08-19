package com.company.meituan;

public class Code_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode dummy = new ListNode(0);
        ListNode temp = l1;
        dummy.next = temp;
        if(l1==null&&l2==null) return null;
        while(p!=null&&q!=null){
            if(p.val<q.val){
                temp.next = p;
                p = p.next;
            }
            else{
                temp.next=q;
                q=q.next;
            }
            temp=temp.next;
        }
        while(p!=null){
            temp.next = p;
            p = p.next;
        }
        while(q!=null){
            temp.next = q;
            q=q.next;
        }
        return dummy.next.next;
    }
}
