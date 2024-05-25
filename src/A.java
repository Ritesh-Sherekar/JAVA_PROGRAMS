// * Triangle

public class A {
    public static void main(String[] args) {
        int n=5;
        // For row
        for (int i=0; i<n; i++){
            // For column
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
