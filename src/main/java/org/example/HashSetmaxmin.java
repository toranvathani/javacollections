import java.util.*;

public class HashSetmaxmin {
    public static void main(String[] args)
    {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(40);

        System.out.println("Maximum value of HashSet : " + Collections.max(set));

        System.out.println("Minimum value of HashSet : " + Collections.min(set));
    }
}
