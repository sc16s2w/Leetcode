package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.List;

/**
 * 给你一棵 完全二叉树 的根节点 root ，求出该树的节点个数。
 *
 * 完全二叉树 的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，
 * 并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，则该层包含 1~2的h次方个节点。
 *
 */
public class Code_222 {
    //先序遍历数一遍
    List<Integer> store = new LinkedList<>();
    public int countNodes(TreeNode root) {
        preorder(root);
        return store.size();
    }
    public void preorder(TreeNode cur){
        if(cur == null) return;
        store.add(cur.val);
        preorder(cur.left);
        preorder(cur.right);
    }
}
