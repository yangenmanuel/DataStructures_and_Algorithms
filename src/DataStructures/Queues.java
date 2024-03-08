package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");

        System.out.println(queue);

        queue.poll();
        System.out.printf("Queue after poll: %s\n", queue);

        System.out.println("Queue first element: " + queue.peek());

    }
}
