package com.learnning;

public class Main {
    public static void main(String[] agrs) {
        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStack(); // Stack: 1 2 3
        stack.pop();
        stack.printStack(); // Stack: 1 2
        System.out.println("Peek element: " + stack.peek()); // Peek element: 2
        stack.push(4);
        stack.push(5);
        stack.printStack(); // Stack: 1 2 4 5
        stack.push(6); // Stack is full. Cannot push value 6
        Book book1=new Book("programing",1,"first");
        System.out.println("图书名字：");
        System.out.println(book1.getName());
        System.out.println("图书序号：");
        System.out.println(book1.getNumber());
        System.out.println("图书种类：");
        System.out.println(book1.getKind());
    }
}
