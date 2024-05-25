// Write a program to identify if the number is Palindrome or not

import java.util.Scanner;
public class Talent_Battel_14 {
    public static void main(String[] args) {
        System.out.println("Enter the number :-");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String st = String.valueOf(number);

        String a = "";
        char b ;
        for (int i=0; i<st.length(); i++){
            b = st.charAt(i);
            a = b + a;
        }

        int num = Integer.valueOf(a);

        if (number == num){
            System.out.println("The given number is palindrome number");
        }
        else
            System.out.println("The given number is not palindrome number");

    }
}
