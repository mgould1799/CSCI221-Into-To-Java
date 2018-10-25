
/**
 * this is a special type of advance ticket for specifically students. it is half the price of an advance ticket
 * 
 * Meagan Gould
 * @version (a version number or a date)
 */
public class StudentAdvanceTicket extends AdvanceTicket 
{
    //constructor that creates the student advance tickets 
    public StudentAdvanceTicket(int number, int days) throws BadTicketNumberException, BadDaysRangeException 
    {
        super(number,days);
    }
    //return the price for the advance tickets
    public int getPrice()
    {
        return super.getPrice()/2;
    }
    //overrides the toString method to be specific for the student id 
    public String toString()
    {
        String returnString="";
        returnString+=super.toString();
        returnString+="(ID REQUIRED)";
        return returnString;
    }
    
}
