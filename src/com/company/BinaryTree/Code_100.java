package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class Code_100 {
    /**
     * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> store_p = new LinkedList<>();
        List<Integer> store_q = new LinkedList<>();
        preorder(p,store_p);
        preorder(q,store_q);
        for(int i = 0;i<store_p.size();i++){
            if(store_p.get(i)!=store_q.get(i)) {
                if(store_p.get(i)!=null&&store_q.get(i)!=null){
                    if(store_p.get(i).intValue() == store_q.get(i).intValue()){
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public void preorder(TreeNode cur,List<Integer> store){
        if(cur == null){
            store.add(null);
            return;
        }
        store.add(cur.val);
        preorder(cur.left,store);
        preorder(cur.right,store);

    }
}
