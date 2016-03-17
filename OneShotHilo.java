import java.util.Scanner;
import java.util.Random;
public class OneShotHilo
{
    public static void main(String[] arg)
    {
        Scanner input= new Scanner(System.in);
        Random r = new Random();
        int x = 1+ r.nextInt(99);
        int y;
        
        System.out.println("I'm thinking of a number from 1 to 100.Try guessing it ");
        y=input.nextInt();
        
        if(y>x)
        {
           System.out.printf("Your guess is too high,I was thinking of %s%n",x); 
        }
        else if(y<x)
        {
            System.out.printf("Your guess is too low,I was thinking of %s%n ",x); 
            
        }
        else 
        {
            System.out.printf("Your guess is right");
        }
    }
}
