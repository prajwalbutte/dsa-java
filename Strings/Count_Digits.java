package Strings;
import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        int count = 0;
        while (number!=0) {
          number /=10;
           count++;

            
        }
        System.out.println(count);
        

    }
    
}
