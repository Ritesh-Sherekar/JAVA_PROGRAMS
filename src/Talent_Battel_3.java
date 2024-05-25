// Write a program to find the Quadrants in which coordinates lie

import java.util.Scanner;
public class Talent_Battel_3 {
    public static void main(String[] args) {
        System.out.println("Enter the two number :-");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        if (a==0 && b==0){
            System.out.println("Lies on the origin");
        }else if (a>0 && b>0){
            System.out.println("Lies in the first quadrant");
        }else if (a<0 && b>0){
            System.out.println("Lies in the second quadrant");
        }else if (a<0 && b<0){
            System.out.println("Lies in the third quadrant");
        }else if (a>0 && b<0){
            System.out.println("Lies in the forth quadrant");
        }
    }
}
