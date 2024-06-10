package org.example;

import java.util.*;

public class vectoradd {
    public static void main(String args[])
    {
        Vector<String> vec_tor = new Vector<String>();

        vec_tor.add("Vote");
        vec_tor.add("for");
        vec_tor.add("India");
        vec_tor.add("10");
        vec_tor.add("20");

        System.out.println("The vector is: "+ vec_tor);

        vec_tor.add("Last");
        vec_tor.add("Element");

        System.out.println("The new Vector is: " + vec_tor);

    }
    }
