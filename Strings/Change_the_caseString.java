package Strings;
public class Change_the_caseString {
    public static void main(String[] args) {
        
        String s = "PAJAYA";

        int n = s.length();

        String up = s.toUpperCase();

        if(s.charAt(0) == up.charAt(0)){
            s.toUpperCase();
            System.out.println("Upper Case :" + s.toUpperCase());

        }
        else{
            System.out.println("LowerCase: "+s.toLowerCase());
        }

    }
    
}
