package com.company.top100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Code_22 {
    /**
     * 暴力解法， 有个问题是最后决定条件是length等于那个，为啥不能是end==那个呢？
     * 因为他并不是按照那个树那样走的
     */
    static List<String> result = new LinkedList<>();
    public static void main(String[] args){
        generateParenthesis(3);
        for(String s:result){
            System.out.println(s);
        }
    }
//    public static List<String> generateParenthesis(int n) {
//        recurse(0,2*n,"");
//        return result;
//
//    }
//    public static void recurse(int end, int n,String sb){
//        if(end==n){
//            if(isValid(sb)){
//                // System.out.println(n+" "+end);
//                // System.out.println(sb.toString());
//                result.add(sb);
//            }
//            return;
//        }
//        for(int i = end;i<n;i++){
//            recurse(i+1,n,sb+"(");
//            recurse(i+1,n,sb+")");
//
//        }
//    }
//
//    private static boolean isValid(String toString) {
//        char[] ch = toString.toCharArray();
//        int count = 0;
//        for(Character c:ch){
//            if(c=='(') count++;
//            else count--;
//            if(count<0) return false;
//        }
//        if(count==0) return true;
//        return false;
//    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public static void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur.toString());
            return;
        }

        if (open < max) {
            cur.append("(");
            backtrack(ans, cur, open+1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close < open) {
            cur.append(")");
            backtrack(ans, cur, open, close+1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
