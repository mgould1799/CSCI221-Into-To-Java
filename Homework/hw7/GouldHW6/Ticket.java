import java.text.*;
//import java.util.ArrayList;
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
    private static final int SIZE_OF_EVENT=1000;
    public static int [] ticketList= new int[SIZE_OF_EVENT];
    private int nextTicketSpotAvailable=0;
    
    //constructor initilizes the ticket number
    public Ticket(int number) throws BadTicketNumberException  
    {
        
        if(number<1)
            throw new BadTicketNumberException("Exception: Cannot sell ticket number "+number+". Invalid number provided.");
        
        for(int i=0;i<ticketList.length;i++){
            if(number==ticketList[i])
                throw new BadTicketNumberException("Exception: Cannot sell ticket number "+number+ ". Ticket number already in use");
            }
        ticketNumber=number;
        ticketList[nextTicketSpotAvailable]= number;
        nextTicketSpotAvailable++;
    
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
    public int getTicketNumber()
    {
        return ticketNumber;
    }
    public int compareTo(Ticket k)
    {
        /*int returnVal=0;
        if(k.getTicketNumber()==this.ticketNumber)
            returnVal=0;
        else if(k.getTicketNumber()<this.ticketNumber)
            returnVal=-1;
        else if(k.getTicketNumber()>this.ticketNumber)
            returnVal=1;
        return returnVal;
        */
        return Integer.compare(this.ticketNumber,k.ticketNumber);
        //return return b.getName().compareTo(a.getName());
    }
    
    
   
}
