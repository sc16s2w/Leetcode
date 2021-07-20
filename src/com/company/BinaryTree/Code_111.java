package com.company.BinaryTree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code_111 {
    public int minDepth(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        int level = 0;
        if(root==null) return level;
        while(!store.isEmpty()){
            int len = store.size();
            while(len>0){
                TreeNode cur = store.poll();
                if(cur.left==null&&cur.right==null) result.add(level);
                if(cur.left!=null) store.add(cur.left);
                if(cur.right!=null) store.add(cur.right);
                len--;
            }
            level++;
        }
        int mindepth = Collections.min(result);
        return mindepth;


    }
}
