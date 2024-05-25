// Take an array as input form the user . Search for a given number x and print the
// index at which it occurs .

import java.util.*;
public class search_given_no_in_given_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :- ");
        int size = sc.nextInt();

        int[] number = new int[size];
        // Takes the array element from user
        System.out.println("Enter the " + size + " element :- ");
        for (int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        // Take the x element
        System.out.println("Enter the number which want to search :- ");
        int x = sc.nextInt();

        // Search the given element
        for (int i=0; i<size; i++){
            if (number[i] == x){
                System.out.println("The element4 " + x + " is in the index of " + i);
            }
        }
    }
}
