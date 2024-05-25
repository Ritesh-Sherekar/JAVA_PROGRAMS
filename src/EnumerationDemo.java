import java.util.*;
public class EnumerationDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i=0; i<v.capacity(); i++){
            v.addElement(i);
        }
        System.out.println(v);

        Enumeration E = v.elements();
        while(E.hasMoreElements()){
            Integer I = (Integer)E.nextElement();
            if(I % 2 == 0){
                System.out.print(I + " ");
            }
        }
        System.out.println();
        System.out.println(v);
    }
}
