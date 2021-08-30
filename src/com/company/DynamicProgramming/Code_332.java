package com.company.DynamicProgramming;

import java.util.*;

public class Code_332 {
    static LinkedList<String> result = new LinkedList<>();
    public static List<String> findItinerary(List<List<String>> tickets) {
        Map<String, Map<String,Integer>> store = new HashMap<>();
        for(List l:tickets){
            if(!store.containsKey(l.get(0))){
                Map<String,Integer> temp = new TreeMap<>();
                temp.put((String) l.get(1),1);
                store.put((String) l.get(0),temp);
            }
            else{
                Map<String,Integer> temp = store.get(l.get(0));
                if(temp.containsKey(l.get(1))) temp.put((String) l.get(1),temp.get(l.get(1))+1);
                else temp.put((String) l.get(1),1);
                store.put((String) l.get(0),temp);
            }
        }
        result.add("JFK");
        retrace(store,tickets.size());
        return result;
    }
    public static boolean retrace(Map<String,Map<String,Integer>> store,int ticketnum){
        if(result.size() == ticketnum+1){
            return true;
        }
        String key = result.getLast();
        if (store.containsKey(key)) {
            for(Map.Entry<String,Integer> target:store.get(key).entrySet()){
                int count = target.getValue();
                if(count > 0){
                    result.add(target.getKey());
                    target.setValue(count-1);
                    if(retrace(store,ticketnum)) return true;
                    result.removeLast();
                    target.setValue(count);
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        List<List<String>> store = new ArrayList<>();
        List<String> HH = new ArrayList<>();
        HH.add("JFK");
        HH.add("SFO");
        store.add(HH);
        HH = new ArrayList<>();
        HH.add("JFK");
        HH.add("ATL");
        store.add(HH);
        HH = new ArrayList<>();
        HH.add("SFO");
        HH.add("ATL");
        store.add(HH);
        HH = new ArrayList<>();
        HH.add("ATL");
        HH.add("JFK");
        store.add(HH);
        HH = new ArrayList<>();
        HH.add("ATL");
        HH.add("SFO");
        store.add(HH);
        List<String> t = findItinerary(store);
        System.out.println(t);
    }
}
