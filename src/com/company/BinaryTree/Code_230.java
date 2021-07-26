package com.company.BinaryTree;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Code_230 {
    List<Integer> store = new LinkedList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        Collections.sort(store);
        int kthSmallest = store.get(k-1);
        return kthSmallest;
    }

    public void inorder(TreeNode cur){
        if(cur == null) return;
        inorder(cur.left);
        store.add(cur.val);
        inorder(cur.right);

    }
}
