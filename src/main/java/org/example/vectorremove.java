import java.util.*;

public class vectorremove {
    public static void main(String args[])
    {
        Vector<String> vt = new Vector<String>();

        vt.add("Welcome");
        vt.add("To");
        vt.add("India");
        vt.add("4");
        vt.add("India");

        System.out.println("Vector: " + vt);

        vt.clear();

        System.out.println("The final Vector: " + vt);
    }
}

