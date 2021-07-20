package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class Code_104 {
    //层序遍历数他有几层？
    public int maxDepth(TreeNode root) {
        int maxdepth = 1;
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        while(!store.isEmpty()){
            int len = store.size();
            while(len>0){
                TreeNode cur = store.poll();
                if(cur.left!=null) store.add(cur.left);
                if(cur.right!=null) store.add(cur.right);
            }
            maxdepth++;
        }
        return maxdepth;

    }
}
