// Sort the given array in ascending order .
// array :-- { 7 ,8 , 3 , 1 , 2 }

// Time complexity = O(n^2)
// In the Bubble sort , we can compare element by it's upcoming element . if the first element is greater
// than their next element than swap that element.
// In this sort the Outer loop is run by (n-1) time.

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = { 7 ,8 , 3 , 1 , 2 };

        // Outer loop is for ( n-1 ) iteration
        for (int i=0; i<arr.length-1; i++){
            // Inner loop for sort
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
