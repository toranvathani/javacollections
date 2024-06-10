package org.example;

import java.util.*;

public class stackpushpop {
    public static void main(String args[])
    {
        Stack<Integer> STACK = new Stack<Integer>();

        STACK.push(10);
        STACK.push(15);
        STACK.push(30);
        STACK.push(20);
        STACK.push(5);
        STACK.push(null);

        //Push
        System.out.println("Initial Stack: " + STACK);

        STACK.push(1254);
        STACK.push(4521);

        System.out.println("Final Stack: " + STACK);

        //Pop
        System.out.println("Popped element: " + STACK.pop());
        System.out.println("Popped element: " + STACK.pop());

        System.out.println("Stack after pop operation " + STACK);
    }
}