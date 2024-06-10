import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueuepeek {
    public static void main(String[] args) {
        int capacity =5;

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(capacity);

        queue.add(23);
        queue.add(32);
        queue.add(45);
        queue.add(12);

        System.out.println("After adding numbers queue is ");
        System.out.println(queue);

        System.out.println("Head of queue "+queue.peek());
    }
}
