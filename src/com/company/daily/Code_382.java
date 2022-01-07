package com.company.daily;

import java.util.ArrayList;
import java.util.List;

public class Code_382 {
    /**
     * 随机概率随机取样
     */
    List<Integer> store = new ArrayList<>();
    public Code_382(ListNode head) {
        while(head!=null){
            this.store.add(head.val);
            head = head.next;
        }
    }
    public int getRandom() {
        int pick = (int) (Math.random()*this.store.size());
        return this.store.get(pick);

    }
}
