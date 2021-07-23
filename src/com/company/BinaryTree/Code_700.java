package com.company.BinaryTree;

public class Code_700 {
    TreeNode result = null;
    public TreeNode searchBST(TreeNode root, int val) {
        preorder(root,val);
        return result;
    }
    void preorder(TreeNode cur,int val){
        if(cur == null) return;
        if(cur.val == val) result = cur;
        preorder(cur.left,val);
        preorder(cur.right,val);
    }
    //用二叉树的特有办法做
    public TreeNode searchbinary(TreeNode root,int val){
        if(root==null||root.val == val){
            return root;
        }
        if(root.val>val){
            return searchBST(root.left,val);
        }
        else{
            return searchbinary(root.right,val);
        }
    }
}
