import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       
    
       System.out.println("Starting Taffy Timer...");
       Scanner input = new Scanner(System.in);
       
       while(true){
           System.out.println("Enter the temperature:");
           double temperature = input.nextDouble();
           
           
           if(temperature >= 270){
              System.out.println("Your taffy is ready for the next step!");
              break;
           }
           System.out.println("The mixture isn't ready yet.");
       }
    }
}
