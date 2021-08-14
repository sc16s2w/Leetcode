package com.company.bytedance;


import java.util.*;

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

public class Code_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        int height = 0;
        while(!store.isEmpty()){
            int len = store.size();
            List<Integer> levelResult = new ArrayList<>();
            while(len>0){
                TreeNode temp = store.poll();
                levelResult.add(temp.val);
                if(temp.left!=null) store.add(temp.left);
                if(temp.right!=null) store.add(temp.right);
                len--;
            }
            if(height%2!=0){
                Collections.reverse(levelResult);
                result.add(levelResult);
            }
            else{
                result.add(levelResult);
            }
            height++;
        }
        return result;

    }
}
