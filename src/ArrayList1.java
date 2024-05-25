import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(1);
        System.out.println(list);

        System.out.println(list.get(0));
        list.set(2, 4);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("The 1st" + list);
        Collections.reverse(list);
        System.out.println("The 2nd"+list);
    }
}
