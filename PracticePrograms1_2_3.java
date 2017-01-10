
/**
 * Ham Kalidindi
 * 9/9/16
 * Program 1 
 * A substance floats in water if its density (mass/volume) is less that 1 g/cm3. 
 * It sinks if it is  1 or more. Given the mass and volume of an object, calculate and print 
 * whether it sink or float along with it’s density. 
 */

import java.util.Scanner;
public class PracticePrograms1_2_3
{
    
      public static void main (String[] args){
        Scanner user_input = new Scanner(System.in);
        
        //Initiates all the variables as doubles
        double mass, volume, density;
        
        //Gets user input for mass
        System.out.println("What is the mass of the substance? ");
        mass = user_input.nextInt();
        
        //Gets user input for volume
        System.out.println("What is the volume of the substance? ");
        volume = user_input.nextInt();
        
        //Calculates the density of the substance
        density = mass/volume;
        System.out.println("Density = " + density);
        //Displays the density and whether or not the substance can float
        if (density > 1)
            System.out.println("The substance will sink! ");

        else
            System.out.println("The substance will float! ");
        }        
       
        
        /**
         * Program 2
         * B = Given the lengths of three sides of a triangle, print whether the triangle is scalene,
         * isosceles, or equilateral.
         * A = Also let the user to enter the angles of the triangle and test to see if it is a right,
         * isosceles or equilateral.
         */
       /* 
        public static void main (String[] args){
            //Gets user input for the three sides of a triangle
            Scanner user_input = new Scanner(System.in);
            int side1;
            int side2;
            int side3;
            
            System.out.println("Side 1 length? ");
            side1 = user_input.nextInt();
            System.out.println("Side 2 length? ");
            side2 = user_input.nextInt();
            System.out.println("Side 3 length? ");
            side3 = user_input.nextInt();
            
            
            //Determines if the triangle is Scalene
            if (side1 > side2 && side1 > side3 && side2 != side3){
                System.out.println("This triangle is Scalene ");
            }
            else if(side2 > side1 && side2 > side3 && side1 != side3){
                System.out.println("This triangle is Scalene ");
            }
            else if(side3 > side1 && side3 > side2 && side1 != side2){
                System.out.println("This triangle is Scalene ");
            }
            //Determines if the triangle is Isosceles
            else if(side1 > side2 && side1 > side2 && side2 == side3){
                System.out.println("This triangle is Isosceles ");
            }
            else if(side2 > side1 && side2 > side3 && side1 == side3){
                System.out.println("This triangle is Isosceles ");
            }
            else if(side3 > side2 && side3 > side1 && side1 == side2){
                System.out.println("This triangle is Isosceles ");
            }
            //Determines if the triangle is Equilateral
            else if(side1 == side2 && side1 == side3 && side2 == side3){
                System.out.println("This triangle is Equilateral ");
            }
            
               */
        
        
       
        /**
         * Program 3
         * Write a program to determine whether a student is eligible for honors on graduation day.
         * The student must be a senior with at least a 3.5 gpa out of a possible 4.0.
         * Use a nested if in the program.
         */
        /*
        public static void main (String[] args){
         //User inputs the year
         Scanner user_input = new Scanner(System.in);
         int year;
         double gpa;
         
         System.out.println("What year are you? (9-12) ");
         year = user_input.nextInt();
         
         //Checks if the user is a senior
         if (year !=12){
            System.out.println("You are not a senior!");
        }
        //Finds ou the gpa of the user
        else if (year == 12){        
            System.out.println("What is your GPA out of 4.0? ");
            gpa = user_input.nextDouble();
            
            //Determines if the user's gpa is high enough
            if (gpa >= 3.5){
                System.out.println("You are eligible for honors on graduation day!");
            }
            else if (gpa < 3.5){
                System.out.println("You need a GPA of at least 3.5 to be eligible");
            }
        }
       }    
       */
    }
