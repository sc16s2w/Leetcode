package com.company.daily;

public class Code_876 {
    public ListNode middleNode(ListNode head) {
        ListNode p = head;
        int count = 0;
        while(p!=null){
            p = p.next;
            count++;
        }
        count = count/2;
        for(int i = 0;i<count;i++){
            head = head.next;
        }
        return head;
    }
}
