
/**
 * Write a description of class StackTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StackTester
{
    
    public static void main (String [] args)
    {
        int item1 = 1, item2 = 0, item3=4;  
        
        Stack stack = new Stack();    
        stack.push(item2); 
        stack.push(item1); 
        stack.push(item1 + item3);
        item2 = stack.top();
        stack.push(item3*item3); 
        stack.push(item2); 
        stack.push(3);
        item1 = stack.top(); 
        stack.pop();
        Stack copy=stack.copy();
        System.out.println("copy empty or not "+copy.isEmpty());
        System.out.println(item1 + " " + item2 + " " + item3);
        System.out.println("stack");
        while (!stack.isEmpty()){
           item1 =stack.top();
           stack.pop();
           System.out.println(item1);
        }
        System.out.println("copy");
        
        System.out.println(copy.isEmpty());
        while(copy.isEmpty()!=false)
        {
           item1 =stack.top();
           stack.pop();
           System.out.println(item1);
            
        }
        

    }
}
