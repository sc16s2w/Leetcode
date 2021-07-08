package com.company.LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class Code_19 {
    //用栈的解法，因为有一种情况是删除最末一个所以最好写个虚拟节点一起放进去
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> store = new Stack<ListNode>();
        ListNode dummy = new ListNode(0,head);
        ListNode temp = dummy;
        while(temp!=null){
            store.add(temp);
            temp = temp.next;
        }
        ListNode delete = head;
        for(int i = 0; i<=n;i++){
            delete = store.pop();
        }
        delete.next = delete.next.next;
        return dummy.next;
    }
    //删除n个节点还有一种做法是双指针

}
