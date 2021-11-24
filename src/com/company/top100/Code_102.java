package com.company.top100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        while(!store.isEmpty()){
            int size = store.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0;i<size;i++){
                TreeNode temp = store.poll();
                level.add(temp.val);
                if(temp.left!=null) store.add(temp.left);
                if(temp.right!=null) store.add(temp.right);
            }
            result.add(level);
        }
        return result;
    }
}
