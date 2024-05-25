// Write a program to identify if the number is Prime number or not

import java.util.Scanner;
public class Talent_Battel_13 {
    public static void main(String[] args) {
        System.out.println("Enter the number :-");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count =0;
        for (int i=1; i<=number; i++){
            if(number % i == 0){
                count++;
            }
        }
        if (number == 1) {
            System.out.println("Number is not prime number");
        }else if (count > 2){
            System.out.println("Number is not prime number");
        }
        else
            System.out.println("Number is prime number");
    }
}
