package recursion;

public class palindrome {
    // ask teacher to fix
    public static boolean isPalindrome(String s){
        if(s.length() <= 1){
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length()-1)) {
                return isPalindrome(s.substring(1,s.length()-1));
            }
            else{
                return false;
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.print(isPalindrome("radar"));
    }

}
