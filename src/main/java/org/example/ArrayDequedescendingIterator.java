import java.util.*;

public class ArrayDequedescendingIterator {
    public static void main(String args[])
    {
        Deque<String> de_que = new ArrayDeque<String>();

        de_que.add("Welcome");
        de_que.add("To");
        de_que.add("India");
        de_que.add("4");
        de_que.add("India");

        System.out.println("ArrayDeque: " + de_que);

        Iterator value = de_que.descendingIterator();

        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}

