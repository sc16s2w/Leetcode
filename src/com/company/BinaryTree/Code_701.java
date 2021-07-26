package com.company.BinaryTree;

/**
 * 给定二叉搜索树（BST）的根节点和要插入树中的值，
 * 将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。
 * 输入数据 保证 ，新值和原始二叉搜索树中的任意节点值都不同
 */
public class Code_701 {
    //其实就是找到一个空节点插进去
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        TreeNode p = root;
        TreeNode q = root;
        while(p!=null){
            q = p;
            if(p.val>val){
                p = p.left;
            }
            else{
                p = p.right;
            }
        }
        TreeNode node = new TreeNode(val);
        if(q.val<val){
            q.right = node;
        }
        else{
            q.left = node;

        }
        return root;

    }
}
