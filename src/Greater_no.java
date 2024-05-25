// Write a function which takes in 2 number and return the greater of those two .

import java.util.*;
public class Greater_no {

    public static int greaterNo(int a , int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        System.out.println(greaterNo(a,b));
    }
}
