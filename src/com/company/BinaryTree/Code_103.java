package com.company.BinaryTree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）
 */
public class Code_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        List<List<Integer>> result = new LinkedList<>();
        if(root == null) return result;
        int level = 0;
        while(!store.isEmpty()){
            int len = store.size();
            level++;
            List<Integer> temp = new LinkedList<>();
            while(len>0){
                TreeNode cur = store.poll();
                temp.add(cur.val);
                if(cur.left!=null) store.add(cur.left);
                if(cur.right!=null) store.add(cur.right);
                len--;
            }
            if(level%2==0) Collections.reverse(temp);
            result.add(temp);
        }
        return result;

    }
}

