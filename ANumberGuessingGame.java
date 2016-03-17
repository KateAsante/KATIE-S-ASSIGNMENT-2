import java.util.Random;
import java.util.Scanner;

public class ANumberGuessingGame
{
    public static void main (String[] args )
    {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int x = 1 + r.nextInt(10);
        int answer;
        
        System.out.println("I have chosen a number from 1 to 10 " );
        System.out.println("Your guess:" );
        answer = input.nextInt();
        
        if(answer == x)
            System.out.println("Nice one there" );
        else
            System.out.println("Sorry, but i was really thinking of " + x );
        
              
        
        
        
        
    }
}