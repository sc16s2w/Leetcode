package com.company.BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root==null) return result;
        Queue<TreeNode> store = new LinkedList<>();
        HashMap<Integer,TreeNode> temp = new HashMap<>();
        store.add(root);
        int level = 0;
        while(!store.isEmpty()){
            TreeNode cur = store.poll();
            int len = store.size();
            while(len>0){
                temp.put(level,cur);
                if(cur.right!=null) store.add(cur.right);
                if(cur.left!=null) store.add(cur.right);
                len--;
            }
            result.add(temp.get(level).val);
            level++;
        }
        return result;


    }
}
