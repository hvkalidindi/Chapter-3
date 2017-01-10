
/**
 * Write a description of class ch3notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.util.Scanner;
public class ch3notes
{
    public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    Scanner Keyboard = new Scanner(System.in);

       /* int num = 5, num1 = 10;
        
        System.out.print("Enter a number ");
        num = Keyboard.nextInt();
        
        System.out.print("Enter a second number ");
        num1 = Keyboard.nextInt();
        
        System.out.println ();
        
        if (num < num1)
           {System.out.println (num + "\t<\t" + num1);
            }
            
        else
            System.out.println (num1 + "\t<\t" + num);
            */
           
           
       /*
       int base = 200;
       
       Scanner keyboard = new Scanner (Sytem.in);
       System.out.print("Enter price of car");
       double price = keyboard.nextDouble();
       double charge = 0;
       
       if (price > 40000)
            charge = base + 200 + 800 + (.06 * (price - 40000));
       else if (price > 20000)
            charge = base + 200 + (.04 * (price - 20000));
       else if (price > 10000)
            charge = base +(.02 * (price - 10000));
       else
            charge = base;
            
       System.out.printf("The sticker will cost you $" + charge );
           
        */
       
    /*
    double total = .01*1 + .05*2 + .10 * 3 + .25 * 4;
    System.out.println(total );
    
    final double TOLERANCE = .0001
    if (Math.abs(total-1.41)<TOLERANCE)
    
    //if (total == 1.41)
        System.out.println("Wow it works?" );
    else
        System.out.println("Hahaha tell what is going on, FIX IT!" );
    */  
   
   /*
    int age;
    System.out.println ("How old are you? ")
    age =  Keyboard.nextInt();
    
    if (age < 8)
        System.out.println("You must use a car seat");
    else if (age
    */
   
   /*
   String word = "apple";
   String word1 = new String ("cat");
 
   if (word.equals(word1))
   //if (word == word1)
        System.out.println (word + "=" + word1);
        
   else
        System.out.println (word1 + "!=" + word);
   
  
   if (word.compareTo(word1) <0)
        System.out.println (word + "<" + word1);
   else
        System.out.println (word1 + ">" + word);
   System.out.println(word.compareTo(word1));     
   */
  
  /*
   String fingers,skin;
   int grade;
   
   //nested ifs
   System.out.print("Do you have three fingers? y/n ");
   fingers = Keyboard.nextLine();
   
   System.out.print("Is your skin yellow? y/n ");
   skin = Keyboard.nextLine();   
   
   if (fingers == "y"){
       if (skin == "y"){
           System.out.println("You are a Simpson");
        }
        else{
            System.out.println("You are not a Simpson");
        }
    }    
    else{
    System.out.println("You are not a Simpson");
}
*/

/*

boolean a = true, b = false, c = true,d;
//System.out.println(a );
c = (a=true) || (b=true);
System.out.println(a + "-" + b + "-" + c);

c = (a=false) || (b=true);
System.out.println(a + "-" + b + "-" + c);

c = (a=false) && (b=true);
System.out.println(a + "-" + b + "-" + c);

c = (a=true) && (b=false);
System.out.println(a + "-" + b + "-" + c);
*/

Scanner keyboard = new Scanner(System.in);
char choice;

System.out.print("What would you like to buy?\n");
System.out.print("f) fries \n");
System.out.print("c) cheese\n");
System.out.print("s) small\n");

choice = keyboard.next().charAt(0);

//Choice and be an int,char,String
switch (choice)
{
    case 'f':
        System.out.print(".99");
    case 'c':
        System.out.print("1.50");
    case 's':
        System.out.print(".79");
    default:
        System.out.print("Incorrect Data");
        
    }

}

}
