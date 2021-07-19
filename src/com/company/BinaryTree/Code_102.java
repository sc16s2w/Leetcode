package com.company.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        while(!store.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int len = store.size();
            while(len>0){
                TreeNode cur = store.poll();
                temp.add(cur.val);
                if(cur.left!=null) store.add(cur.left);
                if(cur.right!=null) store.add(cur.right);
                len--;
            }
            result.add(temp);
        }
        return result;

    }
}
