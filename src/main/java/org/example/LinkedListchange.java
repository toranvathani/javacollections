package org.example;

import java.util.LinkedList;

public class LinkedListchange {

    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Vote");
        list.add("for");
        list.add("India");
        list.add("10");
        list.add("20");

        System.out.println("LinkedList:" + list);


        System.out.println("The Object that is replaced is: " + list.set(0, "Develop"));

        System.out.println("The Object that is replaced is: " + list.set(4, "50"));

        System.out.println("The new LinkedList is:" + list);
    }
}


