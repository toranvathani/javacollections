import java.util.*;

class HashSetRandomEle {
    public static void main(String[] args)
    {
        Set<Integer> hs = new HashSet<Integer>();

        hs.add(11);
        hs.add(24);
        hs.add(34);
        hs.add(43);
        hs.add(55);
        hs.add(66);
        hs.add(72);
        hs.add(80);
        hs.add(99);

        Integer[] arrayNumbers = hs.toArray(new Integer[hs.size()]);

        Random rndm = new Random();

        int rndmNumber = rndm.nextInt(hs.size());

        System.out.println("Random element: " + arrayNumbers[rndmNumber]);
    }
}