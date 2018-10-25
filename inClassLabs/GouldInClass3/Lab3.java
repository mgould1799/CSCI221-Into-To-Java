import java.util.Scanner;
/**
 * In class lab 3: Compute the cost of a coffee order.
 * 
 * @author (Meagan Gould) 
 * @version (January 25, 2017)
 */
public class Lab3
{
    public static void main(String [] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        // Get coffee order
        System.out.print("How many bags of coffee are you ordering? ");
        int bags = keyboard.nextInt();
        int bags2=bags;
        
        
        // Compute cost of coffee
        double coffeeCost = bags * 5.5;
        
        System.out.printf("\nNumber of bags ordered: %d - $%.2f\n",bags, coffeeCost);
        
        // Compute discount
        double discountAmount = 0;
        
        // add code here to compute discount
        if (bags2>=50 && bags2<150)
            discountAmount=.10;
        if (bags2>=150 && bags2<300)
            discountAmount=.20;
        if (bags2>=300)
            discountAmount=.30;
        
        
        double discount = coffeeCost*discountAmount;
        
        // add code here to compute discount
        
        
               
        System.out.printf("Discount: %.2f%%- $%.2f\n",discountAmount*100, discount);
        
        // Compute the boxes needed
        int largeBoxes = 0;
        int regularBoxes = 0;
        
        // add code here to compute box counts (use / and %)
        
        largeBoxes=bags/20;
        bags=bags%20;
        regularBoxes=bags/5;
        bags=bags%5;
        if (bags<=4 && bags>0)
            regularBoxes++;
        
        
        
        
        
        // Compute the cost of boxes - ADD CODE to compute box costs
        double costLargeBoxes = 0;
        double costRegularBoxes = 0;
        costLargeBoxes+=largeBoxes*1.5;
        costRegularBoxes+=regularBoxes*.5;
        
        // Computer cost of total order - ADD CODE to compute totalcost
        double costOfOrder = coffeeCost-discount+costLargeBoxes+costRegularBoxes;
        System.out.println("Boxes Used:");
        System.out.printf("\t"+ largeBoxes +" Large = $%.2f\n", costLargeBoxes);
        System.out.printf("\t"+ regularBoxes +" Regular = $%.2f\n", costRegularBoxes);
        System.out.printf("\nTotal Cost: $%.2f\n",costOfOrder);
     
      
    }
    
}
