package com.company.bytedance;

import java.util.HashSet;

public class Code_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> store = new HashSet<>();
        while(headA!=null){
            store.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(store.contains(headB)) return headB;
            headB=headB.next;
        }
        return null;

    }
}
