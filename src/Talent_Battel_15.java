// Write a program to Replace all 0’s with 1 in a given integer

import java.util.Scanner;
public class Talent_Battel_15 {
    public static void main(String[] args) {
        System.out.println("Enter the number : -");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextInt();

        String st = String.valueOf(number);
        String b="";

        for (int i=0; i<st.length(); i++){
            if (st.charAt(i)=='0'){
               b = st.replace('0' ,'1');
            }
        }
        System.out.println(b);
    }
}
