import java.util.*;
public class new_03 {
    public static void main(String[] args) {
        String a = new String();
        a = "Ritesh";
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.charAt(3));
        System.out.println(a.indexOf('R'));

        System.out.println("Enter A Number : - ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);

        System.out.println("Enter A String : - ");
        String y = sc.next();
        System.out.println(y);
    }
}
