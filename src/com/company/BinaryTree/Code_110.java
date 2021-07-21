package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 */
public class Code_110 {
    //非迭代法，遍历找每个树的深度
    public boolean isBalanced(TreeNode root) {
        Stack<TreeNode> store = new Stack<>();
        if(root == null) return true;
        store.push(root);
        while(!store.isEmpty()){
            TreeNode cur = store.pop();
            int depth_left = getDepth(cur.left);
            int depth_right = getDepth(cur.right);
            if(Math.abs(depth_left-depth_right)>1) return false;
            else{
                if(cur.right!=null) store.add(cur.right);
                if(cur.left!=null) store.add(cur.left);
            }
        }
        return true;
    }
    public int getDepth(TreeNode temp){
        int depth = 0;
        if(temp==null) return depth;
        Queue<TreeNode> store = new LinkedList<>();
        store.add(temp);
        while(!store.isEmpty()){
            depth++;
            int len = store.size();
            while(len>0){
                TreeNode cur = store.poll();
                if(cur.left!=null) store.add(cur.left);
                if(cur.right!=null) store.add(cur.right);
                len--;
            }
        }
        return depth;
    }
    //迭代法
    public boolean isBalanced_2nd(TreeNode root) {
        int result = getHeight(root);
        if(result==-1) return false;
        else return true;

    }
    public int getHeight(TreeNode temp){
        if(temp == null) return 0;
        int left_height = getHeight(temp.left);
        if(left_height == -1){
            return -1;
        }
        int right_height = getHeight(temp.right);
        if(right_height == -1){
            return -1;
        }
        if(Math.abs(right_height-left_height)>1) return -1;
        else{
            return 1+Math.max(left_height,right_height);
        }
    }
}
