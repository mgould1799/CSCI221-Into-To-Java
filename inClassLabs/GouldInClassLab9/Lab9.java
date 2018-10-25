/**
 * Process student grades
 * 
 * @author McCauley CHANGE TO YOUR NAME
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        // Declare and allocate array of grades for students
        // Each row represents the grades of one student.
        // All student have the same number of grades
        int [][] grade = {{15, 13, 13, 15, 10,11},
                          {15, 15, 15, 15, 13,12},
                          {0,  10, 0,  0,  5,0},
                          {12, 12, 12, 12, 15,16},
                          {15, 13, 13, 15, 10,13},
                          {15, 15, 15, 15, 14,14},
                          {0,  10, 10, 8,  5,7}, 
                          {12, 12, 0, 12, 15,9},
                          {11, 11, 0, 12, 15,13},
                          {15, 15, 15, 15, 14,0},
                          {10,10,10,12,12,0}};
        double [] average=new double[grade.length];;
        int [] min=new int[grade.length];
        int [] max=new int[grade.length];
        
        displayGrades(grade);
        
        System.out.println("average");
        for(int row=0;row<grade.length;row++)
        {
            double avg=0;
            for(int col=0;col<grade[row].length;col++)
            {
                avg+=grade[row][col]/grade[row].length;
            }
            average[row]=avg;
            System.out.println(average[row]);
        }
        System.out.println("min");
        for(int col2=0;col2<grade[col2].length;col2++)
        {
            int min1=grade[0][col2];
            //System.out.println(min1+"min1");
           
            for(int row2=0;row2<grade.length;row2++)
            {
                //min1=grade[0][col2];
                
                if(grade[0][col2]<min1)
                    min1=grade[row2][col2];
                    
            }
            min[col2]=min1;
            System.out.println(min[col2]);
        }
        System.out.println("max");
        for(int col3=0;col3<grade[col3].length;col3++)
        {
            int max1=grade[0][col3];
            for(int row3=0;row3<grade.length;row3++)
            {
               // max1=grade[0][col3];
                if(grade[row3][col3]>max1)
                    max1=grade[row3][col3];
            }
            max[col3]=max1;
            System.out.println(max[col3]);
        }
    }
    // Display grades
    // Precondtion: x is non-null
    public static void displayGrades(int [][] x){
        for(int i=0;i<x[i].length;i++)
        {
            System.out.printf("\t   Lab"+(i+1));
        }
        System.out.println();
        for (int row = 0; row < x.length; row++){
            System.out.printf("Student " +(row+1));
           for (int col = 0; col < x[row].length; col++)
            {
              
              System.out.printf("%8d", x[row][col]);
              
            }
           System.out.println();
        }
    }
}