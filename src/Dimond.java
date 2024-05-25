// Dimond :-

//     *
//    ****
//   ******
//  ********
// **********
// **********
//  ********
//   ******
//    ****
//     **
//      *





public class Dimond {
    public static void main(String[] args) {
        int n = 5;

        // upper part
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // first half Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Second half Star
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
                System.out.println();
            }

        // Lower part
        for (int i=n; i>=1; i--) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // first half Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Second half Star
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

