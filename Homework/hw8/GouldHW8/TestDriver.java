
/**
 * This class is used to show that the copy method of the stack works.
 * Meagan Gould
 * @version (a version number or a date)
 */
public class TestDriver
{
    // main method for testing
    public static void main (String [] args)
    {
        Stack stack=new Stack();
        
        
         int item1 = 1, item2 = 0, item3=4;  
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
        int item4=0;
        System.out.println("stack");
        System.out.println(stack);
        stack.push(12345);
        while(stack.isEmpty()!=true)
        {
           item4 =stack.top();
           stack.pop();
           System.out.println(item4);
        }
        System.out.println("copy");
        System.out.println(copy);
        while(copy.isEmpty()!=true)
        {
            
           item1 =copy.top();
           copy.pop();
           System.out.println(item1);
        }
        
        //stack.push(123);System.out.println(stack);
        
        int reverseTest=reverse(123);
        System.out.println(reverseTest);
        int reverseTest2=reverse(98765);
        System.out.println(reverseTest2);
        
    }
    //This method reverses a number using the stack 
    public static int reverse(int num)
    {
        Stack stack=new Stack();
        int reverse=0;
        int incOfTen=1;
        int numToBeRev=num;
        while(numToBeRev!=0)
        {
            int mod=numToBeRev%10;
            stack.push(mod);
            numToBeRev=numToBeRev/10;
        }
        while(stack.isEmpty()!=true)
        {
           reverse+=stack.top()*incOfTen;
           stack.pop();
           incOfTen*=10;
        }
        return reverse;
       
    }
}
