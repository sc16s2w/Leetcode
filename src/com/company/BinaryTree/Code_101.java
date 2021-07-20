package com.company.BinaryTree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 */
public class Code_101 {
    List<Integer> pre = new LinkedList<>();
    List<Integer> post = new LinkedList<>();
    public boolean isSymmetric(TreeNode root) {
        preorder(root);
        postorder(root);
        Collections.reverse(post);
        for(int i = 0;i<pre.size();i++){
            if(pre.get(i)!=post.get(i))
                return false;
        }
        return true;

    }
    public void preorder(TreeNode cur){
        if(cur == null){
            pre.add(null);
            return;
        }
        pre.add(cur.val);
        preorder(cur.left);
        preorder(cur.right);
    }
    public void postorder(TreeNode cur){
        if(cur == null){
            post.add(null);
            return;
        }
        postorder(cur.left);
        postorder(cur.right);
        post.add(cur.val);
    }
}
