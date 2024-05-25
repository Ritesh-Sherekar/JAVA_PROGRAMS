// Inverted_half_pyramide_with_no_with_180_d :-
//     1
//    12
//   123
//  1234
// 12345



public class Inverted_half_pyramide_with_no_with_180_d {
    public static void main(String[] args) {
        int n=5;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){        // 1 <= 4 2 <= 4 3<= 4 4<=4
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){         // 1 <= 1
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
