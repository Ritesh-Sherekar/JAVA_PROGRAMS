// Write a program to find Number of days in a given month of a given year


import java.util.Scanner;
public class Talent_battel_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month :-");
        int month = sc.nextInt();
        System.out.println("Enter Year :-");
        int year = sc.nextInt();

        if((month==2) && ((year%400==0) || ((year%100!=0)&&(year%4==0)))){
            System.out.println("Number of days is 29");
        }
        else if(month==2){
            System.out.println("Number of days is 28");
        }
        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println("Number of days is 31");
        }
        else if(month==4 || month==6 || month==9 || month==11){
            System.out.println("Number of days is 30");
        }
        else System.out.println("Invalid month");
    }
}
