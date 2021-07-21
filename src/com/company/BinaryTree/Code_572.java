package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Code_572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> store = new LinkedList<>();
        List<Integer> cur_store;
        List<Integer> subroot_store;
        store.add(root);
        Boolean result = true;
        while(!store.isEmpty()){
            int len = store.size();
            while(len>0){
                TreeNode cur = store.poll();
                if(cur.val == subRoot.val){
                    cur_store = new LinkedList<>();
                    subroot_store = new LinkedList<>();
                    preorder(cur,cur_store);
                    preorder(subRoot,subroot_store);
                    if(subroot_store.size()==0||cur_store.size()==0) result=false;
                    for(int i = 0;i<subroot_store.size();i++){
                        if(subroot_store.get(i)!=cur_store.get(i)){
                            result = false;
                        }
                    }
                }
                if(cur.left!=null) store.add(cur.left);
                if(cur.right!=null) store.add(cur.right);
                len--;
            }
        }

        return result;
    }
    public void preorder(TreeNode cur, List<Integer> store){
        if(cur == null){
            store.add(null);
            return;
        }
        store.add(cur.val);
        preorder(cur.left,store);
        preorder(cur.right,store);

    }
}
