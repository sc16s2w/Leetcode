package com.company.top100;

public class Code_543 {
    int depth = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        postOrder(root);
        return depth-1;
    }

    private int postOrder(TreeNode root) {
        if(root==null) return 0;
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        depth = Math.max(depth,right+left+1);
        return Math.max(left,right)+1;
    }
}
