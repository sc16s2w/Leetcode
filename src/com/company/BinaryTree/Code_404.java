package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Code_404 {
    /**
     * 计算给定二叉树的所有左叶子之和。
     * @param root
     * @return
     */
    public int sumOfLeftLeaves(TreeNode root) {
        int result = 0;
        if(root==null) return result;
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        while(!store.isEmpty()){
            int len = store.size();
            while(len>0){
                TreeNode cur = store.poll();
                if(cur.left!=null){
                    // System.out.println(cur.left.val);
                    if(cur.left.left==null&&cur.left.right==null){
                        result += cur.left.val;
                    }
                    store.add(cur.left);
                }
                if(cur.right!=null) store.add(cur.right);
                len--;
            }
        }
        return result;

    }


}
