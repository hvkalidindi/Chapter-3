
/**
Ham Kalidindi
9/13/16
Program 6
A program that reads three numbers and prints “increasing” if they are in increasing order,
“decreasing if they are in decreasing order, and “neither” otherwise.
Here “increasing” means “strictly increasing”, with each value larger that its predecessor.
The sequence 3 4 4 would not be considered increasing.
*/

import java.util.Scanner;
public class Program_6
{   public static void main (String[] args){
        Scanner user_input = new Scanner(System.in);
        
        int num1,num2,num3,pick;
        System.out.println("Enter the first number" );
        num1 = user_input.nextInt();
        
        System.out.println("Enter the second number" );
        num2 = user_input.nextInt();
        
        System.out.println("Enter the third number" );
        num3 = user_input.nextInt();
        
        System.out.println("Would you like this to be strict(1) or lenient(2)");
        pick = user_input.nextInt();
        if (pick == 1){
            if (num1 > num2 && num2 > num3){
                System.out.println("Decreasing");
            }   
            else if (num3 > num2 && num2 > num1){
                System.out.println("Increasing");
            }
            else {
                System.out.println("Neither");
            }
        }
        else if (pick == 2){
            if ((num1 > num2 && num2 > num3)||(num1 > num2 && num2 == num3)||(num2 > num3 && num1 == num2)){
                System.out.println("Decreasing");
            }   
            else if ((num3 > num2 && num2 > num1)||(num3 > num2 && num2 == num1)||(num3 == num2 && num2 > num1)){
                System.out.println("Increasing");
            }
            else {
                System.out.println("Neither");
            }
        }
    }
}