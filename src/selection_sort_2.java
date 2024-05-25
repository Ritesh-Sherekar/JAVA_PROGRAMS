// Take the unsorted array from user and sort by using selection sort and print in asending order.
// array :- {7,8,3,1,2}

import java.util.*;
public class selection_sort_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :-");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the " + size + " element :- ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<arr.length-1; i++){
            int smallest = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println("The sorted array are :-");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
