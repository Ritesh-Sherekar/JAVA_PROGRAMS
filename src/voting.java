// Write a function that takes age as a input and return if the person is eligible for voting or not.

import java.util.*;
public class voting {

    public static void personEligible(int p){
        if(p<=0){
            System.out.println("Invalid Person");
        }
        if(p>=18){
            System.out.println("The Person is Eligible For Voting");
        }else{
            System.out.println("The Person is Not Eligible For Voting");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int p = sc.nextInt();

        personEligible(p);
    }
}
