
/**
 * Ham Kalidindi
 * 9/15/16
 * Leap Year Program 
 * Determines if the year the user inputs is a leap year or not
 */
import java.util.Scanner;
public class Leap_Year_Program
{
    public static void main (String[] args){
         //User input
        Scanner user_input = new Scanner(System.in);
        
        //User picks a year
        System.out.println("Pick a year ");
        int year = user_input.nextInt();
        
        //If the year is divisible by 100 it sets off another if
        if (year % 100 == 0){
            //if the year is divisible by 100 but also 400 it is a leap year
            if (year % 400 == 0){
                System.out.println("This is a leap year");
            }
            //if the year is divisible by 100 but not 400 it is not a leap year
            else{
                System.out.println("This is not a leap year");
            }
        }
        //Determines if the year, not divisible by 100, is a leap year or not
        else if (year % 4 == 0){
            System.out.println("This is a leap year");
        }
        else if (year % 4 != 0){
            System.out.println("This is not a leap year");
        }
        //Can't be a leap year if it is before the Gregorian Calendar was adopted
        else if (year < 1582){
            System.out.println("This year is before the Gregorian Calendar was adopted");
        }
            
    }
   }
