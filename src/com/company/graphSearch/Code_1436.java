package com.company.graphSearch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code_1436 {
    public String destCity(List<List<String>> paths) {
        Map<String,String> store = new HashMap<>();
        for(int i = 0;i< paths.size();i++){
            store.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        String res = store.get(paths.get(0).get(0));
        while(store.containsKey(res)){
            res = store.get(res);
        }
        return res;
    }
}
