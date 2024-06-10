import java.util.*;

public class stackemptyornot {
    public static void main(String[] args)
    {

        Stack<String> STACK = new Stack<String>();

        STACK.push("I");
        STACK.push("4");
        STACK.push("India");
        STACK.push("Welcomes");
        STACK.push("You");

        System.out.println("The stack is: " + STACK);

        System.out.println("Is the stack empty? " + STACK.empty());

        STACK.pop();
        STACK.pop();
        STACK.pop();
        STACK.pop();
        STACK.pop();

        System.out.println("Is the stack empty? " + STACK.empty());
    }
}

