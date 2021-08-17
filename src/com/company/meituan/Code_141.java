package com.company.meituan;

import java.util.HashSet;

class ListNode {
      int val;
      ListNode next;
     ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class Code_141 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> store = new HashSet<>();
        while(head!=null){
            if(store.contains(head)) return true;
            else store.add(head);
            head = head.next;
        }
        return false;
    }
}
