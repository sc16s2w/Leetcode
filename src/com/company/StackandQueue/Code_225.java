package com.company.StackandQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Code_225 {
    Queue<Integer> store_in;
    Queue<Integer> store_out;
    public Code_225() {
        store_in = new LinkedList<>();
        store_out = new LinkedList<>();

    }

    /** Push element x onto stack. */
    public void push(int x) {
        store_out.add(x);
        while(!store_in.isEmpty()){
            store_out.add(store_in.poll());
        }
        Queue<Integer> temp = store_in;
        store_in = store_out;
        store_out = temp;


    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return store_in.poll();


    }

    /** Get the top element. */
    public int top() {
        return store_in.peek();

    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return store_in.isEmpty();

    }
}
