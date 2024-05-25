// Write a program to identify if the character is a vowel or consonant

import java.util.Scanner;
public class Talent_Battel_1 {
    public static void main(String[] args) {
        System.out.println("Enter the character :-");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        char[] arr = {'a','e','i','o','u'} ;

        int count =0;
       for (int i=0;i<arr.length; i++){
//          if(arr[i] == a){
//               System.out.println("It is a vowel");
//           }
//           else
//               System.out.println("It is consonant");
           if (arr[i] == a){
               count++;
           }
       }
       if (count>0){
           System.out.println("It is a vowel");
       }
       else
           System.out.println("It is consonant");

        
    }
}
