package DataStructures;

import java.util.Collections;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(3);
        priorityQueue.offer(4);

        System.out.println(priorityQueue);
    }
}
