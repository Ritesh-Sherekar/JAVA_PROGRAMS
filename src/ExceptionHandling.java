public class ExceptionHandling {
    public static void main(String[] args) {
        int arr[] = new int[5];

        System.out.println("Start");

        try {
            System.out.println(arr[8]);
            int result = 5/0;
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("ArrayOutOfBound");
        }

        System.out.println("End");

    }
}
