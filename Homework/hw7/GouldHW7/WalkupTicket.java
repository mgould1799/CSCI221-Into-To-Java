
/**
 * this class models that of a walk up ticket price
 * 
 * Meagan Gould 
 * @version (a version number or a date)
 */
public class WalkupTicket extends Ticket

{
    //constant variable for walk up ticket price
    public static final int WALK_UP_TICKET_PRICE=50;
    
    //constructor for WalkUpTicket by creating the ticket number
    public WalkupTicket(int number) throws BadTicketNumberException 
    {
        super(number);
        //price=cost;
    }
    //returns the ticket price 
    public int getPrice()
    {
        return WALK_UP_TICKET_PRICE;
    }
}
