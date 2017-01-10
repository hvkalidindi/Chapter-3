

/**
 * Write a description of class Spiral_Program here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import TurtleGraphics.RainbowPen;
import java.util.Random;
import java.awt.*;
import java.util.*;
public class Spiral_Program
{
    public static void main(String[] args){
        RainbowPen pen = new RainbowPen();
        
        pen.up();
        pen.move(25);
        pen.turn(90);
        pen.move(25);
        pen.down();
        pen.setColor(Color.red);
        
        for (double num = 5; num <= 500; num += 5)
        {
            pen.move(num);
            pen.turn(90);
    }    
  }
}