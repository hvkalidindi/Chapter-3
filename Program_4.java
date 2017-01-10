
/**
 * Write a description of class Program_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Program_4
{
     public static void main (String[] args){
         //User input
        Scanner user_input = new Scanner(System.in);
        
        //Initiates variables
        int num1,num2,num3;
        System.out.println("Enter the first number" );
        num1 = user_input.nextInt();
        
        System.out.println("Enter the second number" );
        num2 = user_input.nextInt();
        
        System.out.println("Enter the third number" );
        num3 = user_input.nextInt();
        
        //User enters three numbers
        if ((num1 > num2 && num2 > num3)||(num1 > num2 && num2 == num3)||(num2 > num3 && num1 == num2)){
            System.out.println("In order");
        }   
        else if ((num3 > num2 && num2 > num1)||(num3 > num2 && num2 == num1)||(num3 == num2 && num2 > num1)){
            System.out.println("In order");
        }
        else {
            System.out.println("Not in order");
        }
    }
}