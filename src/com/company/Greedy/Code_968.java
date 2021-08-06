package com.company.Greedy;

import java.util.LinkedList;
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
public class Code_968 {
    public int minCameraCover(TreeNode root) {
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        int height = 0;
        int minCamera = 0;
        while(!store.isEmpty()){
            int len = store.size();
            height++;
            if(height%2==0) minCamera+=len;
            while(len>0){
                TreeNode cur = store.poll();
                if(cur.left!=null) store.add(cur.left);
                if(cur.right!=null) store.add(cur.right);
                len--;
            }
        }
        return minCamera;
    }
}
