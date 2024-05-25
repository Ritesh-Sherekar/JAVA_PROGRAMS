// Write a function to print the sum of all odd number from 1 to n .

public class Sum_Of_All_Odd_no {

    public static void sumOfOddNo(int n){
        int sum=0;

        for (int i=1; i<=n; i++){
            if (i%2 != 0)
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumOfOddNo(8);
    }
}
