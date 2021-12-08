package com.company.daily;


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
public class Code_563 {
    int result = 0;
    public int findTilt(TreeNode root) {
        postOrder(root);
        return result;
    }
    public void postOrder(TreeNode root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        if(root.left==null&&root.right!=null){
            root.val = root.val+root.right.val;
            result +=Math.abs(root.right.val);
        }
        else if(root.right==null&&root.left!=null){
            root.val = root.val+root.left.val;
            result+= Math.abs(root.left.val);
        }
        else if(root.left!=null&&root.right!=null){
            root.val = root.left.val+root.right.val+root.val;
            result+=Math.abs(root.left.val-root.right.val);
        }
    }
}
