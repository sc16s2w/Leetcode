package com.company.daily;

import java.util.ArrayList;
import java.util.List;

public class Code_476 {
    public int findComplement(int num) {
        List<Integer> store = new ArrayList<>();
        while(num!=0){
            store.add(num%2);
            num = num/2;
        }
        int res = 0;
        for(int i =0;i<store.size();i++){
            res+=Math.pow(2,i)*(1-store.get(i));
        }
        return res;
    }
}
