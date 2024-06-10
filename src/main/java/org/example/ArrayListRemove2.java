package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemove2 {
    public static void main(String[] args)
    {
        List<Integer> a1 = new ArrayList<>();

        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(1);
        a1.add(2);

        System.out.println(a1);

        a1.remove(Integer.valueOf(1));

        a1.remove(Integer.valueOf(2));


        System.out.println(a1);
    }
}
