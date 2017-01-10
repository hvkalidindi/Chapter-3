

/**
 * Ham Kalidindi
 * 10/10/16
 * Even Odd Program
 * User enters a number and the program displays how many evens, odds, and zeros there are
 */
import java.util.Scanner;
public class Ch3_6_Program
{
  public static void main (String[] args)
   {
      //Counts the odds
      int odds = 0;
      
      //Counts the evens
      int evens = 0;
      
      //Counts the zeros
      int zeros = 0;
      
      //User's number
      int value;
      
      int digit;
      
      //User inputs a number
      Scanner scan = new Scanner(System.in);

      System.out.print ("Enter a number: ");
      value = scan.nextInt();
      
      //Makes the number positive no matter what
      value = Math.abs (value);
      
      //if the value is zero adds to zero count
      if (value == 0)
         zeros++;
     
      //Loop that discerns how many evens, odds, and zeros there are
      while (value > 0)
      {     
         digit = value % 10;
         
         if (digit == 0)
            zeros++;
         else
            if (digit%2 == 0)
               evens++;
            else
               odds++;

         value = value / 10;
      }
      
      //Displays how many evens, odds, and zeros there are
      System.out.println ("Zero digits: " + zeros);
      System.out.println ("Even digits: " + evens);
      System.out.println ("Odd digits: " + odds);
   }
}


/* 
OUTPUT:

Enter a number: 2390850
Zero digits: 2
Even digits: 2
Odd digits: 3


Enter a number: 3940033
Zero digits: 2
Even digits: 1
Odd digits: 4

*/