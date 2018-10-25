
/**
 * extends the exception class  that takes a message for a bad days range exception 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadDaysRangeException extends Exception 
{
    //constructor method for bad ticket days
    public BadDaysRangeException(String message)
    {
        super(message);
    }
}
