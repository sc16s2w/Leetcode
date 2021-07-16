package com.company.StackandQueue;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 */
public class Code_20 {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> store = new Stack<>();
        for(int i = 0;i<ch.length;i++){
            if(ch[i]=='{') store.push('}');
            else if(ch[i]=='(') store.push(')');
            else if(ch[i] == '[') store.push(']');
            else if(store.isEmpty()||store.peek()!= ch[i]){
                return false;
            }
            else{
                store.pop();
            }
        }
        return store.isEmpty();

    }
}
