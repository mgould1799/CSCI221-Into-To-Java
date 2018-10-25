
/**
 * Write a method to merge two ordered integer arrays into one
 *   ordered array.
 * Note arrays may be of any length.
 * 
 * @author (started by McCauley) 
 * MEGAGN GOULD
 * 
 */
public class Lab8
{
    public static void main(String [] args){
      // Create arrays for testing -what are good test cases?
      // Add more as necessary
      int [] one=  {1,2,2,3};
      int [] two= {-4,3,4,5,5};
      int [] three ={33,77,77,100,210, 1799};
      int [] four= {3,22};
      int [] five = {9};
      
      
      mergeAndPrint(one, two);
      mergeAndPrint(two, one);
      mergeAndPrint(two, three);
      mergeAndPrint(three, two);
      mergeAndPrint(three, four);
      mergeAndPrint(four, three);
      mergeAndPrint(four, five);
      mergeAndPrint(five, four);
      mergeAndPrint(one, one);
      

    }
    
    /*
     * Print arrays being merged before and after call to merge
     * Precondition: a & b non-null
     */
    public static void mergeAndPrint(int [] a, int [] b){
      System.out.println("Arrays to merge: "+ toPrint(a,a.length) + " and " + toPrint(b, b.length));
      System.out.println("  Result: " + toPrint(merge(a,b), a.length + b.length));  
    }
    /*
     * Preconditions: a and b non-null, but either could be of length 0. 
     *   a and b are ordered arrays.
     */
    public static int [] merge(int [] a, int [] b){
        
        int newA[];
        newA=new int[a.length+b.length];
        
        
        int i=0;//moves through a 
        int j=0;//moves through b 
        int k=0;//moves through newA
        while(i<a.length&&j<b.length)
        {
            if(a[i]>=b[j])
            {
                newA[k]=b[j];
                j++;
                k++;
            }
            else
            {
                newA[k]=a[i];
                i++;
                k++;
            }
            if(i>=a.length)
            {
                for(int index=j; j<b.length;index++)
                {
                    newA[k]=b[index];
                    k++;
                }
                
            }
            else
            {
                for(int index2=i;i<a.length;index2++)
                {
                    newA[k]=a[index2];
                    k++;
                }
            }
            
            
                
            
        }
        return newA;
        
    }
    
    // Utility method to generate a String representation
    // of any array of ints - send in a reference to the array
    // and the array size
    // Precondition: y is not null
    public static String toPrint(int [] y, int length){
        
        String toPrint = "";
        toPrint += "[";
        for (int i = 0; i < length; i++){
           toPrint +=y[i];
           if (i < length-1)
              toPrint +=", ";
        }
        toPrint +="]";
        return toPrint;
    }
}
