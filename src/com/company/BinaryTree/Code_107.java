package com.company.BinaryTree;

import java.util.*;

public class Code_107 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root==null) return result;
        Queue<TreeNode> store = new LinkedList<>();
        HashMap<Integer,TreeNode> temp = new HashMap<>();
        store.add(root);
        int level = 0;
        while(!store.isEmpty()){
            int len = store.size();
            while(len>0){
                TreeNode cur = store.poll();
                temp.put(level,cur);
                if(cur.left!=null) store.add(cur.left);
                if(cur.right!=null) store.add(cur.right);
                len--;
            }
            result.add(temp.get(level).val);
            level++;
        }
        return result;


    }


}
