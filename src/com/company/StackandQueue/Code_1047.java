package com.company.StackandQueue;

import java.util.HashSet;
import java.util.Stack;

/**
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 */
public class Code_1047 {
    public static String removeDuplicates(String s) {
        Stack<Character> store = new Stack<>();
        char[] ch = s.toCharArray();
        for(char c:ch){
            if(store.isEmpty()||c!=store.peek()){
                store.push(c);
            }
            else{
                store.pop();
            }

        }
        String str = "";
        while (!store.isEmpty()) {
            str = store.pop() + str;
        }
        return str;

    }



    public static void main(String[] args){
        System.out.println(removeDuplicates("aaaaaa"));

    }
}
