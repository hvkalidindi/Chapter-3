
/**
 * Ham Kalidindi
 * 9/21/16
 * Planet Program
 * Finds what your weight would be in different planets
 */
import java.util.Scanner;
public class Planet_Program
{
  public static void main (String[] args){
     Scanner user_input = new Scanner(System.in);
        
     double weight;
     char choice;
        
     System.out.println("Weight: " );
     weight = user_input.nextDouble();
     
     System.out.println("PLANETS");
     System.out.println(" ");
     System.out.println("Mercury (1)");
     System.out.println("Venus (2)");
     System.out.println("Moon (3)");
     System.out.println("Mars (4)");
     System.out.println("Jupiter (5)");
     System.out.println("Saturn (6)");
     System.out.println("Uranus (7)");
     System.out.println("Neptune (8)");
     choice = user_input.next().charAt(0);
     
     switch (choice)
     {
        case '1':
        weight = weight*.38;
        System.out.println(weight);
        break;

        case '2':
        weight = weight*.17;
        System.out.println(weight);
        break;
        
        case '3':
        weight = weight*.17;
        System.out.println(weight);
        break;
        
        case '4':
        weight = weight*.38;
        System.out.println(weight);
        break;
        
        case '5':
        weight = weight*2.54;
        System.out.println(weight);
        break;
        
        case '6':
        weight = weight*1.08;
        System.out.println(weight);
        break;
        
        case '7':
        weight = weight*.91;
        System.out.println(weight);
        break;
        
        case '8':
        weight = weight*1.19;
        System.out.println(weight);
        break;
        
        default:
        System.out.println("You must enter something from the menu!");
        break;
        }   
    }  
}