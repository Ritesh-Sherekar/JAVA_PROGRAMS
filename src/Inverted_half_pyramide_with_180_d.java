// Inverted_half_pyramide_with_180_d :-
//     *
//    **
//   ***
//  ****



public class Inverted_half_pyramide_with_180_d {
    public static void main(String[] args) {
        int n=4;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){                  // 1 <= 3  2 <= 3  3 <= 3  4 <= 3
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
