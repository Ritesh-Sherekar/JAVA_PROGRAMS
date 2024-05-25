// write a program to find Fibonacci series

import java.util.Scanner;
public class Talent_Battel_5 {
    public static void main(String[] args) {
        System.out.println("Enter the number :-");
        Scanner Sc= new Scanner(System.in);
        int n = Sc.nextInt();

        int n1=0,n2=1,n3;
        System.out.print( n1 +" , "+ n2);
        for (int i=2;i<n;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" , "+ n3);
        }

    }
}
