package com.company.BinaryTree;

public class Code_617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode result = inorder(root1,root2);
        return result;
    }
    public TreeNode inorder(TreeNode p, TreeNode q){
        TreeNode cur;
        if(p == null) return q;
        if(q == null) return p;
        cur = new TreeNode(p.val+ q.val);
        cur.left = inorder(p.left,q.left);
        cur.right = inorder(p.right,q.right);
        return cur;
    }
}
