import java.util.*;

public static void main(String[] args) {
    Vector<Integer> V = new Vector<Integer>();

    V.add(1);
    V.add(2);
    V.add(3);
    V.add(4);
    V.add(5);

    System.out.println("Vector elements : " + V);

    int minNumber = Collections.min(V);

    int maxNumber = Collections.max(V);

    System.out.println("Maximum Number in Vector is : " + maxNumber);

    System.out.println("Minimum Number in Vector is : " + minNumber);
}

