class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            if(ispali(words[i])){
                return words[i];
            }
        }
        return "";
    }
    public static boolean ispali(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
