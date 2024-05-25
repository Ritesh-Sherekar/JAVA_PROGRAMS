// Enter 3 number from the user and make a function to print their average.

import java.*;
import java.util.Scanner;
public class average_of_three_number {

    public static void average(int a,int b, int c){
        float x;
        x = (a+b+c)/3;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        average(a,b,c);
    }
}
