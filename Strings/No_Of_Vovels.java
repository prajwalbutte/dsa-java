package Strings;

public class No_Of_Vovels{
    public static void main(String[] args) {
        
        String s = "prajwal";

        int vovcount = 0;

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ){
                vovcount++;
            }
        }

        System.out.println("Vovel count "+vovcount);

       

    }
}