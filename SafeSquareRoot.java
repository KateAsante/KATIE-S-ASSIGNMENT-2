import java.util.Scanner;
public class SafeSquareRoot 
{
    public static void main(String[]arg)
    {
        Scanner input=new Scanner(System.in);
        int n;
        int r=0;
        System.out.println("Enter the number for its Sqaure root");
        n=input.nextInt();
        while(n>0 || n<0)
        {
           if(n<0)
           {
               System.out.println("Try again you cant find the sqaure root of a negative number ");
               n=input.nextInt();
               
           }
           else
           {
           
           Math.sqrt(n);
           System.out.println("Its square root is "+ Math.sqrt(n));
           break;
           }
     
        }
        System.out.println("You cant find the square root of a negative number ");
    }
}
