package com.company.bytedance;


class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class Code_216 {
    //迭代
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
    //递归也要写出来
    public ListNode reverseList_2nd(ListNode head){
        return recursion(null,head);
    }
    public ListNode recursion(ListNode pre,ListNode cur){
        if(cur == null) return pre;
        ListNode next = cur.next;
        cur.next = pre;
        return recursion(cur,next);
    }
}
