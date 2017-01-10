
/**
 * Ham Kalidindi
 * 9/19/16
 * Triangle Program 
 * Determines if the sides or angles entered by the user makes a trangle
 */
import java.util.Scanner;
public class Triangle_Program
{
    public static void main (String[] args){
        Scanner user_input = new Scanner(System.in);
        
        int choice,side1,side2,side3,angle1,angle2,angle3;
        
        System.out.println("Side(1) or Angle(2)" );
        choice = user_input.nextInt();
        
        if (choice == 1){
            System.out.println("Side 1: ");
            side1 = user_input.nextInt();
            
            System.out.println("Side 2: ");
            side2 = user_input.nextInt();
            
            System.out.println("Side 3: ");
            side3 = user_input.nextInt();
            
            if (side1 > 0 || side2 > 0 || side3 > 0){
                if (side1 + side2 >= side3 && side2 + side3 >= side1 && side1 + side3 >= side2){
                if (side1 != side2 && side2 != side3 && side3 != side1){
                    System.out.println("The triangle is Scalene");
            }
                else if (side1 == side2 && side2 == side3){
                    System.out.println("The triangle is Equilateral");
            }
                else if (side1 == side2 && side2 != side3 || side2 == side3 && side2 != side1 
                || side1 == side3 && side2 != side3){
                    System.out.println("The triangle is Isosceles");
            }
        }
            else {
               System.out.println("This is not a triangle");
            }
            }
            else{ 
               System.out.println("This is not a triangle");
      }
     }
        if (choice == 2){
            System.out.println("Angle 1: ");
            angle1 = user_input.nextInt();
            
            System.out.println("Angle 2: ");
            angle2 = user_input.nextInt();
            
            System.out.println("Angle 3: ");
            angle3 = user_input.nextInt();
           
            if (angle1 > 0 || angle2 > 0 || angle3 > 0){
                if (angle1 + angle2 + angle3 == 180){
                    if (angle1 == angle2 && angle2 == angle3){
                        if (angle1 == 0 || angle2 == 0 || angle3 == 0){
                            System.out.println("This is not a triangle");
                        }
                        else{
                            System.out.println("This triangle is Equilateral");
                        }
                    }
                    else if (angle1 == angle2 && angle2 != angle3 || angle1 == angle3 && angle1 != angle2
                    || angle2 == angle3 && angle2 != angle1){
                        if (angle1 == 0 || angle2 == 0 || angle3 == 0){
                           System.out.println("This is not a triangle");
                    }
                        else{
                           System.out.println("This triangle is Isosceles");
                    }
                    }
                    else if (angle1 != angle2 && angle1 != angle3 && angle2 != angle3){
                         if (angle1 == 0 || angle2 == 0 || angle3 == 0){
                         System.out.println("This is not a triangle");
                    }
                        else{ 
                        System.out.println("This triangle is Scalene");
                        }
                  }
               }
            else {
                System.out.println("This is not a triangle");
            }
     }
            else if (angle1 == 0 || angle2 == 0 || angle3 == 0){
                System.out.println("This is not a triangle");
            }
            else {
            System.out.println("This is not a triangle");
    }
    
 }
 }
}