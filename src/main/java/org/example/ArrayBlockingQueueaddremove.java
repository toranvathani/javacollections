import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueaddremove {
    public static void main(String[] args) throws InterruptedException {
        int capacity = 10;

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(capacity);

        //add
        queue.add(23);

        System.out.println("After adding 23");
        System.out.println(queue);

        queue.add(32);
        queue.add(45);
        queue.add(12);

        System.out.println("After adding 32, 45, 12");
        System.out.println(queue);

        queue.add(27);
        queue.add(67);

        System.out.println("After adding 27, 67");
        System.out.println(queue);

        //remove
        int head= 0;
        try {
            head = queue.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Head of queue removed is " +head);
        System.out.print("After removing head. Queue: ");
        System.out.println(queue);

        head = queue.take();

        System.out.println("Head of queue removed is " + head);
        System.out.print("After removing head. Queue: ");
        System.out.println(queue);
    }
}
