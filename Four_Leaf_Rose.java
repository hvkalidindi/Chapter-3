import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;
import java.util.*;

public class Four_Leaf_Rose
{
public static void main(String[] args)
{
    Random gen = new Random();
    StandardPen pen = new StandardPen();

    // puts the pen in the pos to start shape
	
	pen.setColor(Color.red);
	
	for (double num = 0; num <=2*Math.PI; num += ((2)*Math.PI)/100)
	{
	    //so theta equals num 
	    double theta = num;
	    //finidng what r is 
	    double r  = Math.cos(2*theta);
	    //finidng the x and y cordinates
	    double x = r * Math.cos(theta)*100;
	    double y = r * Math.sin(theta)*100;
	    //moving the pen from cordinate to cordinate
	    pen.move(x,y);
	 }
}
}