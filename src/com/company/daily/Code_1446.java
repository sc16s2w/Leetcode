package com.company.daily;

public class Code_1446 {
    public int maxPower(String s) {
        int count = 1;
        int sum =0;
        char temp = s.charAt(0);
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == temp) count++;
            else{
                temp = s.charAt(i);
                count = 1;
            }
            sum = Math.max(count,sum);
        }
        return sum;

    }
}
