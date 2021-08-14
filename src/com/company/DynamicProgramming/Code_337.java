package com.company.DynamicProgramming;


import javax.management.Query;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class Code_337 {
    //他妈的发现一个bug
    public int rob(TreeNode root) {
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        List<Integer> levelSum = new ArrayList<>();
        int level = 0;
        while(!store.isEmpty()){
            int sum = 0;
            int len = store.size();
            while(len>0){
                TreeNode temp = store.poll();
                sum+=temp.val;
                if(temp.left!=null) store.add(temp.left);
                if(temp.right!=null) store.add(temp.right);
                len--;
            }
            level++;
            levelSum.add(sum);
        }
        if(levelSum.size()==1) return levelSum.get(0);
        if(levelSum.size()==2) return Math.max(levelSum.get(0),levelSum.get(1));
        int[] dp = new int[levelSum.size()];
        dp[0] = levelSum.get(0);
        dp[1] = Math.max(levelSum.get(0),levelSum.get(1));
        for(int i = 2;i<levelSum.size();i++){
            dp[i] = Math.max(dp[i-2]+levelSum.get(i),dp[i-1]);
        }
        return dp[levelSum.size()-1];
    }
}
