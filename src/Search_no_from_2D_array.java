// Take a matrix as input from the user . Search for a given number x and print the indices at which
// it occurs .

import java.util.*;
public class Search_no_from_2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :- ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns :- ");
        int col = sc.nextInt();

        int[][] number = new int[row][col];

        // Input
        // row
        System.out.println("Enter the the elements :- ");
        for (int i=0; i<row; i++){
            // columns
            for (int j=0; j<col; j++){
                 number[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("Our matrix is :- ");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number which we want to search :- ");
        int x = sc.nextInt();

        for (int i=0; i<row; i++)
        {
            for (int j=0; j<col; j++){
                if (number[i][j] == x){
                    System.out.println("x found at location "+ "( " + i + " , " + j + " )");
                }
            }
        }

    }
}
