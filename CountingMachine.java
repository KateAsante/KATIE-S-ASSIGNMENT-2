import java.util.Scanner;
public class CountingMachine 
{
    public static void main(String[]arg)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the maximum number to reach");
        int y=input.nextInt();
        for(int n = 0;n<=y;n++)
        {
            System.out.println(n + " ");
        }
    }
    
}
