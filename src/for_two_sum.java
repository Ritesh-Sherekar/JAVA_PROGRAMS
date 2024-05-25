// There is a one array and one target , In that array any two number sum is equal to the target ,
// if we get those two number in that array than return the index of that values
// Eg. array = [3,4,3] target = 6
// output will be [0,2] ==> 3 + 3 = 6


import java.util.Arrays;
import java.util.Scanner;

public class for_two_sum {
     static int[] twoSum(int[] nums , int target){
        for(int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i] == target - nums[j]){
//                    System.out.println(new int[] {i,j});
                    return new int[] {i , j};
                }
            }
        }

        return null;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value:-");
         int target = sc.nextInt();
         int[] a = {3 , 3 , 4 , 5 , 9};
         int[] sol = twoSum(a , target);
        System.out.println(Arrays.toString(sol));

    }
}
