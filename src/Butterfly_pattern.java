// Butterfly_pattern :-
// *       *
// **     **
// ***   ***
// **** ****
// *********
// *********
// **** ****
// ***   ***
// **     **
// *       *


public class Butterfly_pattern {
    public static void main(String[] args) {
        int n= 5;

        // upper part
        for (int i=1; i<=n; i++){
            // first half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //second half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for (int i=n; i>=1; i--){
            // first half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //second half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
