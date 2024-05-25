public class C {
    public static void main(String[] args) {
        int n=5;
        for (int i=1; i<=n; i++){
            //For Space
            for(int j=n; j>n-i; j--){
                System.out.print(" ");
            }
            // For *
            for (int k=n; k>n-i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
