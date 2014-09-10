import java.awt.Color;
import java.util.Random;

public class TurtleLabLab
{
    public static void main(String args[])
    {
        World turtleWorld = new World(1000,750);
        Turtle Arpan = new Turtle(50,50,turtleWorld);
        Color orange = new Color(232,118,0);
        Color blue = new Color(0,0, 255);
        //Arpan creates the number 3
        Arpan.setPenColor(orange);
        Arpan.setPenWidth(10);
        Arpan.penDown();
        Arpan.turn(90);
        Arpan.forward(150);
        Arpan.turn(90);
        Arpan.forward(95);
        Arpan.turn(90);
        Arpan.forward(150);
        Arpan.backward(150);
        Arpan.turn(-90);
        Arpan.forward(95);
        Arpan.turn(90);
        Arpan.forward(150);
        //Andrew creates the number 0
        Turtle Andrew = new Turtle(300,50,turtleWorld);
        Andrew.setPenColor(blue);
        Andrew.setPenWidth(10);
        Andrew.turn(90);
        Andrew.forward(150);
        Andrew.turn(90);
        Andrew.forward(190);
        Andrew.turn(90);
        Andrew.forward(150);
        Andrew.turn(90);
        Andrew.forward(190);
        //Dhipak makes 6 because his bumpers broke
        Turtle Dishwash = new Turtle(550,50, turtleWorld);
        Dishwash.setPenColor(orange);
        Dishwash.setPenWidth(10);
        Dishwash.turn(180);
        Dishwash.forward(190);
        Dishwash.turn(-90);
        Dishwash.forward(100);
        Dishwash.turn(-90);
        Dishwash.forward(100);
        Dishwash.turn(-90);
        Dishwash.forward(100);
        //I get the easy job because I am cool
        Turtle Arresh = new Turtle (805,50, turtleWorld);
        Arresh.setPenColor(blue);
        Arresh.setPenWidth(10);
        Arresh.turn(180);
        Arresh.forward(190);
        //Arresh.win_everything
        //creates a random color
        Random Generator = new Random();
        Color random = new Color(Generator.nextInt(256)
        ,Generator.nextInt(256),Generator.nextInt(256));
        //Now the triangle begins
        //Because the triangele is essentiall 3 scribles imposed on
        //itself, I start the 3 points at different headings, but can move them all the same 
        //difference afterwards
        Turtle topPoint = new Turtle(500,430, turtleWorld);
        Turtle rightPoint = new Turtle(600,602, turtleWorld);
        Turtle leftPoint = new Turtle (400,602,turtleWorld);
        topPoint.setPenWidth(10);
        leftPoint.setPenWidth(10);
        rightPoint.setPenWidth(10);
        topPoint.setPenColor(random);
        leftPoint.setPenColor(random);
        rightPoint.setPenColor(random);
        topPoint.turn(210);
        rightPoint.turn(-30);
        leftPoint.turn(90);
        topPoint.forward(260);
        leftPoint.forward(260);
        rightPoint.forward(260);
        topPoint.turn(-120);
        leftPoint.turn(-120);
        rightPoint.turn(-120);
        topPoint.forward(350);
        leftPoint.forward(350);
        rightPoint.forward(350);
        topPoint.turn(-120);
        leftPoint.turn(-120);
        rightPoint.turn(-120);
        topPoint.forward(425);
        leftPoint.forward(425);
        rightPoint.forward(425);
        topPoint.turn(-90);
        leftPoint.turn(-90);
        rightPoint.turn(-90);
        topPoint.forward(20);
        leftPoint.forward(20);
        rightPoint.forward(20);
        
    }
}

