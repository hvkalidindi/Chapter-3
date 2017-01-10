

/**
 * Write a description of class IntroLoop2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class IntroLoop2
{
    public static void main (String[] args)
     {
    int min, max, number, range;
    
    Scanner user_input = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    max = user_input.nextInt();
    
    min = max;
    for (int count = 2; count <= 10; count++)
    {
       System.out.print ("Enter another integer: ");
       number = user_input.nextInt();
       if (number > max)
          max = number;
       if (number < min)
          min = number;
    }
    System.out.println ("The highest value is :" + max);
    System.out.println ("The highest value is :" + min);
    range = max-min;
    System.out.println ("Range: " + range);
  }
}
