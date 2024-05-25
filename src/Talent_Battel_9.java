// Write a program to identify if the number is Strong number or not (Factorial Addition)

import java.util.Scanner;
public class Talent_Battel_9 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :-");
//        int n = sc.nextInt();

//        int Onum = n;
//        int m , tsum=0;
//        while (n>0){
//            int sum = 1;
//            m = n%10;
//            for (int i=1; i<=m; i++){
//                sum = sum * i;
//            }
//            tsum = sum + tsum ;
//            n = n/10;
//        }
//        if (tsum == Onum){
//            System.out.println("It is a strong number");
//        }
//       else
//            System.out.println("It is not a strong number");

        String s = "army";
        String a = "mary";
        char[] arr = s.toCharArray();
       // System.out.println(s.toCharArray());

        int count=0;
        for(int i=0; i<a.length();i++){
           for (int  j=0; j< arr.length; j++){
               if (s.charAt(i) == arr[j]){
                   count++;
               }
           }
        }
        if(count == s.length()){
            System.out.println("yes");
        }else
            System.out.println("No");
    }
}
