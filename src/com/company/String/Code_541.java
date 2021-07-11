package com.company.String;

/**
 * 给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 */
public class Code_541 {
    //有个错他妈的不会改
//    public String reverseStr(String s, int k) {
//        s.length()
//        int left = 0;
//        int right = k;
//        char[] store = s.toCharArray();
//        int left_2nd = 0;
//        int right_2nd = store.length-1;
//        if(store.length<k){
//            while(left<right){
//                char temp = store[left_2nd];
//                store[left_2nd] = store[right_2nd];
//                store[right_2nd] = temp;
//                left_2nd++;
//                right_2nd--;
//            }
//            return String.valueOf(store);
//        }
//        while(left<store.length&&right<store.length){
//            char temp = store[left];
//            store[left] = store[right];
//            store[right] = temp;
//            left+=2*k;
//            right = left+k;
//        }
//        return String.valueOf(store);
//
//    }
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for(int i =0;i<s.length();i+=2*k){
            int start = i;
            int end = Math.min(i+k-1,s.length()-1);
            while(start<end){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
}

