package ArrayDequeue;

import java.util.ArrayDeque;

public class learnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23); //adds the element at the last
        adq.offerFirst(11); //adds the element at the starting index
        adq.offerLast(34);

        //same for the peek,poll etc

        System.out.println(adq);

        //same for the peek,poll etc
    }
}
