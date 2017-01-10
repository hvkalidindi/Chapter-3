

/**
 * Ham Kalidindi
 * 10/11/16
 * Palindrome Program
 * User enters a sentence and the program returns whether or not it is a palindrom
 */
import java.util.Scanner;
public class Palindrome_Program
{
   public static void main(String args[])
   {
          
        //Variables
        String sentence, reverse = "";
        Scanner keys = new Scanner(System.in);
        
        //Collects user input
        System.out.print("Enter a sentence: ");
        sentence = keys.nextLine();
        
        //Removes spaces from string
        sentence = sentence.replace(" ", "");
        
        for (int k = sentence.length() -1; k >= 0; k--)
        {
            reverse += sentence.charAt(k);
        }
        
        //Sets both strings to lowercase for accurate comparison
        sentence = sentence.toLowerCase();
        reverse = reverse.toLowerCase();
       
        //Checks if strings are equal
        if (sentence.equals(reverse))
            System.out.println("Bruh, it's a palindrome");
        else
            System.out.println("Bruh, that's not a palindrome");
            
   }
}
