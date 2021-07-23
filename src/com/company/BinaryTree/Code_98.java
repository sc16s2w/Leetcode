package com.company.BinaryTree;

import java.util.ArrayList;

/**
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * 假设一个二叉搜索树具有如下特征：
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 */
public class Code_98 {
    ArrayList<Integer> result = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for(int i = 0;i<result.size()-1;i++){
            if(result.get(i)>=result.get(i+1)){
                return false;
            }
        }
        return true;

    }

    public void inorder(TreeNode cur){
        if(cur==null) return;
        inorder(cur.left);
        result.add(cur.val);
        inorder(cur.right);
    }
}
