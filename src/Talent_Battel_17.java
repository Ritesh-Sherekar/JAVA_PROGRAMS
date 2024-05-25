//Get a string as input from user and print the length of the string without using strlen() or length()
// function.

import java.util.Scanner;
public class Talent_Battel_17 {
    public static void main(String[] args) {
        System.out.println("Enter the String :-");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        int i=0;
        for(char c : st.toCharArray()){
            i++;
        }
        System.out.println(i);
    }
}
