
/**
 * Write a description of class ch3notes_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.Scanner;
import java.io.*;
public class ch3notes_2
{
    public static void main (String[] args) throws IOException{
        
        //Scanner scanFile = new Scanner(System.in);
        
        /*
        int test;
        System.out.println("Guess my fav number \n"+"it is betweeen 1-20");
        
            //#1 ini your variables
            test = user_input.nextInt();
            
           //#2 test - must be boolean
           while (test != -9999)
           {
               if (test == 11)
                System.out.println("is the age of my sons Thomas and Charlie");
               else
                System.out.println("Guess again");
                
                //#3update your var
                test = keyboard.nextInt();
            }
            
       
            for(int i = 0, j = 20; i<j; i++, j--)
            {
                System.out.print("Hi" + i + "\t" + j + "\n");
            }
            */
           
           //Scanner is an Iterator
          /* Scanner scanFile = new Scanner(new File ("people.txt"));
           String name, address, phone;
           
           while(scanFile.hasNext*())
           {
               name = scanFile.next();
               address = scanFile.next();
               phone = scanFile.next();
               
               if (phone.substring(0,3).equals("630"))
                System.out.println(name +"\t"+phone.substring(4));
               else
                System.out.println(name +"\t"+phone);
            }    */
            Scanner scanFile = new Scanner(new File ("data\\obamatakebackamerica.txt"));
            
            String word;
            int count_p = 0, count_y = 0, count_n = 0, count_words = 0, count_j = 0;
            while (scanFile.hasNext())
            {
                word = scanFile.next();
                
                count_words ++;
                
                if (word.equalsIgnoreCase("People"))
                    count_p++;
                if (equalsIgnoreCase("job") || word.equalsIgnoreCase("jobs"))
                    count_j++
                }
            System.out.println("Wrong: " + count_n);
            System.out
    }
}