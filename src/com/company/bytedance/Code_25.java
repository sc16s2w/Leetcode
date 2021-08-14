package com.company.bytedance;

import java.util.ArrayList;
import java.util.List;

public class Code_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        //先用一个循环来数长度
        ListNode p = head;
        int height = 0;
        while(p!=null){
            height++;
            p=p.next;
        }
        int m = height/k;
        int n = m;
        ListNode cur = head;
        ListNode result = null;
        List<ListNode> store = new ArrayList<>();
        store.add(cur);
        while(n>0){
            ListNode tail = store.get(0);
            store = reverse(cur,k);
            if(n==m){
                result = store.get(1);
            }
            tail.next = store.get(1);
            cur = store.get(2);
            n--;
        }
        store.get(0).next = store.get(2);
        return result;

    }
    //一个函数反转
    public List<ListNode> reverse(ListNode cur,int k){
        List<ListNode> result = new ArrayList<>();
        ListNode pre =null;
        result.add(cur);
        while(k>0){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            k--;
        }
        result.add(pre);
        result.add(cur);
        return result;
    }
}
