
/**
 * this is a test for a geolocation
 * 
 * Meagan Gould
 * @version (a version number or a date)
 */
public class GeoLocationClient
{   
    public static void main(String[] args)
    {
        //creates geolocations for the test
        GeoLocation stash= new  GeoLocation(34.988889,-106.614444);
        GeoLocation studio= new GeoLocation(34.989978,-106.614357);
        GeoLocation FBI= new GeoLocation(35.131281,-106.61263);
        
        //prints out longitude latitude, and distance from to check to make sure the functions are working
        System.out.printf("the stash is at latitude: %f, longitude: %f.",stash.getLatitude(),stash.getLongitude());
        System.out.printf("\nthe studio is at latitude: %f, longitude: %f.",studio.getLatitude(),studio.getLongitude());
        System.out.printf("\nthe FBI building is at latitude: %f, longitude: %f.",FBI.getLatitude(),FBI.getLongitude());
        System.out.printf("\nthe distance in miles between: \n\tstash/studio = %f \n\tstash/fbi = %f\n",stash.distanceFrom(studio),stash.distanceFrom(FBI));
        
    
    }
    
    
}
