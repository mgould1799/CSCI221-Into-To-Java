import java.io.*; // for use of files
import java.util.*; // for use of Scanner class
/**
 * TicketTester exercises the Ticket hierarchy 
 * and the exception classes in creating an ordered 
 * list of Tickets.
 * 
 * YOUR NAME HERE
 */
public class TicketTester
{

    public static void main(String [] args) {
        
        try{
            
            // the following line will throw a FileNotFoundException if 
            // the file specified cannot be found. 
            // DO NOT CHANGE FILE NAME when you submit
            File inputFile = new File("inputFile.txt");
            
            // add the code that reads from the input file and throws
            Scanner input = new Scanner(inputFile);
            
            // valid tickets will be stored, in order, in list
            ArrayList<Ticket> list = new ArrayList();
            // The following code reads from the file and 
            // stores Ticket data into an ordered list
            
            // The loop to read the data encloses a 
            // try-catch block to process input from input file
            // and continue reading until every line from the file
            // is read and processed.
            
            // You may add other methods, as necessary, to solve
            // this problem.
            
       }
       catch (FileNotFoundException e) {
           System.out.println("No file found!");
           // Program terminates, as there is not input to process      
       }      
    }
}
