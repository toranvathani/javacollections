import java.io.*;
import java.util.LinkedList;

public static void main(String args[]) {
    LinkedList list = new LinkedList();

    list.add("Vote");
    list.add("for");
    list.add("Nation");
    list.add("10");
    list.add("20");

    System.out.println("The list is:" + list);

    list.add("Last");
    list.add("Element");

    System.out.println("The new List is:" + list);
}
