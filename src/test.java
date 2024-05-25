import java.io.FileNotFoundException;

class test{
    public static void main(String[] args) {
        //int[5] arr ={1,2,3,4,5} ;

        System.out.println("Ritesh");
        int arr[] = new int[5];

        try {
            System.out.println(arr[3]);
            int result = 5/0;
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Use Another method");
        }
        finally {
            System.out.println("I AM ALWAYS RUN");
        }
        System.out.println("Hello");
    }
}