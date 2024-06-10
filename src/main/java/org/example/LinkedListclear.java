package org.example;

import java.io.*;
import java.util.LinkedList;

public class LinkedListclear {
    public static void main(String args[])
    {

        LinkedList<String> list = new LinkedList<String>();

        list.add("Vote");
        list.add("for");
        list.add("India");
        list.add("10");
        list.add("20");

        System.out.println("Original LinkedList:" + list);

        list.clear();

        System.out.println("List after clearing all elements: " + list);

        list.add("Vote");
        list.add("for");
        list.add("India");

        System.out.println("After adding elements to empty list:" + list);
    }
}

