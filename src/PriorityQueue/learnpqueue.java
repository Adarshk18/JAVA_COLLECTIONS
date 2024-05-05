package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class learnpqueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(67);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.peek());

        // as the above priority queue is making the order from low to high but if we want to
//        make the order from high to low then we will use "Comparator.reverseOrder()"
    }
}
