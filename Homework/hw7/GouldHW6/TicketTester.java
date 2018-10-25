import java.io.*; // for use of files
import java.util.*; // for use of Scanner class
/**
 * TicketTester exercises the Ticket hierarchy 
 * and the exception classes in creating an ordered 
 * list of Tickets.
 * 
 * Meagan Gould
 */
public class TicketTester
{

    public static void main(String [] args) {
        
        try{
            
            // the following line will throw a FileNotFoundException if 
            // the file specified cannot be found. 
            // DO NOT CHANGE FILE NAME when you submit
            File inputFile = new File("inputFile.txt");
            
            // add the code that reads from the input file and throws
            Scanner input = new Scanner(inputFile);
            
            // valid tickets will be stored, in order, in list
            ArrayList<Ticket> list = new ArrayList<Ticket>();
            //ArrayList<Ticket> list2 = new ArrayList<Ticket>();
            // The following code reads from the file and 
            // stores Ticket data into an ordered list
            
            // The loop to read the data encloses a 
            // try-catch block to process input from input file
            // and continue reading until every line from the file
            // is read and processed.
            System.out.println(list.size());
            int line1=0;
 while(input.hasNext())
            {
     try{
                    
                String line=input.nextLine();
                String [] lineList=line.split(" ");
                
                int typeOfTicket=Integer.parseInt(lineList[0]);
                int ticketNumber=Integer.parseInt(lineList[1]);
                int ticketDays=0;
                Ticket temp=null;
                line1++;
                
                if (lineList.length > 2)
                    ticketDays=Integer.parseInt(lineList[2]);
                if(typeOfTicket>3||typeOfTicket<=0)
                {
                    //go back and figure out to put line number in the code 
                    throw new BadInputCodeException("Bad Code "+typeOfTicket+" on line "+line1 + " of inputFile. Line ignored.");
                }
              else if(typeOfTicket==1)
                {
                    temp=new WalkupTicket(ticketNumber);
                   //list.add(temp);
                    //list.add(new WalkupTicket(ticketNumber));
                    
                   
                    }
        
                    
                else if(typeOfTicket==2)
                {
                    temp= new AdvanceTicket(ticketNumber,ticketDays);
                    //list.add(temp);
                    //list.add(new AdvanceTicket(ticketNumber,ticketDays));
                    
                }
                else if(typeOfTicket==3)
                {
                    temp= new StudentAdvanceTicket(ticketNumber,ticketDays);
                    //list.add(temp);
                    //list.add(new StudentAdvanceTicket(ticketNumber,ticketDays));
                
                }
                
                if(list.size()==0)
                    list.add(temp);
                else {
                    int i=0;
                    int compareVar=0;
                    boolean compare=false;
                    while(i<list.size()&&compareVar!=1)//compareVar!=1&&i<list.size())
                    {
                        compareVar=temp.compareTo(list.get(i));
                       // System.out.println("compare Var"+temp.toString()+" next is list "+list.get(i).toString() +compareVar);
                        if(compareVar==-1)
                            list.add(i,temp);
                        
                        
                        else
                            list.add(temp);
                            
                        
                        i++;
                            
                    }
                    System.out.println("approaching j loop");
                    int j=1;
                     while(j<list.size()&&compareVar!=1)//compareVar!=1&&i<list.size())
                    {
                        System.out.println("within the j loop");
                        int compareVar1=temp.compareTo(list.get(j));
                       // System.out.println("compare Var"+temp.toString()+" next is list "+list.get(i).toString() +compareVar);
                        if(compareVar1==-1)
                            list.add(j,temp);
                        
                        
                        else
                            list.add(temp);
                            
                        
                        j++;
                            
                    }
                    //list.add(temp);
                    
                }
                
                    
                /*for(int i=0;i<list.size();i++)
                {
                    if(list.size()>0)
                    {
                        int compareVar=temp.compareTo(list.get(i));
                        //int pos=list.get(i);
                        if(compareVar==-1)
                        {
                            list.add(i,temp);
                        }
                    }
                    else if(list.size()==0);
                        list.add(temp);
                }
                */
              
              
            }
                
        
                catch (BadTicketNumberException e)
                {
                        System.out.println(e.getMessage());
                    }
               catch (BadDaysRangeException e)
                {
                        System.out.println(e.getMessage());
                 }
        
                 catch (BadInputCodeException e)
                 {
                        System.out.println(e.getMessage());
                        //line1++;
                        System.out.println(line1);
                    }
                    System.out.println(list);
            }
                
            
            // You may add other methods, as necessary, to solve
            // this problem.
            
       }
       catch (FileNotFoundException e) {
           System.out.println("No file found!");
           // Program terminates, as there is not input to process      
       }  
       /*
       catch (BadTicketNumberException e)
       {
           System.out.println(e.getMessage());
        }
       catch (BadDaysRangeException e)
        {
            System.out.println(e.getMessage());
        }
        
       catch (BadInputCodeException e)
        {
            System.out.println(e.getMessage());
        }
        */
        
    }
}
