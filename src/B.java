// * Reverse Triangle

public class B {
    public static void main(String[] args) {
        int n=5;
        //For row
        for (int i=0; i<n;i++){
            //Foe column
            for (int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
