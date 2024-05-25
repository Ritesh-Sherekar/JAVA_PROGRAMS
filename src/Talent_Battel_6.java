// Write a program to find ASCII values of a character

import java.util.Scanner;
public class Talent_Battel_6 {
    public static void main(String[] args) {
        System.out.println("Enter The Value :- ");
        Scanner sc= new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        int value = ch;
        System.out.println("ASCII Value Of "+ "ch "+ "Is "+ value);
    }
}
