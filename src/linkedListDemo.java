import java.util.*;
public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.add(34);
        ls.add("Ritesh");
        ls.add(null);
        ls.add("Ritesh");
        System.out.println(ls);
        ls.add(2,"Sherekar");
        ls.remove(0);
        ls.set(0,101);
        System.out.println(ls);
        System.out.println(ls.contains("Ritesh"));
        for (int i=0; i<ls.size(); i++){
            System.out.print(ls.get(i) + " ,");
        }
    }
}
