// Take an input array from user and find the largest element among them .


import java.util.*;
public class largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :- ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the element of that array :- ");

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j< arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("The greatest element in the array is :-" + arr[size-2]);
    }
}
