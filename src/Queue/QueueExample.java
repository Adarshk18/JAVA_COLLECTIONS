package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //add elements in the queue
        queue.offer(21);
        queue.offer(12);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue);

        // QUEUE FOLLOWS FIFO

        // to takeout elements from the queue
        System.out.println(queue.poll());

        System.out.println(queue);

        // peak : says which element is next in line to come out
        System.out.println(queue.peek());
    }
}
