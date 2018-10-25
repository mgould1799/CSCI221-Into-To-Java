
/**
 * Write a description of class PersonImproved here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

  public class PersonImproved
{
	
	 private String name="";
	 private int age=9;
	
	
	public void setName(String letters)
	{
		name=letters;
	}
	public void setAge(int num)
	{
		age=num;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public boolean sameName(String name2)
	{
		if (name==name2)
			return true;
		else
			return false;
	}
	public boolean sameAge(int age2)
	{
		if (age==age2)
			return true;
		else
			return false;
	}
	public boolean isOlderThan(PersonImproved name2)
	{
		if(name2.getAge()<age)
			return true;
		else
			return false;
	}
	public boolean isYoungerThan(PersonImproved name3)
	{
		if(name3.getAge()>age)
			return true;
		else 
			return false;
	}
}
