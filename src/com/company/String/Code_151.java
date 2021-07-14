package com.company.String;

/**
 * 给你一个字符串 s ，逐个翻转字符串中的所有 单词 。
 * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 * 请你返回一个翻转 s 中单词顺序并用单个空格相连的字符串。
 */
//这个题也可以按空间复杂度为O（1）来考虑 双指针法反转
public class Code_151 {
    public static String reverseWords(String s) {
        s.trim();
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = str.length-1;i>=0;i--){
            str[i].replace(" ","");
            if(str[i].length()!=0) {
                sb.append(str[i]);
                sb.append(" ");
            }
        }
        String result = sb.toString().trim();
        return result;
    }
    public static void main(String[] args){
        String result = reverseWords("a good   example");
        System.out.println(" ".length());
        System.out.println(result);
    }

}
