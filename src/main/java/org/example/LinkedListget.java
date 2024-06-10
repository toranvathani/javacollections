import java.io.*;
import java.util.LinkedList;

public static void main(String args[]) {
    LinkedList<String> list = new LinkedList<>();

    list.add("Vote");
    list.add("for");
    list.add("Nation");
    list.add("10");
    list.add("20");

    System.out.println("LinkedList:" + list);

    System.out.println("The element is: " + list.get(2));

}
