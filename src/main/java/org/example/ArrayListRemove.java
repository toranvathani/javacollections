import java.util.ArrayList;
import java.util.List;

public static void main(String[] args) {

    List<Integer> a1 = new ArrayList<>();

    a1.add(10);
    a1.add(20);
    a1.add(1);
    a1.add(2);

    System.out.println(a1);

    a1.remove(1);

    a1.remove(1);

    System.out.println(a1);
}
