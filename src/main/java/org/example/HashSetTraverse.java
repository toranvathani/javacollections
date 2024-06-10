import java.util.*;

class IterationDemo {
    public static void main(String[] args)
    {
        HashSet<String> h = new HashSet<String>();

        h.add("We");
        h.add("for");
        h.add("India");

        for (String i : h)
            System.out.println(i);
    }
}
