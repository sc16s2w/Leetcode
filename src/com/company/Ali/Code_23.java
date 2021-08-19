package com.company.Ali;


import java.util.Collections;
import java.util.LinkedList;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Code_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null||lists.length<1) return null;
        if(lists.length==1) return lists[0];
        ListNode dummy = new ListNode();
        LinkedList<Integer> temp = new LinkedList<>();
        for(ListNode listNode:lists){
            while(listNode!=null){
                temp.add(listNode.val);
                listNode=listNode.next;
            }
        }
        Collections.sort(temp);
        if(temp==null||temp.size()<1) return null;
        ListNode start = new ListNode(temp.get(0));
        dummy.next = start;
        for(int i = 1;i<temp.size();i++){
            ListNode next = new ListNode(temp.get(i));
            start.next = next;
            start = next;
        }
        return dummy.next;
    }
}
