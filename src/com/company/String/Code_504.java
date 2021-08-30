package com.company.String;

public class Code_504 {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean isPositive = true;
        if(num<0){
            num = -num;
            isPositive = false;
        }
        while(num!=0){
            sb.append(num%7);
            num=num/7;
        }
        if(!isPositive) sb.append("-");
        sb.reverse();
        return sb.toString();
    }
}
