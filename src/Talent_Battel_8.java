// Write a program to find Number of digits in an integer

import java.util.Scanner;
public class Talent_Battel_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :-");
        int Number = sc.nextInt();

        int sum=0, m;
        while(Number>0){
            m = Number%10;
            sum++;
            Number = Number/10;
        }
        System.out.println(sum);
    }
}
