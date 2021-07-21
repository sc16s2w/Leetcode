package com.company.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 */
//用常规前序遍历
public class Code_257 {
    List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        preorder(root,new StringBuilder());
        return result;

    }

    public void preorder(TreeNode cur,StringBuilder sb){
        if(cur == null) return;
        if(cur.left==null&&cur.right==null){
            sb.append(cur.val);
            result.add(sb.toString());
        }
        preorder(cur.left,new StringBuilder(sb).append(cur.val+"->"));
        preorder(cur.right,new StringBuilder(sb).append(cur.val+"->"));
    }


}
