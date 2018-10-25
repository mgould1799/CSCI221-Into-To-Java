
/**
 * Meagan Gould
 * In class lab 2
 * Problem Chapter 2 Example 6
 * Due: Friday, January 20th, 10 pm
 */
import java.util.Scanner;
public class Ch2Ex6

//the problem is that it does not allow you to enter the name for the output nor does it capitalize it
//to fix this i had to change the line to allow for an entering of the string and set a new variable for 
//      the name to captilized 

{

    public static void main(String[] args)
    {
        Scanner keyboard= new Scanner(System.in);
        int age;
        String name;
        System.out.println("Enter your age.");
        age=keyboard.nextInt();
        System.out.println("Enter your full name.");
        name=keyboard.next();
        //name2=name.char
        String newName=name.toUpperCase();
        System.out.println("Your name in uppercase is "+ newName+ " and you are " + age+ " years old.");
    }
    
    
}
