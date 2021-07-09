package com.company.LinkedList;

import java.util.HashSet;

/**
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 */
public class Code_142 {
    //尝试hashset
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        HashSet<ListNode> store = new HashSet<>();
        while (temp!=null){
            if(store.contains(temp)){
                return temp;
            }
            store.add(temp);
            temp = temp.next;
        }
        return null;
    }
    //快慢指针，节约空间复杂度
    //有一个发现的道理 就是可以一个指针的后面事空的，但不能空去指空
    public ListNode detectCycle_2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            // 两个指针，从头结点和相遇结点，各走一步，直到相遇，相遇点即为环入口
            if(fast == slow){
              ListNode temp1 = fast;
              ListNode temp2 = head;
              while (temp1!=temp2){
                  temp1 = temp1.next;
                  temp2 = temp2.next;
              }
              return temp1;
            }

        }
        return null;
    }
}
