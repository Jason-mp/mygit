package com.algorithm.offerday;

import java.util.Stack;

public class User2StackImplementQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    //05.两个栈来实现一个队列
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            int node = stack1.pop();
            stack2.push(node);
        }
        int first = stack2.pop();
        while (!stack2.isEmpty()) {
            int node = stack2.pop();
            stack1.push(node);
        }
        return first;
    }
}
