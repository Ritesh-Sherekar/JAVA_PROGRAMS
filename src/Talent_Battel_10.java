// Write a program to identify if the number is Perfect number or not (Factor Addition)

import java.util.Scanner;
public class Talent_Battel_10 {
    public static void main(String[] args) {
        System.out.println("Enter the number :- ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        //int OriginalNum = num;
        int sum=0;
            for (int i=1; i<num; i++){
                if (num % i == 0){
                    sum = sum + i;
                }
            }
        if (num == sum){
            System.out.println("It is a perfect number ");
        }
        else
            System.out.println("It is not a perfect number ");
    }
}
