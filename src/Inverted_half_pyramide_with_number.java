// Inverted_half_pyramide_with_number :-
// 54321
// 5432
// 543
// 54
// 5



public class Inverted_half_pyramide_with_number {
    public static void main(String[] args) {
        int n=5;

        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
