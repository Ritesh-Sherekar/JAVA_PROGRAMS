// Write a program to find Sum of digits of a number

import java.util.Scanner;
public class Talent_Battel_4 {
    public static void main(String[] args) {
        System.out.println("Enter the number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum=0, m;
        while (n>0){
            m=n%10;
            sum=sum+m;
            n=n/10;
        }
        System.out.println(sum);
    }
}
