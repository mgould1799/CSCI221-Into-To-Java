import java.text.*;
/**
 * This class is the super class to keep track of the tickets created and keeps track of the ticket number
 * 
 * @Meagan Gould
 * @version (a version number or a date)
 */
public abstract class Ticket
{
    //instance variable
    private int ticketNumber;
    
    //constructor initilizes the ticket number
    public Ticket(int number)
    {
        ticketNumber=number;
        //price=generalPrice;
    }
    //creates the abstract method for ticket price
    public abstract int getPrice();
    //creates the toString method for the class needs
    public String toString()
    {
        String returnString="ticket number "+ticketNumber;
        returnString+=" price "+ NumberFormat.getCurrencyInstance().format(getPrice()); 
        return returnString;
    }
}
