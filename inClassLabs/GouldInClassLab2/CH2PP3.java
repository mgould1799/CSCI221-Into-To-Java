
/**
 * Meagan Gould
 * In class lab 2
 * Problem Chapter 2 Project 3
 * Due: Friday, January 20th, 10 pm
 */
import java.util.Scanner;
public class CH2PP3
//import java.util.Scanner;

{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a line of text without any punctuations.");
        String line1=keyboard.nextLine();
        String s[]=line1.split("\\s",2);
        System.out.println(s[1].substring(0,1).toUpperCase()+s[1].substring(1,s[1].length())+" "+s[0]);
        
    }
    
    
}
