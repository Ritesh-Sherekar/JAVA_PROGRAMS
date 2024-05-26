import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Ritesh");
        al.add("Pratik");
        al.add("Athrav");
        al.add("Shivam");
       System.out.println(al);
        ListIterator itr = al.listIterator();
        while(itr.hasNext()){
            String s = (String)itr.next();
            if (s.equals("Pratik")){
                itr.remove();
            }else if(s.equals("Athrav")){
                itr.add("Rohan");
            }else if(s.equals("Shivam")){
                itr.set("Om");
            }
        }

        System.out.println(al);
    }
}
