import java.util.*;

class HashSetPrint {
    public static void main(String[] args)
    {

        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(5);
        hs.add(2);
        hs.add(3);
        hs.add(6);
        hs.add(null);

        Iterator itr = hs.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
