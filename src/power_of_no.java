// Two number enter by user , x and n . Write a function to find the value of one number raised to
// the power of another i.e. (x)n .


import java.util.*;
public class power_of_no {

    public static void power(int x , int n){
        int p =1;
        for (int i=1; i<=n; i++){
            p = p*x;
        }
        System.out.println(p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

       power(x,n);
    }
}
