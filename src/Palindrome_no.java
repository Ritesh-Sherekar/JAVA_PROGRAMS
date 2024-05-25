//Given an integer x, return true if x is palindrome integer.
//An integer is a palindrome when it reads the same backward as forward.
//For example, 121 is a palindrome while 123 is not.


public class Palindrome_no {
    static boolean palindrome(int x){
       String str = String.valueOf(x);
       String a ="";
       char b;
       for (int i=0; i<str.length(); i++){
           b = str.charAt(i);
           a = b + a;
       }

        if(str == a){
            return true;
        }
        System.out.println(a);
        System.out.println(str);

       return false;
    }
    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }
}


// My logic is correct , but still it gives me a wrong answer ..... I hope so in feature , I well correct this
// question .