package com.company.BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Code_235 {
    HashMap<TreeNode,TreeNode> store = new HashMap<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        preorder(root);
        List<TreeNode> result_p = new LinkedList<>();
        List<TreeNode> result_q = new LinkedList<>();
        // System.out.println(store.size());
        result_p.add(p);
        result_q.add(q);
        while(store.containsKey(p)){
            result_p.add(store.get(p));
            p = store.get(p);
        }
        while(store.containsKey(q)){
            result_q.add(store.get(q));
            q = store.get(q);
        }
        // System.out.println(result_p.toString());
        // System.out.println(result_q.toString());
        for(int i = 0;i<result_p.size();i++){
            if(result_q.contains(result_p.get(i))) return result_p.get(i);
        }
        return null;


    }
    public void preorder(TreeNode cur){
        if(cur == null) return;
        if(cur.left!=null) store.put(cur.left,cur);
        if(cur.right!=null) store.put(cur.right,cur);
        preorder(cur.left);
        preorder(cur.right);
    }
}
