package com.company.LinkedList;

//definition of listnode
//一定要记住listnode是怎么写的
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/**
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */
//用一个虚拟节点来充当头节点，这样方便将头节点加入循环中遍历
public class Code_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = head;
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy;
        if (head == null) return head;
        if (head.val == val) head = head.next;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
