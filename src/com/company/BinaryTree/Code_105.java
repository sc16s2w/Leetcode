package com.company.BinaryTree;

public class Code_105 {
    /**
     * 给定一棵树的前序遍历 preorder 与中序遍历  inorder。请构造二叉树并返回其根节点。
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length,inorder,0,inorder.length);

    }
    public TreeNode build(int[] preorder, int preLeft, int preRight,int[] inorder,int inLeft, int inRight){
        if((inLeft-inRight) == 0) return null;
        if((inLeft-inRight)==1) return new TreeNode(inorder[inLeft]);
        int rootval = preorder[preLeft];
        TreeNode root = new TreeNode(rootval);
        int index = 0;
        for(int i = 0;i<inRight;i++){
            if(inorder[i] == rootval) index = i;
        }
        root.left = build(preorder,preLeft+1,preLeft+1+(index-inLeft),inorder,inLeft,index);
        root.right = build(preorder,preLeft+1+(index-inLeft),preRight,inorder,index+1,inRight);
        return root;
    }
}
