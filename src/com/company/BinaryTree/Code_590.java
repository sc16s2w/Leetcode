package com.company.BinaryTree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Code_590 {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new LinkedList<>();
        if(root == null) return result;
        Stack<Node> store = new Stack<>();
        store.push(root);
        while(!store.isEmpty()){
            Node cur = store.pop();
            result.add(cur.val);
            if(cur.children!=null){
                for(Node ch:cur.children){
                    store.push(ch);
                }
            }
        }
        Collections.reverse(result);
        return result;

    }
}
