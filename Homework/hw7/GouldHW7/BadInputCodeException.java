
/**
 * extends the exception class  that takes a message for a bad input code exception 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadInputCodeException extends Exception
{
    //constructor for bad input code exception 
    public BadInputCodeException(String message)
    {   
        super(message);
    }
}
