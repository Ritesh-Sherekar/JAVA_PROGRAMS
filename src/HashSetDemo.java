import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("546");
        h.add("637");
        h.add("789");
        h.add(null);
        h.add("Ritesh");
        System.out.println(h);
        System.out.println(h.add("Ritesh"));
        //System.out.println(h);

    }
}
