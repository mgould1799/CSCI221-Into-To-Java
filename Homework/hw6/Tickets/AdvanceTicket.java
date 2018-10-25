
/**
 * this class models the advance tickets
 * 
 * Meagan Gould
 * @version (a version number or a date)
 */
public class AdvanceTicket extends Ticket
{
    // instance variables and control variables
    public static final int ADVANCE_TICKET_PRICE_LESS_THAN_10=40;
    public static final int ADVANCE_TICKET_PRICE_GREATER_THAN_10=30;
    private int days;
    
    //constructor uses super class for ticket number and sets the days to an instance variable
    public AdvanceTicket(int number, int days)
    {
        super(number);
        this.days=days;
        
    }
    //creates the getPrice method for this class
    public int getPrice()
    {
        int price=0;
        if(days<10&&days>1)
            price=ADVANCE_TICKET_PRICE_LESS_THAN_10;
        else
            price=ADVANCE_TICKET_PRICE_GREATER_THAN_10;
        return price;
    }
}
