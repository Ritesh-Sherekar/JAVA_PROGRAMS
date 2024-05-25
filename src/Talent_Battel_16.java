// If there are N people in the room then the first person has to shake hand with N-1 people and
// second person has to shake hand with N-1-1 people i.e., N-2 handshakes are possible. Thus, it goes on.
// So total hand shakes = N-1 + N-2 + N-3 +………+1 + 0

import java.util.Scanner;
public class Talent_Battel_16 {
    public static void main(String[] args) {
        System.out.println("Enter the number :-");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int s =0;
        for (int i=0; i<number; i++){
            s = s + i;
        }
        System.out.println("The total hand shakes is :- "+s);
    }
}
