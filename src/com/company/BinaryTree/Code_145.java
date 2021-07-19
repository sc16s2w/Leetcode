package com.company.BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Code_145 {
    List<Integer> store = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return store;

    }
    public void postorder(TreeNode cur){
        if(cur == null) return;
        else{
            postorder(cur.left);
            postorder(cur.right);
            store.add(cur.val);
        }
    }
    public List<Integer> postorderTraversal_2nd(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> store = new Stack<>();
        store.push(root);
        while(!store.isEmpty()){
            TreeNode cur = store.pop();
            result.add(cur.val);
            if(cur.left!=null){
                store.push(cur.left);
            }
            if(cur.right!=null){
                store.push(cur.right);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
