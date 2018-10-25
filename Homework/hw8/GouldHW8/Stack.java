import java.util.*;
/**
 * A FILO stack of ints.
 * -- "implements" IntStackInterface
 * -- stack implemented using an ArrayList
 * -- for efficiency purposes, the top of the stack
 * -- is the largest index in use.
 * 
 * @author McCauley
 */
public class Stack implements IntStackInterface
{
    // the stack is implemented using an ArrayList
    private ArrayList<Integer> stk;

    /**
     * Constructor for objects of class Stack
     */
    public Stack()
    {
        // initialise instance variables
        stk = new ArrayList<Integer>();
    }

    /**
     * item is added to the top of the stack
     */
    public void push(int item){
        stk.add(item); // top of stack is at largest index
    }
    
    /**
     * item at top of stack is removed
     * Precondition: stack is not empty.
     * **** User should verify that stack is not empty, 
     * **** before calling this method.
     */
    public void pop(){
        
        stk.remove(stk.size()-1);      
    }
    
    /**
     * returns a reference item at top of stack is returned
     */
    public int top(){
        
        return stk.get(stk.size()-1);
    }
    
    /**
     * Number of items on stack
     */
    public int size(){
        return stk.size();
    }
    
    /**
     * true when stack contains no items, false otherwise
     */
    public boolean isEmpty(){
        boolean returnBoolean=false;
        if(stk.size()==0)
            returnBoolean=true;
        return returnBoolean;
    }
    
    public Stack copy(){
        Stack copy= new Stack();
        //copy.push(3);
        //System.out.println(copy.top());
        int size=stk.size()-1;
        //System.out.println("I am trying to copy the stack");
        //for(int i=stk.size()-1;size>0;i--)
        for(int i=0;i<stk.size();i++)
        {
            //System.out.println("I am within the copy loop");
            copy.push(stk.get(i));
            size--;
            //System.out.println(copy.top());
            
        }
        return copy;
        
    }
    
    
}
