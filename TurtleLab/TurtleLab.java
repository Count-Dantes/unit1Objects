//Arresh Amleshi
//Turtle lab
//makes pretty shapes and numbers
//revison hisory: ¯\_(ツ)_/¯

import java.awt.Color;
import java.util.Random;

public class TurtleLab
{
    public static void main(String args[])
    {
        
        World turtleWorld = new World(1000,750);
        Turtle arpan = new Turtle(50,50,turtleWorld);
        Color orange = new Color(232,118,0);
        Color blue = new Color(0,0, 255);
        //arpan creates the number 3
        //note that the turtles are named after people, they were origeonally
        //supposed to be replaced with images of said people
        arpan.setBodyColor(orange);
        arpan.setPenColor(orange);
        arpan.setPenWidth(10);
        arpan.penDown();
        arpan.turn(90);
        arpan.forward(150);
        arpan.turn(90);
        arpan.forward(95);
        arpan.turn(90);
        arpan.forward(150);
        arpan.backward(150);
        arpan.turn(-90);
        arpan.forward(95);
        arpan.turn(90);
        arpan.forward(150);
        //andrew creates the number 0
        Turtle andrew = new Turtle(300,50,turtleWorld);
        andrew.setPenColor(blue);
        andrew.setBodyColor(blue);
        andrew.setPenWidth(10);
        andrew.turn(90);
        andrew.forward(150);
        andrew.turn(90);
        andrew.forward(190);
        andrew.turn(90);
        andrew.forward(150);
        andrew.turn(90);
        andrew.forward(190);
        //Dhipak makes 6 because his bumpers broke
        Turtle dishwash = new Turtle(550,50, turtleWorld);
        dishwash.setPenColor(orange);
        dishwash.setBodyColor(orange);
        dishwash.setPenWidth(10);
        dishwash.turn(180);
        dishwash.forward(190);
        dishwash.turn(-90);
        dishwash.forward(100);
        dishwash.turn(-90);
        dishwash.forward(100);
        dishwash.turn(-90);
        dishwash.forward(100);
        //I get the easy job because I am cool
        Turtle arresh = new Turtle (805,50, turtleWorld);
        arresh.setPenColor(blue);
        arresh.setBodyColor(blue);
        arresh.setPenWidth(10);
        arresh.turn(180);
        arresh.forward(190);
        //arresh.win_everything
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
        topPoint.setBodyColor(random);
        leftPoint.setBodyColor(random);
        rightPoint.setBodyColor(random);
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

