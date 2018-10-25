
/**
 * This class allows a person to add to an array,find the size, insert into an array, find out if
 * an element is within the array or not, and displays the items within the list 
 * 
 * @Meagan Gould
 * @version (a version number or a date)
 */
public class StringList
{
    private int size=0;
    private String list[];
    
    
    //constructor creating the array and the capacity
    public StringList()
    {
        list=new String[10];
    }
    //returns the size of the array 
    public int size()
    {
        return size;
    }
    //enlarges the list by twice the amount
    private void enlarge()
    {
        String[] list2= new String[list.length*2];
        //System.out.println("New List");
        for(int i=0;i<list2.length;i++)
        {
            if(i<list.length)
            {
            list2[i]=list[i];
        }
            
        }
        System.out.println("inside of enlarge"+list2[10]+list2[11]);
        list=list2;
        
    }
    //adds an element to the array
    public void add(String a)
    {
        if(size<list.length)
        {
        list[size]=a;
        size++;
    }
       //adds to the list and enlarges it to make room 
       else if(size>=list.length)
       {
        this.enlarge();
        list[size]=a;
        size++;
        }
        
        
    }
    //inserts an element into the array and pushes the other elements down by one 
    //precondition:can only insert from 1 to size+1 from the users perspective 
    public void insert(String a, int location)
    {
        String tempA[] =new String[list.length];
        String tempB[];//=new String[list2.length];
        if(size<list.length)
        {
            //tempA=new String[10];
            
            
            for(int pos1=0;pos1<location+1;pos1++)
            {
                
                    tempA[pos1]=list[pos1];
                
            }
            tempA[location-1]=a;
            
            for(int pos2=location;pos2<tempA.length;pos2++)
            {
                tempA[pos2]=list[pos2-1];
            }
            //tempA[location-1]=a
            size++;

            for(int i=0;i<list.length;i++)
        {
            list[i]=tempA[i];
        }
        }
        //enlarging list if bigger
        else //if(size>=list.length)
        {
            
            this.enlarge();
            //String tempB[]=new String[list2.length];
            tempB=new String[list.length];
            for(int pos3=0;pos3<location;pos3++)
            {
                
                    tempB[pos3]=list[pos3];
                
            }
            //tempB[location-1]=a;
            for(int pos4=location;pos4<tempA.length;pos4++)
                tempB[pos4]=list[pos4-1];
            tempB[location-1]=a;
            
                size++;
            for(int j=0;j<list.length;j++)
            {
                list[j]=tempB[j];
            
            }
        
        }
        
        
    }
    
    //tells if an element is within the array 
    public boolean contains(String a)
    {
        boolean c=false;
        if(size<list.length)
        {
            for(int i=0;i<list.length;i++)
            {
                if(list[i]!=null)
                {
                    if(list[i].equals(a))
                    {
                        c=true;
                        return c;
                    }
                    else
                        c=false;
            }
            
        }
     }
     /*
        if(size>=list.length)
        {
             for(int j=0;j<list2.length;j++)
            {
                if(list2[j]!=null)
                {
                    if(list2[j].equals(a))
                    {
                        c=true;
                        return c;
                    }
                    else
                        c=false;
            }
        }
        
        
    }
    */
    return c;
}
    //finds and returns the position to which the searched element is in 
    public int find(String a)
    
      {
        int b=-1;
        
        for(int i=0;i<list.length;i++)
        {
                if(list[i]!=null)
                {
                    if(list[i].equals(a)&&list[i]!=null)
                        b=i+1;
                    
                    } 
        }
        return b;
    }
    //displays the elements of the array 
    public void displayList()
    {
        String returnString="";
        if(size<list.length)
        {
        returnString+="StringList: capacity " +list.length+", size "+size+"\n";
        for(int i=0;i<list.length;i++)
        {
            if(list[i]==null)
                returnString+="["+(i+1)+"]"+"null\n";
            else 
                returnString+="["+(i+1)+"]"+list[i]+"\n";
        }
    }
        else if(size>=list.length)
        {
        returnString+="StringList: capacity " +list.length+", size "+size+"\n";
            for(int j=0;j<list.length;j++)
        {
            if(list[j]==null)
                returnString+="["+(j+1)+"]"+"null\n";
            else 
                returnString+="["+(j+1)+"]"+list[j]+"\n";
        }
        }
        System.out.println(returnString);
    }
    
    //testing
    public static void main(String[] args)
    {
        StringList s=new StringList();
        s.displayList();
        s.add("blue");
        s.displayList();
        s.insert("green",2);
        s.displayList();
        //s.enlarge();
        //s.displayList();
        s.insert("JACE",3);
        //s.displayList();
        s.insert("MEAGAN",3);
        //s.displayList();
        
        System.out.println("find: blue "+s.find("blue"));
        System.out.println("contains: green "+s.contains("green"));
        System.out.println("contain RED: "+s.contains("RED"));
        System.out.println("contain JACE: "+s.contains("JACE"));
        System.out.println(s.find("JACE"));
        System.out.println(s.find("RED"));
        
        
        s.insert("RED",1);
        s.displayList();
        //s.insert("BLUE",15);
        //s.displayList();
        System.out.println("contain RED: "+s.contains("RED"));
        System.out.println("contain MEAGAN: "+s.contains("MEAGAN"));
        System.out.println("contain green: "+s.contains("green"));
        System.out.println("contain red: "+s.contains("red"));
        System.out.println("find: blue "+s.find("blue"));
        s.add("blue");
        s.add("si");
        s.add("add");
        s.add("cofc");
        //s.add("cs");
        s.add("phone");
        s.add("gould");
        //s.displayList();
        //s.insert("INSIDE",11);
        s.displayList();
        
    }
}

