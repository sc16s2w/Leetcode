package com.company.Ali;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
 }

public class Code_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> store = new Stack<>();
        store.add(root);
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        while(!store.isEmpty()){
            TreeNode cur = store.pop();
            result.add(cur.val);
            if(cur.right!=null) store.add(cur.right);
            if(cur.left!=null) store.add(cur.left);
        }
        return result;

    }
}
