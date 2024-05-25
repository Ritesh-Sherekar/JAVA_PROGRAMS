
import java.util.*;
public class StringBuilding {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Ritesh");

        // Char at index
        System.out.println(sb.charAt(0));
        // insert the char
        System.out.println(sb.insert(2,'p'));
        // replace the char
        sb.setCharAt(3,'x');
        System.out.println(sb);
        // insert the char at last
        System.out.println(sb.append('s'));
    }
}
