package com.company.HuaWei;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Code_146 {
}
class Node{
    int key;
    int val;
    public Node prev;
    public Node next;
    public Node(){};
    public Node(int key,int val){
        this.key=key;
        this.val=val;
    }
}

class LRUCache {

    private HashMap<Integer,Node> store;
    private int size;
    private int capacity;
    private Node head, tail;
    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity=capacity;
        store = new HashMap<Integer,Node>();
        head = new Node();
        tail = new Node();
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key) {
        if(store.containsKey(key)){
            this.remove(store.get(key));
            this.addFirst(store.get(key));
            return store.get(key).val;
        }
        return -1;
    }

    public void put(int key, int value) {
        Node node = store.get(key);
        if(node==null){
            Node newNode = new Node(key,value);
            store.put(key,newNode);
            addFirst(newNode);
            size++;
            if(size>capacity){
                Node res = removeLast();
                store.remove(res.key);
                size--;
            }
        }
        else{
            remove(node);
            node.val=value;
            addFirst(node);
        }
    }
    public void addFirst(Node x){
        x.prev=head;
        x.next=head.next;
        head.next.prev = x;
        head.next = x;
    }
    public void remove(Node x){
        Node pre = x.prev;
        Node next = x.next;
        pre.next = next;
        next.prev = pre;
    }
    public Node removeLast(){
        Node res = tail.prev;
        remove(res);
        return res;
    }
}