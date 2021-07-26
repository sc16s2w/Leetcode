package com.company.BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Code_671 {
    HashSet<Integer> res = new HashSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        find(root);
        List<Integer> result = new ArrayList<>();
        result.addAll(res);
        Collections.sort(result);
        if(result.size()<2) return -1;
        return result.get(1);

    }
    public void find(TreeNode cur){
        if(cur == null) return;
        if(cur.left == null && cur.right == null) res.add(cur.val);
        else res.add(Math.min(cur.left.val,cur.right.val));
        find(cur.left);
        find(cur.right);
    }
}
