package DataStructures;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        linkedList.add("fourth");

        System.out.println(linkedList);

        linkedList.remove();
        System.out.printf("LinkedList after remove: %s\n", linkedList);

        System.out.println("LinkedList first element: " + linkedList.element());
    }
}
