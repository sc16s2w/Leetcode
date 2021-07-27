package com.company.BinaryTree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Code_654 {
    /**
     * 给定一个不含重复元素的整数数组 nums 。一个以此数组直接递归构建的 最大二叉树 定义如下：
     *
     * 二叉树的根是数组 nums 中的最大元素。
     * 左子树是通过数组中 最大值左边部分 递归构造出的最大二叉树。
     * 右子树是通过数组中 最大值右边部分 递归构造出的最大二叉树。
     * 返回有给定数组 nums 构建的 最大二叉树 。
     * @param nums
     * @return
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length);

    }

    public TreeNode construct(int[] nums,int left,int right){
        if((right-left)==0) return null;
        if((right-left)==1) return new TreeNode(nums[left]);
        List<Integer> temp = new LinkedList<>();
        for(int i = left;i<right;i++){
            temp.add(nums[i]);
        }
        int maxVal = Collections.max(temp);
        TreeNode cur = new TreeNode(maxVal);
        int index = 0;
        for(int i = 0;i<right;i++){
            if(nums[i]==maxVal) index = i;
        }
        // System.out.println(index+" "+maxVal);
        cur.left = construct(nums,left,index);
        cur.right = construct(nums,index+1,right);
        return cur;
    }
}
