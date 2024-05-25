// Write a program to identify if the character is an alphabet or not


import java.util.Scanner;
public class Talent_Battel_2 {
    public static void main(String[] args) {
        System.out.println("Enter the character :-");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        if (a>= 'a' && a<='z' || a>=  'A' && a<= 'Z'){
            System.out.println("It is a character");
        }
        else
            System.out.println("It is not a character");
    }
}
