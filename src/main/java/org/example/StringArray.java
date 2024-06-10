import java.util.ArrayList;
import java.util.Arrays;

public static void main(String[] args) {
    ArrayList<String> a1 = new ArrayList<String>();

    a1.add("Shreya Gupta");
    a1.add("Modi Mishra");
    a1.add("Fatima Bewafa");
    a1.add("Ronalado Massi");

    String[] str = new String[a1.size()];

    for (int i = 0; i < a1.size(); i++) {
        str[i] = a1.get(i);
    }

    for (String k : str) {
        System.out.println(k);
    }
}
