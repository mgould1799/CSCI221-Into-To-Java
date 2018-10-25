
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
    public AdvanceTicket(int number, int days) throws BadTicketNumberException, BadDaysRangeException
    {
        super(number);
        this.days=days;
        if(days<0)
            throw new BadDaysRangeException(days+" Days in advance must be positive");
        else if(days>180)
            throw new BadDaysRangeException("Cannot sell a ticket "+days+" days in advance."); 
            
        
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
    public static void main(String[] args)
    {
        try{
        Ticket a=new AdvanceTicket(3,55);
        Ticket b=new AdvanceTicket(10,7);
        Ticket c=new AdvanceTicket(5,4);
        Ticket d=new AdvanceTicket(1,3);
        System.out.println("a compared to b "+a.compareTo(b));
        System.out.println("b compared to a "+b.compareTo(a));
        System.out.println("c compared to a "+c.compareTo(a));
        System.out.println("b compared to c "+b.compareTo(c));
        System.out.println("c compared to b "+c.compareTo(b));
        System.out.println("a compared to a "+a.compareTo(a));
        System.out.println("d compared to a "+d.compareTo(a));
        System.out.println("a compared to d "+a.compareTo(d));
    }
        catch(BadDaysRangeException e)
        {
            e.getMessage();
        }
        catch(BadTicketNumberException e)
        {
            e.getMessage();
        }
    }
}
