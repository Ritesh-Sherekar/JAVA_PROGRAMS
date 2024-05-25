// Half Pyramide :-
// *
// **
// ***


// Here The row number represent the how many star in the colum i.e. (Row No. == NO. of star in colum)


public class Half_pyramide {
    public static void main(String[] args) {
        int n=4;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
