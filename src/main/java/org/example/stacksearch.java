import java.util.*;

public static void main(String[] args) {

    Stack<String> STACK = new Stack<String>();

    STACK.push("We");
    STACK.push("4");
    STACK.push("India");
    STACK.push("Welcomes");
    STACK.push("You");

    System.out.println("The stack is: " + STACK);


    System.out.println("Does the stack contains '4'? " + STACK.search("4"));

    System.out.println("Does the stack contains 'Hello'? " + STACK.search("Hello"));


    System.out.println("Does the stack contains 'India'? " + STACK.search("India"));
}
