package com.company.LinkedList;

import java.util.HashSet;

/**
 *  给定两个（单向）链表，判定它们是否相交并返回交点。请注意相交的定义基于节点的引用，而不是基于节点的值。
 *  换句话说，如果一个链表的第k个节点与另一个链表的第j个节点是同一节点（引用完全相同），则这两个链表相交。。
 */
//判断链表是否有相同节点
public class Code_0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> store = new HashSet<>();
        ListNode p1 =  headA;
        ListNode p2 = headB;
        while(p1!=null){
            store.add(p1);
            p1 = p1.next;
        }
        while(p2!=null){
            if(store.contains(p2)){
                return p2;
            }
            p2 = p2.next;
        }
        return null;
    }

}
