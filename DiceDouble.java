import java.util.Scanner;
import java.util.Random;
public class DiceDouble
{
    public static void main(String[] arg)
    {
         Scanner input = new Scanner(System.in);
   
         Random r=new Random();
    Random y=new Random();
    int x= 1 + r.nextInt(5);
    int z= 1+ y.nextInt(5);
    
    System.out.println("HERE COMES THE DICE");
    while(z!=x){
        
        
    System.out.printf("Roll #1:%d%n",x);
    System.out.printf("Roll #2:%d%n",z);
    
    int f= z+x;
    System.out.printf("The total is %d%n",f);
    
    }
 
    }
}