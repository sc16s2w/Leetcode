package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Definition for a Node.

public class Code_429 {
    private class Node {
        public int val;
        public List<com.company.BinaryTree.Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<com.company.BinaryTree.Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<Node> store = new LinkedList<>();
        store.add(root);
        while(!store.isEmpty()){
            int len = store.size();
            List<Integer> temp = new LinkedList<>();
            while(len>0){
                Node cur = store.poll();
                temp.add(cur.val);
                if(cur.children!=null){
                    for (Node ch: cur.children){
                        store.add(ch);
                    }
                }
                len--;
            }
            result.add(temp);
        }
        return result;

    }
}
