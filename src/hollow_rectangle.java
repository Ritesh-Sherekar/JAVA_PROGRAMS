// Hollow Rectangle :-
// *****
// *   *
// *   *
// *****


// In this * is only on that position which contain i= 1,n , j= 1,m  ,this problem solved by row and colum wise
//

import java.util.*;
public class hollow_rectangle {
    public static void main(String[] args) {
        int n=4;
        int m=5;

        //outer loop
        for (int i=1; i<=n; i++){
            // inner loop
            for (int j=1; j<=m; j++){
                // condition
                if (i==1 || j==1 || i== n || j==m){
                    System.out.print("*");
                }else {    // this else is use to represent the hollow portion.
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
