package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Code_226 {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        while(!store.isEmpty()){
            int len = store.size();
            while(len>0){
                TreeNode cur = store.poll();
                if(cur.left!=null) store.add(cur.left);
                if(cur.right!=null) store.add(cur.right);
                TreeNode temp = cur.left;
                cur.left = cur.right;
                cur.right = temp;
                len--;
            }
        }
        return root;

    }

}
