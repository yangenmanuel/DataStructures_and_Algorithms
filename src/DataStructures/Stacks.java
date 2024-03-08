package DataStructures;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        System.out.println("Stacks");

        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        stack.pop();
        System.out.println(stack);

        int loc = stack.search("B");
        System.out.println("B is at: " + loc);
    }
}
