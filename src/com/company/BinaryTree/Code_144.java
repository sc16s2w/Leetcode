package com.company.BinaryTree;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Code_144 {
    //用递归法
    List<Integer> store = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return store;

    }
     public void preorder(TreeNode cur){
        if(cur == null) return;
        else{
            store.add(cur.val);
            preorder(cur.left);
            preorder(cur.right);
        }
     }
     //用非递归法
     public List<Integer> preorderTraversal_2nd(TreeNode root) {
         List<Integer> result = new ArrayList<>();
         if (root == null) return result;
         Stack<TreeNode> store = new Stack<>();
         store.push(root);
         while (!store.isEmpty()) {
             TreeNode cur = store.pop();
             result.add(cur.val);
             if (cur.right != null) {
                 store.add(cur.right);
             }
             if (cur.left != null) {
                 store.add(cur.left);
             }
         }
         return result;
     }


}

