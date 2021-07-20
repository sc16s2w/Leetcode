package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定一个 N 叉树，找到其最大深度。
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 * N 叉树输入按层序遍历序列化表示，每组子节点由空值分隔（请参见示例）。
 */



public class Code_559 {
    public int maxDepth(Node root) {
        int maxdepth = 0;
        if(root==null) return maxdepth;
        Queue<Node> store = new LinkedList<>();
        store.add(root);
        while(!store.isEmpty()){
            int len = store.size();
            while(len>0){
                Node cur = store.poll();
                if(cur.children != null){
                    for(Node ch: cur.children){
                        store.add(ch);
                    }
                }
                len--;
            }
            maxdepth++;
        }
        return maxdepth;
    }
}
