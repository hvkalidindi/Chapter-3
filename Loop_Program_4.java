

/**
 * Write a description of class Loop_Program_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Loop_Program_4
{
   public static void main (String[] args)
   {
      String sentence;
      Scanner user_input = new Scanner(System.in);

      System.out.println ("Enter a string of characters:");
      sentence = user_input.nextLine();

      for (int index=0; index < sentence.length(); index++)
         System.out.println (sentence.charAt(index));
   }
}
