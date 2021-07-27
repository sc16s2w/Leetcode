package com.company.BinaryTree;

public class Code_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {//3.递归终止条件
            return null;
        }
        if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else{
            if(root.left == null&&root.right == null) return null;
            else if(root.left==null){
                root.val = RightMin(root);
                root.right = deleteNode(root.right, root.val);
            }
            else{
                root.val = LeftMax(root);
                root.left = deleteNode(root.left, root.val);
            }
        }
        return root;
    }

    public int LeftMax(TreeNode root){
        root = root.left;
        while(root.right!=null){
            root = root.right;
        }
        return root.val;
    }

    public int RightMin(TreeNode root){
        root = root.right;
        while(root.left!=null){
            root = root.left;
        }
        return root.val;
    }
}
