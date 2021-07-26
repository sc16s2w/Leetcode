package com.company.BinaryTree;

import java.util.*;

public class Code_501 {
    /**
     * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
     * 假定 BST 有如下定义：
     * 结点左子树中所含结点的值小于等于当前结点的值
     * 结点右子树中所含结点的值大于等于当前结点的值
     * 左子树和右子树都是二叉搜索树
     */
    //暴力法
    HashMap<Integer,Integer> store = new HashMap<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        List<Map.Entry<Integer,Integer>> entry = new ArrayList<>();
        entry.addAll(store.entrySet());
        Collections.sort(entry, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> integerIntegerEntry, Map.Entry<Integer, Integer> t1) {
                return t1.getValue()- integerIntegerEntry.getValue();
            }
        });
        List<Integer> result = new ArrayList<>();
        result.add(entry.get(0).getKey());
        for(int i = 0;i<entry.size()-1;i++){
            if(entry.get(i+1).getValue() == entry.get(i).getValue()) result.add(entry.get(i+1).getKey());
            else break;
        }
        int[] final_result = new int[result.size()];
        for(int i = 0;i<result.size();i++){
            final_result[i] = result.get(i);
        }
        return final_result;

    }
    public void inorder(TreeNode cur){
        if(cur == null) return;
        inorder(cur.left);
        if(store.containsKey(cur.val)) store.put(cur.val, store.get(cur.val)+1);
        else store.put(cur.val,1);
        inorder(cur.right);
    }
    //利用中序遍历然后直接找
    TreeNode pre;
    int count;
    int maxcount = 0;
    List<Integer> res =  new ArrayList<>();
    public int[] findMode_2nd(TreeNode root) {
        findMore(root);
        int[] result = new int[res.size()];
        for(int i = 0;i<res.size();i++){
            result[i] = res.get(i);
        }
        return result;

    }

    public void findMore(TreeNode cur){
        if(cur == null) return;
        findMore(cur.left);
        if(pre ==null||pre.val!=cur.val){
            count = 1;
        }
        else{
            count++;
        }
        if(maxcount<count){
            res.clear();
            res.add(cur.val);
            maxcount = count;
        }
        else if(count == maxcount){
            res.add(cur.val);
        }
        pre = cur;
        findMore(cur.right);
    }
}
