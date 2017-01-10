
/**
 * Ham Kalidindi
 * 9/19/2016
 * Draw Square 
 * @version (a version number or a date)
 */

import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;
public class Draw_Square

{
    public static void main(String[] args)
    {
    Random gen = new Random();
    StandardPen pen = new StandardPen();


    // puts the pen in the pos to start shape
    pen.up();
    pen.move(25);
    pen.turn(90); pen.move(25);
    pen.down();


    pen.setColor(Color.red);
    pen.move(100);
    pen.turn(90);
    pen.move(100);
    pen.turn(90);
    pen.move(100);
    pen.turn(90);
    pen.move(100);
    
    

    pen.move(-100);
    pen.turn(-90);
    pen.move(-100);
    pen.turn(-90);
    
    pen.setColor(Color.white);
    pen.move(50);
    
    pen.setColor(Color.blue);
    pen.turn(60);
    pen.move(50);
    pen.turn(60);
    pen.move(50);
    pen.turn(-30);
    pen.move(-85);

    
    /**/
}
}
