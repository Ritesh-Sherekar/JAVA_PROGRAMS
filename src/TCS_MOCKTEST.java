public class TCS_MOCKTEST {
    public static void main(String[] args) {
        String[] arr = {"ab" , "cd" , "bc" , "de"};

        String input = "za";

        for (int i=0; i<input.length(); i++) {
            char frontchar = input.charAt(i);
            char lastchar = input.charAt(input.length() - 1);

            for (int j = 0; j < arr.length; j++) {
                int leng = arr[j].length();
                char first = arr[j].charAt(i);
                char last = arr[j].charAt(leng - 1);

                if (lastchar == first){
                }else{
//                    String temp =
                }

            }
        }
    }
}
