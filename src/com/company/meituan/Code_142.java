package com.company.meituan;

public class Code_142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode temp1 = fast;
                ListNode temp2= head;
                while(temp1!=temp2){
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
                return temp1;

            }
        }
        return null;
    }
}
