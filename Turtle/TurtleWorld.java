import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle_1 = new Turtle(turtleWorld);
        turtle_1.setPenColor(Color.RED);
        turtle_1.setBodyColor(Color.RED);
        turtle_1.penDown();
        turtle_1.forward(50);
        Turtle turtle_2 = new Turtle(turtleWorld);
        turtle_2.setPenColor(Color.BLUE);
        turtle_2.setBodyColor(Color.BLUE);
        turtle_2.penDown();
        turtle_2.backward(50);
        turtle_1.turnLeft();
        turtle_2.turnLeft();
        turtle_1.forward();
        turtle_2.forward();
        turtle_1.turnLeft();
        turtle_2.turnLeft();
        turtle_1.forward(50);
        turtle_2.backward(50);
        turtle_1.penUp();
        turtle_2.penUp();
        turtle_1.forward(200);
        turtle_2.backward(200);
        turtle_1.turnRight();
        turtle_2.turnRight();
        turtle_1.forward(200);
        turtle_2.forward(200);
        turtle_1.penDown();
        turtle_2.penDown();
        turtle_1.turnLeft();
        turtle_2.turnLeft();
        turtle_1.turnLeft();
        turtle_2.turnLeft();
        turtle_1.forward(400);
        turtle_2.forward(400);
    }
}
