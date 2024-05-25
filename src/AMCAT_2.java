
import java.util.Scanner;
public class AMCAT_2 {

 //   public static String NewString(String s){
//        char[] arr = {'a','e','i','o','u'};
//        String a = "";
//        int start = 0;
//        for (int i=0; i<s.length(); i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (s.charAt(i) == arr[j]){
//                    i++;
//                }
//                System.out.println(s.charAt(i));
//            }
//            a = a+i;
//        }

//        return a;
//        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :-");
        String s = sc.nextLine();
        char[] arr = {'a','e','i','o','u'};
        String a = "";
        int start = 0;
        for (int i=0; i<s.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (s.charAt(i) == arr[j]){
                    i++;
                }
                System.out.println(s.charAt(i));
            }

        }
    }
}
