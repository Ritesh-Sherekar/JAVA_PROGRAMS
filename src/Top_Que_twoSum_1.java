//Given an array of integer nums and an integer target, return indices of the two numbers such that they
// add up to the target. You may assume that each input would have exactly one solution,and you may not use
// the same element twice.You can return the answer in any order.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.Scanner;
public class Top_Que_twoSum_1 {

    public static void twoSum(int n, int[] array , int tag){
        int sum =0;
        for (int i=0; i<array.length; i++){

            
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter size of array :-");
        int s = Sc.nextInt();
        System.out.println("Enter the element of array :- ");
        int[]  arr = new int[s];
        for (int i=0; i<s; i++){
            arr[i] = Sc.nextInt();
        }
        System.out.println("Enter the value of target :-");
        int tag = Sc.nextInt();

    }
}
