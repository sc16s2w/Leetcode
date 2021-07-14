package com.company.StackandQueue;

import java.util.Stack;

public class Code_232 {
}
class MyQueue {
    Stack<Integer> store_in;
    Stack<Integer> store_out;

    /** Initialize your data structure here. */
    public MyQueue() {
       store_in = new Stack<>();
       store_out = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        store_in.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(store_out.isEmpty()){
            while(!store_in.isEmpty()){
                store_out.add(store_in.pop());
            }
        }
        return store_out.pop();

    }

    /** Get the front element. */
    public int peek() {
        int res = this.pop();
        store_out.push(res);
        return res;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return store_in.isEmpty()&&store_out.isEmpty();

    }
}
