import java.util.Scanner;
public class CollatzSequence 
{
    public static void main(String[]arg)
    {
    Scanner input = new Scanner (System.in);
    int n;
    System.out.println("Enter your natural number");
    n=input.nextInt();
    while(n!=0)
    {
        if((n % 2 )==0)
        {
            n= n/2;
            System.out.printf("%d %n",n);
            if(n==1)
                    {
                        break;
                    }
        }
        else if((n % 2)!=0)
            {
            n=(3*n)+1;
            System.out.printf("%d %n",n);
            if(n==1)
                    {
                        break;
                    }
            }
    }
    
    }
}