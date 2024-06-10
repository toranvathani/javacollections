import java.util.*;

class vectorreverse {
    public static void main(String[] args)
    {
        Vector<String> numbers = new Vector<String>();

        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");

        for (int index = numbers.size() - 1; index >= 0; index--) {
            System.out.println(numbers.get(index));
        }
    }
}
