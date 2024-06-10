package org.example;

import java.io.*;
import java.util.LinkedList;

public class LinkedListcontains {
    public static void main(String args[]) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("Vote");
        list.add("for");
        list.add("India");
        list.add("10");
        list.add("20");

        System.out.println("LinkedList:" + list);

        System.out.println("\nDoes the List contains 'Hello': " + list.contains("Hello"));

        System.out.println("Does the List contains '20': " + list.contains("20"));

        System.out.println("Does the List contains 'India': " + list.contains("India"));


    }
}
