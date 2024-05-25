// This is the second method to find the given number is panlindrome number or not


public class Panlindrome_no_2 {
    static boolean panlindrome_2(int x){
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(panlindrome_2(121));
        System.out.println(panlindrome_2(3452));
        System.out.println(panlindrome_2(3443));
        System.out.println(panlindrome_2(456654));
    }
}
