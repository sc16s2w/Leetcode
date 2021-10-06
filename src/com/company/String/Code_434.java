package com.company.String;

public class Code_434 {
    public static int countSegments(String s) {
        String[] input = s.split(" ");
        int i = 0;
        for(String c:input){
//            System.out.println(c);
            if(!c.equals("")) i++;
        }
        return i;
    }
    public static void main(String[] args){
        String s = ", , , ,        a, eaefa";
        System.out.println(countSegments(s));
    }
}
