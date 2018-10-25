import java.util.Scanner;
/**
 * In class lab 3: Compute the cost of a coffee order.
 * 
 * @author (YOUR NAME) 
 * @version (January 25, 2017)
 */
public class Lab3
{
    public static void main(String [] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        // Get coffee order
        System.out.print("How many bags of coffee are you ordering? ");
        int bags = keyboard.nextInt();
        
        // Compute cost of coffee
        double coffeeCost = bags * 5.5;
        
        System.out.printf("\nNumber of bags ordered: %d - $%.2f\n",bags, coffeeCost);
        
        // Compute discount
        int discountAmount = 0;
        
        // add code here to compute discount
        
        double discount = 0;
        
        // add code here to compute discount
        
        System.out.printf("Discount: %d%%- $%.2f\n",discountAmount, discount);
        
        // Compute the boxes needed
        int largeBoxes = 0;
        int regularBoxes = 0;
       
        // add code here to compute box counts (use / and %)
        
        // Compute the cost of boxes - ADD CODE to compute box costs
        double costLargeBoxes = 0;
        double costRegularBoxes = 0;
        
        // Computer cost of total order - ADD CODE to compute totalcost
        double costOfOrder = coffeeCost;
        System.out.println("Boxes Used:");
        System.out.printf("\t"+ largeBoxes +" Large = $%.2f\n", costLargeBoxes);
        System.out.printf("\t"+ regularBoxes +" Regular = $%.2f\n", costRegularBoxes);
        System.out.printf("\nTotal Cost: $%.2f\n",costOfOrder);
     
      
    }
    
}
