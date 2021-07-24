package com.company.BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Code_113 {
    /**
     * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
     * 叶子节点 是指没有子节点的节点
     * @param root
     * @param targetSum
     * @return
     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res; // 非空判断

        List<Integer> path = new LinkedList<>();
        preorderDFS(root, targetSum, res, path);
        return res;
    }

    public void preorderDFS(TreeNode root, int targetSum, List<List<Integer>> res, List<Integer> path) {
        path.add(root.val);
        // 遇到了叶子节点
        if (root.left == null && root.right == null) {
            // 找到了和为 targetSum 的路径
            if (targetSum - root.val == 0) {
                res.add(new ArrayList<>(path));
            }
            return; // 如果和不为 targetSum，返回
        }

        if (root.left != null) {
            preorderDFS(root.left, targetSum - root.val, res, path);
            path.remove(path.size() - 1); // 回溯
        }
        if (root.right != null) {
            preorderDFS(root.right, targetSum - root.val, res, path);
            path.remove(path.size() - 1); // 回溯
        }
    }
}
