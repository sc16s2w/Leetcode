package com.company.top100;

public class Code_4 {
    public static String longestPalindrome(String s) {
        String result = "";
        int length = 1;
        for(int i = 0;i<s.length()-1;i++){
            String temp = s.charAt(i)+"";
            for(int j = i+1;j<s.length();j++){
                temp+=s.charAt(j);
                if(isValid(temp)&&temp.length()>=length){
                    result = temp;
                    length = temp.length();
                }
                else{
                    break;
                }
            }
        }
        return result;

    }
    public static boolean isValid(String s){
        int i =0;
        int j = s.length()-1;
        if(i==j) return true;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(longestPalindrome("ccc"));
    }
}
