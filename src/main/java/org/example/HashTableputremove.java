import java.util.*;

public class HashTableputremove {
    public static void main(String[] args)
    {

        Hashtable<Integer, String> hash_table =
                new Hashtable<Integer, String>();

        hash_table.put(10, "We");
        hash_table.put(15, "4");
        hash_table.put(20, "India");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");

        System.out.println("Initial table is: " + hash_table);

        //Put
        String returned_value = (String)hash_table.put(20, "All");

        System.out.println("Returned value is: " + returned_value);

        System.out.println("New table is: " + hash_table);

        //Remove
        returned_value = (String) hash_table.remove(20);

        System.out.println("Returned value is: " + returned_value);

        System.out.println(STR."New table is: \{hash_table}");
    }
}
