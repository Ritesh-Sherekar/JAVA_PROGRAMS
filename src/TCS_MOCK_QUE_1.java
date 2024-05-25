
import java.util.Scanner;
public class TCS_MOCK_QUE_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :-");
        String str = sc.nextLine();

        for (int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if (ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                    continue;
            }
                else {
                    System.out.println(ch);
                }
        }
    }
}
