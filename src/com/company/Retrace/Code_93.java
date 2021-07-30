package com.company.Retrace;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个只包含数字的字符串，用以表示一个 IP 地址，返回所有可能从 s 获得的 有效 IP 地址 。你可以按任何顺序返回答案。
 *
 * 有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
 */
public class Code_93 {
    List<String> result = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        retrace(s,0,0);
        return result;
    }
    public void retrace(String s,int start,int num){
        if(num == 3){
            if(isValid(s,start,s.length()-1)){
                result.add(s);
            }
            return;
        }
        for(int i = start;i<s.length();i++){
            if(isValid(s,start,i)){
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                num+=1;
                retrace(s,i+2,num);
                num-=1;
                s = s.substring(0, i + 1) + s.substring(i + 2);
            }
            else{
                break;
            }
        }
    }
    public boolean isValid(String s,int start,int end){
        if(start>end){
            return false;
        }
        int num = 0;
        if(s.charAt(start)=='0'&&start!=end){
            return false;
        }
        for(int i = start; i<=end;i++){
            if(s.charAt(i)>'9'||s.charAt(i)<'0'){
                return false;
            }
            num = num*10+(s.charAt(i)-'0');
            if(num>255){
                return false;
            }
        }
        return true;
    }
}
