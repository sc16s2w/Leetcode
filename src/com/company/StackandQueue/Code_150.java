package com.company.StackandQueue;

import java.util.Stack;

public class Code_150 {
    public static int evalRPN(String[] tokens) {
        Stack<String> store = new Stack<>();
        for(int i = 0; i<tokens.length;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int num1 = Integer.parseInt(store.pop());
                int num2 = Integer.parseInt(store.pop());
                switch (tokens[i]) {
                    case "+":
                        store.push(String.valueOf(num1 + num2));
                        break;
                    case "-":
                        store.push(String.valueOf(-(num1 - num2)));
                        break;
                    case "*":
                        store.push(String.valueOf(num1 * num2));
                        break;
                    default:
                        store.push(String.valueOf(num2 / num1));
                        break;
                }
            }
            else{
                store.push(tokens[i]);
            }
        }
        return Integer.parseInt(store.pop());
    }

    public static void main(String[] args){
        String[] test = new String[]{"4","13","5","/","+"};
        System.out.println(evalRPN(test));
    }
}
