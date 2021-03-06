package com.company.BinaryTree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code_515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root==null) return result;
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        while(!store.isEmpty()){
            List<Integer> temp = new LinkedList<>();
            int len = store.size();
            while(len>0){
                TreeNode cur = store.poll();
                temp.add(cur.val);
                if(cur.left!=null) store.add(cur.left);
                if(cur.right!=null) store.add(cur.right);
                len--;
            }
            result.add(Collections.max(temp));
        }
        return result;
    }

}
