package com.company.graphSearch;

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
//用dfs,现在试试用bfs
public class Code_133 {
    HashMap<Node,Node> store = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null) return node;
        if(store.containsKey(node)) return store.get(node);
        Node cloneNode = new Node(node.val,new ArrayList());
        store.put(node,cloneNode);
        for(Node neighbour: node.neighbors){
            cloneNode.neighbors.add(cloneGraph(neighbour));
        }
        return cloneNode;
    }
    public Node cloneGraph_dfs(Node node){
        if(node==null) return node;
        Queue<Node> store = new LinkedList<>();
        HashMap<Node,Node> visited = new HashMap<>();
        store.add(node);
        Node cloneNode = new Node(node.val,new ArrayList<>());
        visited.put(node,cloneNode);
        while (!store.isEmpty()){
            Node cur = store.poll();
            for(Node neighbour:cur.neighbors){
                if(!visited.containsKey(neighbour)){
                    store.add(neighbour);
                    Node temp = new Node(neighbour.val,new ArrayList<>());
                    visited.put(neighbour,temp);
                }
                visited.get(cur).neighbors.add(visited.get(neighbour));
            }
        }
        return visited.get(node);
    }

}
