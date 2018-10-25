
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String [] args)
    {
        WalkupTicket a= new WalkupTicket(0);
        Ticket b= new AdvanceTicket(1,9);
        Ticket c= new AdvanceTicket(2,11);
        Ticket d= new AdvanceTicket(3,10);
        Ticket e= new StudentAdvanceTicket(4,9);
        Ticket f= new StudentAdvanceTicket(5,12);
        Ticket g= new StudentAdvanceTicket(6,10);
        Ticket [] ticketArray= {a,b,c,d,e,f,g};
        
        
        for(int i=0;i<ticketArray.length;i++)
        {
            System.out.println(ticketArray[i].toString());
        }
    }
}
