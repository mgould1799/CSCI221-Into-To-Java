
/**
 * Write a description of class minMaxAvg here.
 * 
 * @author (Meagan Gould) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class minMaxAvg
{
    public static void main(String [] args){
        // instance variables - replace the example below with your own
        Scanner keyboard= new Scanner(System.in);
        int max=0, min=0,sum=0,num2=0,num=0;
        float count=0;
        float avg=0;
        
        boolean run=true;
        
        while(run)
        {
            System.out.println("\nenter a value ");
            num=keyboard.nextInt();
            sum+=num;
            count++;
            min=num;
            max=num;
            if (num>max)
                max=num;
            else if(num<max)
                min=num;
            System.out.println("Do you wish to continue? If so, enter 0 for yes and 1 for no");
            num2=keyboard.nextInt();
            if (num2>=1)
                run = false;
            else if (num2<=0)
                run=true;
            }
            System.out.printf("\nmin number is %d\n",min);
            System.out.printf("\nmax number is %d\n",max);
            avg+=sum/count;
            System.out.printf("\navg number is %.1f\n",avg);
        }
        
            
    
}
