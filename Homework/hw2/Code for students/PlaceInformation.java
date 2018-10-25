
/**
 * This class creates a way to hold a place location. It stores a name, address, tags, and uses the 
 * the geolocation class to store information as well
 * Meagan Gould
 * @version (a version number or a date)
 */
public class PlaceInformation
{
    //initializer variables 
    private String name="";
    private String address="";
    private String tag="";
    private GeoLocation geo;
    
    //constructor
    public  PlaceInformation(String name, String address, String tag, double latitude, double longitude)
    {
        this.name=name;
        this.address=address;
        this.tag=tag;
        geo = new GeoLocation(latitude, longitude);
    }
    
    //returns the name
    public String getName()
    {
        return name;
    }
    
    //returns the address
    public String getAddress()
    {
        return address;
    }
    
    //returns the tags
    public String getTag()
    {
        return tag;
    }
    
    //returns a string
    public String toString()
    {
        
        return name+ "("+geo.getLatitude()+ ", "+geo.getLongitude();
    }
    public GeoLocation getLocation()
    {
        return geo;
    }
    
    //finds the distance from another location passed within the statement 
    public double distanceFrom(GeoLocation spot)
    {
        return geo.distanceFrom(spot);
    }
   
}
