package com.company.BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
 * 叶子节点 是指没有子节点的节点。
 */
public class Code_112 {
    ArrayList<Integer> result = new ArrayList<>();
    HashSet<TreeNode> visted = new HashSet<>();
    public boolean hasPathSum(TreeNode root, int targetSum) {
        getResult(root,0);
        if(result.contains(targetSum)){
            return true;
        }
        return false;

    }
    public void getResult(TreeNode cur, int sum){
        if(cur == null) return ;
        sum = sum+cur.val;
        if(cur.left==null&&cur.right==null){
            result.add(sum);
            sum = sum- cur.val;
            return;
        }
        else if(visted.contains(cur)){
            sum = sum-cur.val;
        }
        visted.add(cur);
        getResult(cur.left,sum);
        getResult(cur.right,sum);
    }
}
