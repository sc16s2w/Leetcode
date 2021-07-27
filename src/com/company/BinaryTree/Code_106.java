package com.company.BinaryTree;

public class Code_106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildbinary(inorder,0,inorder.length,postorder,0, postorder.length);
    }

    public TreeNode buildbinary(int[] inorder, int inLeft, int inRight,int[] postorder, int postLeft, int postRight){
        if((inRight-inLeft)==0) return null;
        if((inRight-inLeft) == 1) return new TreeNode(inorder[inLeft]);
        int rootVal = postorder[postRight-1];
        TreeNode root = new TreeNode(rootVal);
        int index = 0;
        for(int i = 0;i<inRight;i++){
            if(inorder[i] == rootVal) index = i;
        }
        root.left = buildbinary(inorder,inLeft,index,postorder,postLeft,postLeft+(index-inLeft));
        root.right = buildbinary(inorder,index+1,inRight,postorder,postLeft+(index-inLeft),postRight-1);
        return root;
    }
}
