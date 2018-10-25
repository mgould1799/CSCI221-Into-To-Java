import java.util.Scanner;

/**
 * Lab 7 starter code
 * 
 * @author (McCauley) 
 */
public class Lab7
{

    public static void main(String [] args){
        int [] m;
        int [] n;
        int [] o;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Give three integers, for array sizes (they can be different):");
        int size1 = input.nextInt();
        int size2 = input.nextInt();
        int size3 = input.nextInt();
        m = new int[size1];
        n = new int[size2];
        o = new int[size3];
        
        // Put random integers in range 0-100 into each of m, n and o
        for (int i = 0; i < size1; i++)
           m[i] = (int)Math.round((Math.random() * 100));
        for (int i = 0; i < size2; i++)
           n[i] = (int)Math.round((Math.random() * 100));
        for (int i = 0; i < size3; i++)
           o[i] = (int)Math.round((Math.random() * 100));
       
        // Display contents of each using provide toPrint method
        System.out.println("m: " + toPrint(m, size1));
        System.out.println("n: " + toPrint(n, size2));
        System.out.println("o: " + toPrint(o, size3));
        System.out.println();
        // Tests of theSame
        System.out.println("Are m and n the same? " +Lab7.theSame(m,n));
        System.out.println("Are m and m the same? " +Lab7.theSame(m,m));
        System.out.println("Are n and a copy of n the same? " + Lab7.theSame(n,copy(n)));
        System.out.println("Are o and n the same? " +Lab7.theSame(o,n));
        System.out.println();
        
        // Tests of append
        System.out.println("m appended with n: " +toPrint(Lab7.append(m,n),size1+size2));
        System.out.println("m appended with m: " +toPrint(Lab7.append(m,m),size1+size1));
        System.out.println("n appended with m: " +toPrint(Lab7.append(n,m),size1+size2));
        System.out.println("o appended with n: " +toPrint(Lab7.append(o,n),size3+size2));
        System.out.println();
        System.out.println("After appending, have any of the arrays changed?");
        System.out.println("m: " + toPrint(m, size1));
        System.out.println("n: " + toPrint(n, size2));
        System.out.println("o: " + toPrint(o, size3));
        System.out.println();
        
        // Add tests of remove
    }
    
    // Accepts two arrays of int and returns true if they
    // are identical - store exactly the same values
    public static boolean theSame(int [] a, int [] b){
        // currently always returns true
        boolean isTrue=false;
        
        if(a.length==b.length)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]!=b[i])
                {
                    
                    isTrue=false;
                    return isTrue;
                }
                //else
                    //isTrue=true;
                
                }
               
         }
           
        return isTrue;
           
    }
    
    // Returns a new array that has b appended to the end of a
    public static int [] append(int [] a, int [] b) {
        // currently always returns null
        int newA[];
        newA=new int[a.length+b.length];
        int c=0;
        for(int i=0;i<a.length;i++)
         {
             newA[c]+=a[i];
             c++;
         }
         for(int k=0;k<b.length;k++)
         {
             newA[c]+=b[k];
             c++;
         }
               
        return newA;

    }
    
    // If index is a valid index into a, return a new array 
    // that has the element at index removed.
    // If index is invalid, return null, else return an 
    // array with a length 1 less than a's 
    public static int[] remove(int a[], int index){
        // currently always returns null
        return null;
    }
    
    // Utility method to generate a String representation
    // of any array of ints - send in a reference to the array
    // and the array size
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
    
    // return a copy of a
    public static int[] copy(int a[]){
        int[] copy = new int[a.length];
        for (int i = 0; i < a.length; i++)
           copy[i] = a[i];
        return copy;
    }
        

}
