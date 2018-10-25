
/**
 * extends the exception class  that takes a message for a bad ticket numbr 
 * 
 * @Meagan Gould 
 * @version (a version number or a date)
 */
public class BadTicketNumberException extends Exception
{
    //constructor for badticketnumberexception
    public BadTicketNumberException(String message)
    {
        super(message);
    }
   
}
