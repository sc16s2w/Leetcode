package com.company.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Code_94 {
    List<Integer> store = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return store;

    }
    public void inorder(TreeNode cur){
        if(cur == null) return;
        else{
            inorder(cur.left);
            store.add(cur.val);
            inorder(cur.right);
        }
    }
    public List<Integer> inorderTraversal_2nd(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> store = new Stack<>();
        TreeNode cur = root;
        while(cur!=null||!store.isEmpty()){
            if(cur!=null){
                store.push(cur);
                cur = cur.left;
            }
            else{
                cur = store.pop();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;

    }
}
