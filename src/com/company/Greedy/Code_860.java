package com.company.Greedy;

import java.util.HashMap;

public class Code_860 {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> store = new HashMap<>();
        store.put(5,0);
        store.put(10,0);
        for(int i = 0;i<bills.length;i++){
            if(bills[i]==5){
                store.put(5,store.get(5)+1);
            }
            else if(bills[i] == 10){
                if(store.get(5)>0){
                    store.put(5,store.get(5)-1);
                    store.put(10,store.get(10)+1);
                }
                else{
                    return false;
                }
            }
            else{
                if((store.get(10)>0)&&(store.get(5)>0)){
                    store.put(5,store.get(5)-1);
                    store.put(10,store.get(10)-1);
                }
                else if(store.get(5)>2){
                    store.put(5,store.get(5)-3);
                }
                else{
                    return false;
                }
            }
        }
        return true;

    }
}
