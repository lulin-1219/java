package com.learnning;

public class MyStack {
    private int[] stack;
    private int top; // 栈顶指针

    public MyStack(int size) {
        stack = new int[size];
        top = -1; // 初始化栈顶指针为-1
    }

    public boolean isEmpty() {
        return top == -1; // 栈顶指针为-1表示栈为空
    }

    public boolean isFull() {
        return top == stack.length - 1; // 栈顶指针为数组长度减1表示栈已满
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("error,栈溢出" + value);
            return;
        }
        stack[++top] = value; // 先将指针增加1，再将元素入栈
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("error,空栈");
            return -1;
        }
        return stack[top--]; // 先将元素出栈，再将指针减少1
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("error，空栈");
            return -1;
        }
        return stack[top]; // 返回栈顶元素
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
