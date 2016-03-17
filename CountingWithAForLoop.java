import java.util.Scanner;
public class CountingWithAForLoop
{   
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = input.nextLine();

        for ( int n = 1 ; n <= 5 ; n = n+1 )
        {
            System.out.println( n + ". " + message );
        }

    }
}
