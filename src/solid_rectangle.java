// Solid Rectangel :-
// *****
// *****
// *****
// *****


import java.util.*;
public class solid_rectangle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and colums :- ");
        int n = Sc.nextInt();
        int m = Sc.nextInt();


        // Outer loop for colums
        for (int i=1; i<=n; i++){
            // inner loop for rows
            for (int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
