//package com.company.BinaryTree;
//
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Stack;
//
//
//public class Code_589 {
//    //递归解法
//    // Definition for a Node.
//    List<Integer> store = new LinkedList<>();
//    public List<Integer> preorder(Node root) {
//        preorder_recur(root);
//        return store;
//
//    }
//    void preorder_recur(Node cur){
//        if(cur == null) return;
//        store.add(cur.val);
//        for (Node ch:cur.children
//             ) {
//            preorder(ch);
//        }
//    }
//    //非递归解法
//    public List<Integer> preorder_2nd(Node root) {
//        List<Integer> result = new LinkedList<>();
//        if(root==null) return result;
//        Stack<Node> store = new Stack<>();
//        store.push(root);
//        while(!store.isEmpty()){
//            Node cur = store.pop();
//            result.add(cur.val);
//            if(cur.children!=null){
//                for(int i = cur.children.size()-1;i>=0;i--){
//                    store.push(cur.children.get(i));
//                }
//            }
//        }
//        return result;
//    }
//
//}
