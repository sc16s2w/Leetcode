package com.company.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class Code_530 {
    /**
     *
     * @param root
     * @return
     */
    public int getMinimumDifference(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        inorder(root,result);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<result.size()-1;i++){
            int temp = Math.abs(result.get(i+1)-result.get(i));
            if(temp<min) min = temp;
        }
        return min;
    }
    public void inorder(TreeNode cur, List<Integer> result){
        if(cur == null) return;
        inorder(cur.left,result);
        result.add(cur.val);
        inorder(cur.right,result);
    }
}
