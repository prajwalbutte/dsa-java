package Strings;

public class Palindrome_String {
    public static void main(String[] args) {

        String s = "naman";

        int i = 0;
        int j = s.length() - 1;
        boolean palindrome = false;

        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
                palindrome = true;
            }
            else{
                palindrome = false;

            }
            break;
        }
        if (palindrome) {
            System.out.println("String is palindrom");
        }
        else{
            System.out.println("String is not palindrome");
        }
        
    }
    
}
