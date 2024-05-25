// Write a program to identify if the number is Armstrong number or not

import java.util.Scanner;
import java.math.*;
public class Talent_Battel_12 {
    public static void main(String[] args) {
        System.out.println("Enter the number :- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int OrgNum = num;

        int m, sum=0 , tsum =1;
        while (num>0){
            m = num % 10;
            sum++;
            num = num / 10;
        }

        int rem,add = 0, tadd = 0;
        while (num>0) {
            System.out.println(sum);
            rem = num % 10;
            add = (int) Math.pow(rem, sum);
            tadd = add + tadd;
            num = num / 10;
        }
        System.out.println(add);

        if (OrgNum == tadd){
            System.out.println("The given number is Armstrong Number");
        }
        else
            System.out.println("The given number is not Armstrong Number");
    }
}
