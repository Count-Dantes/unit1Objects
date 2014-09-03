import java.util.Random;

/**
 * Random number generator
 * 
 * @Arresh Amleshi 
 * 1.0
 */
public class d6Rng
{
   public static void main(String[] args)
   {
       Random Generator = new Random();
       System.out.print("The dice has just rolled a ....");
       int number = Generator.nextInt(6) + 1;
       System.out.println(number);
    }

}
