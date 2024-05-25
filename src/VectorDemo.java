import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("Ritesh");
        v.addElement(56);
        v.addElement(null);
        v.addElement("Sherekar");
        System.out.println(v);

        Vector v1 = new Vector(10);
        for (int i=0; i<10; i++){
            v1.addElement(i);
        }
        System.out.println(v1);


        Vector v2 = new Vector(11,2);
        for(int i=0; i<=10 ; i++){
            v2.addElement(i);

        }
        System.out.println(v2);
        v2.addElement(24);
        v2.addElement(56);
        System.out.println(v2);
        v2.addElement(67);
        System.out.println(v2);
        System.out.println(v2.capacity());
    }
}
