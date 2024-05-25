import java.util.*;
import java.util.Arrays;

public class sort_by_using_sort_method {
    public static void main(String[] args) {
        char arr[] = {'d','c','b','a'};

        // For sorting use Arrays.sort(arrayName);
        Arrays.sort(arr);
        //To print the sorted array
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
