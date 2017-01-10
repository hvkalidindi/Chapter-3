import java.util.Scanner;
import java.util.*;
public class Kalidindi_Ham_Fibonacci
{
    public static void main (String[] args)
    {
    
       Scanner user_input = new Scanner(System.in);
       
       //Variable that will be the number of terms in the sequence
       int terms = 0;
       
       //User inputs to determine length of the sequence
       System.out.print("How many terms do you want? ");
       terms = user_input.nextInt();
        
       //the first, second, and last terms
       int first = 0;
       int second = 1;
       int last = 0;
 
       System.out.println(""); 
       
       //If the user inputs 1 the output will always be 1
       if (terms == 1)
            System.out.print("Fibonacci sequence: 0");
       
       //If the user inputs 2 the output will always be 0,1
       else if (terms == 2)
            System.out.print("Fibonacci sequence: 0, 1");
       
       //Calculates the full sequence if the number of terms is 3 or more     
       else if (terms >= 3)
       {
            System.out.print("Fibonacci sequence: 0, 1, ");
            for (int count = 0; count <= terms - 3; count++)
            {
                last = first + second;
                first = second;
                second = last;
                System.out.print(last + ", ");
            }
       }
   }
}