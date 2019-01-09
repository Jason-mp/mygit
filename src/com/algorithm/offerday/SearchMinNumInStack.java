package com.algorithm.offerday;

import java.util.Stack;

/**
 * @Author xp
 * @Date: 2019-01-08
 */
public class SearchMinNumInStack {
    /**
        定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））
        思路：构造一个辅助栈来暂存最小值，当输入值比之前大大话，最小值不变，否则讲刚输入的值压辅助栈
        例如：输入 5，4，3，9，11，12，1，辅助栈内则为 5，4，3，x，x，x，1
     */

    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();
    Integer temp = null;
    public void push(int node) {
        if (temp != null) {
            if (node >= temp) {
                data.push(node);
            } else {
                data.push(node);
                min.push(node);
            }
        } else {
            temp = node;
            data.push(node);
            min.push(node);
        }
    }

    public void pop() {
        int num = data.pop();
        int minNum = min.pop();
        if (num != minNum) {
            min.push(minNum);
        }
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
}
