package com.company.String;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class Code_offer_05 {
    //用标准的双指针法做了一次，发现可以用stringbuilder，准备试试。
    public static String replaceSpace(String s) {
        char[] ch = s.toCharArray();
        int count = 0;
        for(int i = 0;i<ch.length;i++){
            if(ch[i]==' ') count++;
        }
        char[] result = new char[s.length()+count*2];
        int fast = result.length-1;
        int slow = s.length()-1;
        for(slow=s.length()-1;slow>=0;slow--){
            if(ch[slow] == ' '){
                result[fast] = '0';
                result[fast-1] = '2';
                result[fast-2] = '%';
                fast=fast-3;
            }
            else{
                result[fast]=ch[slow];
                fast--;
            }
        }
        return String.valueOf(result);
    }

    public static String replaceSpace_2nd(String s)
}
