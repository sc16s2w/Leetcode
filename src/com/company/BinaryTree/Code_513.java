package com.company.BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Code_513 {
    /**
     * 给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。
     * 假设二叉树中至少有一个节点。
     * @param root
     * @return
     */
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        HashMap<Integer,Integer> temp = new HashMap<>();
        int level = 0;
        while(!store.isEmpty()){
            int len = store.size();
            level++;
            while(len>0){
                TreeNode cur = store.poll();
                if(!temp.containsKey(level)){
                    temp.put(level,cur.val);
                }
                if(cur.left!=null) store.add(cur.left);
                if(cur.right!=null) store.add(cur.right);
                len--;
            }
        }
        return temp.get(level);


    }

}
