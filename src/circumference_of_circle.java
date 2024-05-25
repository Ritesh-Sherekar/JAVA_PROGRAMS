// Write a function that takes in the radius as input and return the circumference of circle .

import java.util.*;
public class circumference_of_circle {

    public static double circumference(int r){
        double x = 1;
        x= 2*3.13 * r ;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println(circumference(r));
    }
}
