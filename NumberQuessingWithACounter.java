import java.util.Scanner;

public class NumberQuessingWithACounter
{
    public static void  main(String[]arg){
    Scanner input= new Scanner(System.in);
    int n=8;
    int key;
    int tries=0;
        System.out.printf("Im thinking if a number between 1 to 10.Try guessing it %n Your Guess>");
        
        key=input.nextInt();
            while(n!=key && tries < 3)
            {
                System.out.println("That is incorrect.Guess again");
                key=input.nextInt();
                tries++;
            }
            if(n==key){
            System.out.printf("You are right,I was thinking of %d%n",n);
            }
            else
            {
                System.out.println("Im sorry you ran out of chances");
}
    }}


