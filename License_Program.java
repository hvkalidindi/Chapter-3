/**
 * Ham Kalidindi
 * 9/23/16
 * License Program 
 * Calculates the charge of a license plate sticker
 */
import java.util.Scanner;
import java.util.*;
import java.text.NumberFormat;

public class License_Program
{ 
     public static void main (String[] args)
     {
    Scanner user_input = new Scanner(System.in);
    Scanner Keyboard = new Scanner(System.in);
    
    
    int value = 0;
    
    //base cost
    int base = 200;
    
    //total cost
    double totalcost  = 34.5;
    
    //$10000 plate
    double plate1 = 0;
    
    //$20000 plate
    double plate2 = 0;
    
    //$40000 plate
    double plate3 = 0;

    //formatting
    NumberFormat money = NumberFormat.getCurrencyInstance();


    //having user input value of car
    System.out.print("What is the car value? ");
    value = Keyboard.nextInt();
    System.out.println(" ");

     //Calculates the costs for the plates depending on the value
    if (value - 10000 >= 0)
        plate1 = (value - 10000) * .02;


    else if (value - 10000 > 10000)
        plate1 = 200.0;

    if (value - 20000 >= 0)
        plate2 = (value - 20000) * .04;


    else if (value - 20000 > 20000)
        plate2 = 800.00;


    else if (value - 20000 < 0)
        plate2 = 0.0;

    if (value - 40000 >= 0)
        plate3  = (value - 40000) * .06;


    else if (value - 40000 < 0)
        plate3 = 0.00;

    //Calculates the final cost
    totalcost = plate1 + plate2 + plate3 + base;

    //Displays final cost
    System.out.println("Total cost of the license plate is " + money.format(totalcost));



  }
}