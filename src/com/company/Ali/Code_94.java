package com.company.Ali;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Code_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode cur = root;
        Stack<TreeNode> store = new Stack<>();
        while(cur !=null||!store.isEmpty()){
            if(cur!=null){
                store.add(cur);
                cur = cur.left;
            }
            else{
                cur = store.pop();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;



    }
}
