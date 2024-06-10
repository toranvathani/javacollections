import java.util.*;

public class PriorityQueuepeek {
    public static void main(String args[])
    {
        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("Welcome");
        queue.add("To");
        queue.add("We");
        queue.add("For");
        queue.add("India");

        System.out.println("Initial PriorityQueue: " + queue);

        System.out.println("The element at the head of the" + " queue is: " + queue.peek());


        System.out.println("Final PriorityQueue: " + queue);
    }
}



