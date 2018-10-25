import java.util.Scanner;

/**
 * Draw the figure shown on the Lab4 sheet with base width provided by user.
 * 
 * @author (YOUR NAME)  // <<<<===== Duh! then remove this comment 
 * @version (February 3, 2017)
 */
public class InClassLab4
{
   public static void main(String [] args)
   {
       int input=0;
       int runAns=0;
       Scanner keyboard = new Scanner(System.in);
       
       
       // Prompt user for an odd number, & keep asking until 
       // an odd number is provided.
       do{
           System.out.print("Please enter an odd number: ");
           input = keyboard.nextInt();
           
           runAns=input%2;
           
        }while (runAns==0);  // <<<<===== FIX THIS CONDITION then remove this comment 
       
        for(int i=1;i<=input;i++)
           {
               //System.out.print(i);
               for (int j=0;j<=input;j++)
               {
                   System.out.print(" ");
                   
                }
               for(int k=input;k<=1;k-2)
                   {
                       System.out.print("*")
                       System.out.print();
                    }
            }
       // Print triangle
        
        // YOUR SOLUTION GOES HERE and remove this comment
        
        
        
      }
}
