import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 4};

        int start =0;
        int end = arr.length-1;

        while(start< end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
