
/**

 * 
 * Meagan Gould
 * 
 * this class creates a system of hotel conference rooms.
 * it tells you the number, name, capacity, set up options, if its reconfigureable and how so
 * also tells you what rooms it can be combined with 
 */
public class Room
{
    //instance variables
    private String number;
    private String name;
    private int capacity;
    private char setUp;
    private boolean isReconfigurable = true; 
    private String configureOptions;
    private Room canBeCombinedWith = null;
    public static int numberOfRooms;
    public static int totalCapacity;
    
    
    //constructor
    public Room(String number, String name, int capacity, char setUp, boolean isReconfigurable, String configureOptions)
    {
        this.number=number;
        this.name=name;
        this.capacity=capacity;
        this.setUp=setUp;
        this.isReconfigurable=isReconfigurable;
        this.configureOptions=configureOptions;
        numberOfRooms++;
        totalCapacity+=capacity;
        
    }
    //updates canBeRoomed with variable with another room 
    public void updateCanBeRoomedWith(Room r)
    {
        this.canBeCombinedWith=r;
    }
    //gets the number of people the room can hold
    public int getRoomCapacity()
    {
        return capacity;
    }
    //adds recongiure options to the set up
    public void reconfigure(char option) //problem here // convert char to string and use something from movie reviews
    {       //use contains(string)
        String charString= Character.toString(option);
        if(isReconfigurable && configureOptions.contains(charString))//&&option==setUp?
            this.setUp=option;
    }
    //returns true if another room is capatiable or not
    public boolean isCompatibleWith(Room other)
    {
        boolean returnBool=false;
        if((this.capacity==other.capacity))
        {
            if(isReconfigurable ==true && this.configureOptions.equals(other.configureOptions))
            {
            
                returnBool=true;
            }
        }
        else 
            returnBool=false;
        return returnBool;
        }
        
   public String setUpStringReturn()
        {
          String configureOptionsString="";
          if (isReconfigurable)
          {
            for(int i=0;i<configureOptions.length();i++)
            {
                if(configureOptions.substring(i)=="U")
                 configureOptionsString+=" U-shape ";
                 if (configureOptions.substring(i)=="T")
                    configureOptionsString+=" Theatre Style ";
                if(configureOptions.substring(i)=="C")
                    configureOptionsString+=" Classroom ";
                if(configureOptions.substring(i)=="B")
                    configureOptionsString+=" Banquet ";
                if(configureOptions.substring(i)=="E")
                    configureOptionsString+=" Boardroom ";
                }
                
            
            }
            return configureOptionsString;
        }
        
           
    //structures the to string method for this class
    public String toString()
    {
        String returnString="";
        //String configureOptionsString="";
        returnString+="Room number:" + number;
        /*
        String configureOptionsString="";
          if (isReconfigurable==true)
          {
            for(int i=0;i<configureOptions.length();i++)
            {
                if(this.configureOptions.substring(i)=="U")
                 configureOptionsString+=" U-shape ";
                 if (this.configureOptions.substring(i)=="T")
                    configureOptionsString+=" Theatre Style ";
                if(this.configureOptions.substring(i)=="C")
                    configureOptionsString+=" Classroom ";
                if(this.configureOptions.substring(i)=="B")
                    configureOptionsString+=" Banquet ";
                if(this.configureOptions.substring(i)=="E")
                    configureOptionsString+=" Boardroom ";
                }
            }
            */
        if(!(name==null))
            returnString+="\n\t" +"room: " +name;
        if(capacity>0)
            returnString+="\n\t"+"capacity "+capacity;
        if(this.setUp=='T')
            returnString+="\n\t"+"set up: "+"Theatre";
        if(this.setUp=='C')
            returnString+="\n\t"+"set up: "+"Classroom";
        if(this.setUp=='U')
            returnString+="\n\t"+"set up: "+"U-shape";
        if(this.setUp=='B')
            returnString+="\n\t"+"set up: "+"Banquet";
        if(this.setUp=='E')
            returnString+="\n\t"+"set up: "+"Boardroom";
        if(isReconfigurable==true)
                returnString+="\n\t"+"reconfigure options "+setUpStringReturn();//go back and fix this and create another function
        if(!(this.canBeCombinedWith==null))
            returnString+="\n\tcan be combined with room # "+canBeCombinedWith.number;
            
         return returnString;   
       //return "Room number: \t"+this.number+"\n\tcapacity:\t"+ this.capacity+"\n\treconigure options:\t" +reconfigureOptions+"\n\tcan be comibed with room # " + this.canBeCombinedWith;
    }
    //returns the total number of rooms created 
    public static int getNumberOfRooms()
    {
        return numberOfRooms;
    }
    //returns the total capacity of the hotel 
    public static int getTotalCapacity()
    {
        return totalCapacity;
    }
    //updates can be combined with room with a room
    public void updateCanBeCombinedWith(Room r)
    {
        if(canBeCombinedWith!=null)
            canBeCombinedWith=r;
            
        }
        
     
        
        
    
}
