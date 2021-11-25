package com.company.HuaWei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        String nothing = sc.nextLine();
        HashMap<Integer, LinkedList<String>> blackList = new HashMap<>();
        LinkedList<String> result = new LinkedList<>();
        for(int i=0;i<m;i++){
            String temp = sc.nextLine();
            String[] divided = temp.split("\\.");
            StringBuilder key = new StringBuilder();
            String[] nums = divided[3].split("/");
            int num = Integer.parseInt(nums[1])/8;
            for(int j=0;j<num;j++){
                key.append(divided[j]).append(".");
            }
            LinkedList<String> value;
            if(!blackList.containsKey(num)){
                value = new LinkedList<>();
            }
            else {
                value = blackList.get(num);
            }
            value.add(key.toString());
            blackList.put(num, value);
        }
        for(int i=0;i<n;i++){
            String input = sc.nextLine();
            String[] divided = input.split("\\.");
            StringBuilder key = new StringBuilder();
            for(int len =1;len<=4;len++){
                    key.append(divided[len-1]).append(".");
                    if(blackList.containsKey(len)){
                        for(String ans:blackList.get(len)){
                            if(ans.equals(key.toString())){
                                result.add(input);
                                break;
                            }
                        }
                    }
            }
        }
        for(String res:result){
            System.out.println(res);
        }
    }
}
