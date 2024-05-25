import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(10);
        l.add("A");
        l.add(45);
        l.add(null);
        System.out.println(l);
        l.size();
        l.remove(2);
        l.set(1,"Ri");
        System.out.println(l);
        l.add(67);
        System.out.println(l);
        
        for (int i=0; i<l.size(); i++){
            System.out.print(l.get(i) + " ");
        }
    }
}
