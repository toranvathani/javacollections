import java.util.*;

public class HashMapputremove {
    public static void main(String[] args)
    {

        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        hash_map.put(10, "We");
        hash_map.put(15, "4");
        hash_map.put(20, "India");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");

        System.out.println("Initial Mappings are: " + hash_map);

        //put
        String returned_value = (String)hash_map.put(20, "All");

        System.out.println("Returned value is: " + returned_value);

        System.out.println("New map is: " + hash_map);

        //remove
        returned_value = (String)hash_map.remove(20);

        System.out.println("Returned value is: "+ returned_value);

        System.out.println(STR."New map is: "+ hash_map);
    }
}
