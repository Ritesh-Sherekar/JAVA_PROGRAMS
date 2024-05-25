public class new_02 {
    static void sum(int... b){
        int total = 0;
        for (int y1 : b){
            total = total + y1;
        }
        System.out.println("The Sum Of Given Array Is : " + total);
    }
    public static void main(String[] args) {

        sum();
        sum(10,20);
        sum(10,20,30,40,50);

        int a [] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        int sum = 0;
        for (int x1 : a){
            System.out.print(" " + x1);
            sum = sum + x1;
        }
        System.out.println();
        System.out.println("The Sum Of Given Array Is : " + sum);

    }
}
