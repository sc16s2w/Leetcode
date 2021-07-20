package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Code_117 {
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
