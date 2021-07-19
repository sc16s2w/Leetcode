package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new LinkedList<>();
        if(root==null) return result;
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        while(!store.isEmpty()){
            int len = store.size();
            int temp = len;
            double sum = 0;
            while(len>0){
                TreeNode cur = store.poll();
                sum+=cur.val;
                if(cur.left!=null)  store.add(cur.left);
                if(cur.right!=null) store.add(cur.right);
                len--;
            }
            result.add(sum/temp);
        }
        return result;

    }
}
