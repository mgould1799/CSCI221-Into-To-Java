/**
 * 
 * Doctor class
 * 
 * This class simply models a doctor with a specialty. 
 *
 */
public class Doctor extends Person {
    
    // instance variable
    private String specialty;
    
    public Doctor(String name, String specialty)
    {
        super(name);
        this.specialty=specialty;
    }
 
    
    public String getSpecialty()
    {
        return specialty;
    }
    public String toString()
    {
        String returnString="";
        returnString+= "Name: " +super.getName() + "\n";
        returnString+="Specialty: "+specialty;
        return returnString;
    }
    
    public boolean equals(Object otherPerson)
    {
        boolean equals=false;
        if(otherPerson==null||!(otherPerson instanceof Person)||!(otherPerson instanceof Doctor))
            equals=false;
        else 
        {
           Doctor other= (Doctor) otherPerson;
           if((other instanceof Doctor)&&(other!=null)&&other.getName()==super.getName()&&other.getSpecialty()==specialty)
            equals=true;
        }
        return equals;
    }
    

} 