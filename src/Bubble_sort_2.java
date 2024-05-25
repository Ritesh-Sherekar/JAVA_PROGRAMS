// Take the array input from user and print in those array in asending order.

import java.util.*;
public class Bubble_sort_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element :-");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array element :-");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        // sort
        for (int i=0; i<arr.length-1; i++){
            // compare
            for (int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
