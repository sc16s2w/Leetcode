package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class Code_116 {
    public Node connect(Node root) {
        Queue<Node> store = new LinkedList<>();
        if(root==null) return null;
        store.add(root);
        while(!store.isEmpty()){
            int len = store.size();
            while(len>0){
                Node cur = store.poll();
                if(len == 1) cur.next = null;
                else{
                    Node temp = store.peek();
                    cur.next = temp;
                }
                if(cur.left!=null) store.add(cur.left);
                if(cur.right!=null) store.add(cur.right);
                len--;
            }
        }
        return root;

    }
}
