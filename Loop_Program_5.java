

/**
 * Ham Kalidindi
 * 10/4/16 
 * Star Program
 * Display *s in a special pattern
 */
public class Loop_Program_5
{
    /* B)
    public static void main (String[] args)
    {
       //Sets constant for max # of stars
       final int MAX_LIMIT = 10;
       
       
      for (int row = 1; row <=MAX_LIMIT; row++)
      { 
         //Adds spaces to the row
         for (int space = 1; space <= MAX_LIMIT-row; space++)
            System.out.print (" ");
         
         //Adds stars to the row
         for (int star = 1; star <= row; star++)
            System.out.print ("*");

         System.out.println();
      }
   }

   */
  
   /* D)
   
   public static void main (String[] args)
   {    
      //Sets max for *s
      final int MAX_LIMIT = 10;

      //Creates the top half of the diamond
      for (int row = 1; row <= MAX_LIMIT/2; row++)
      {


         //Loop that prints out spaces in each row
         for (int space = 1; space <= (MAX_LIMIT/2)-row; space++)
            System.out.print (" ");
            
         //Loop that prints out stars in each row
         for (int star = 1; star <= (row*2)-1; star++)
            System.out.print ("*");
          
         System.out.println();
      }

      // Creates the bottom half of the diamond
      for (int row = 1; row <= MAX_LIMIT/2; row++)
      {
          //Loop that prints out spaces in each row
         for (int space = 1; space <= row-1; space++)
            System.out.print (" ");
            
         //Loop that prints out stars in each row
         for (int star = 1; star <= MAX_LIMIT-(row*2)+1; star++)
            System.out.print ("*");
            



         System.out.println();
      }
   } */
   
}


/* OUTPUT 
 * B)
 *       *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********


D)
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

 */

