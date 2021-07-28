package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code_863 {
    /**
     * 给定一个二叉树（具有根结点root）一个目标结点target，和一个整数值 K 。
     * 返回到目标结点 target 距离为 K 的所有结点的值的列表。 答案可以以任何顺序返回。
     * @param root
     * @param target
     * @param k
     * @return
     */
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new LinkedList<>();
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        int index = -100;
        int level = 0;
        while (!store.isEmpty()){
            int len = store.size();
            while(len>0){
                TreeNode cur = store.poll();
                if(cur.left.val)
            }
        }

    }
}
