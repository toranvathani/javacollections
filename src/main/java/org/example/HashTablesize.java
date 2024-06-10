import java.util.*;

public class HashTablesize {
    public static void main(String[] args)
    {

        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();

        hash_table.put(10, "We");
        hash_table.put(15, "4");
        hash_table.put(20, "India");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");

        System.out.println("Initial table is: " + hash_table);

        System.out.println("The size of the table is " + hash_table.size());
    }
}
