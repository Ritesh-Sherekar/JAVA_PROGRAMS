import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(23);
        s.push("Ritesh");
        s.push(null);
        s.push("Sherekar");

        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        s.add(67);
        System.out.println(s);
        s.remove(2);
        System.out.println(s);

    }
}
