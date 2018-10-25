import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * CSCI 221, Spring 2017, Programming HW 1
 * <Meagan Gould>
 *
 * This program analyzes movie review data to determine if words have a 
 * negative or positive meaning. If a word is used more often in positive 
 * reviews, it is assumed that the word is positive, and vice versa.
 * Currently, it reads review data line by line - each line is a single review in teh form:
 * <integer rating of movie> <Verbal review - text supporting the rating> <newline>
 * 
 * The program also searches through the list of movie reviews for specific words line by line. Option 1 searches for one 
 * word only. Option 2 searaches for words from a file and gets the average score from that. 
 * Option 3 gathers words from a file and seperatees the negative and positive reviews. Option 4 does not work
 * Finally, option 5 ends the program. 
 */
public class ProgHW1 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        
            // This scanner instance reads from the keyboard
            Scanner keyboard = new Scanner(System.in);
        
        
        //creates varibles needed and boolean for menu loop
        int reviewScore;
        String reviewText;
        String word;
        String reply;
        boolean menuLoop=true;
        
        
        //loop that runs the whole program for the menu option 
        while(menuLoop)
        {
        //menu displayed to ask the user what that would like to do 
        System.out.println("\nWhat would you like to do?\n1: Get the score of a word\n2: Get the average score of words in a file (one word per a line)\n3: Find the highest/lowest scoring words in a file\n4: Sort words from a file into positive.txt and negative.txt\n5: Exit the program\nEnter a number 1-5");
        int replyForMenu=keyboard.nextInt();
        System.out.println(" ");
        
       
        
        
         
        //if statement for if menu reply =1
        if(replyForMenu==1)
        
        {
            
            //boolean statements to be able to run loop for searching indivdual words over and over again
            boolean answer=true;
            boolean answer2=true;
       //loop to search for the word over and over again
        while(answer2) {
            //sets up the scanner for the movie review texts 
            File reviewFile = new File("movieReviews.txt");
        Scanner reviewScanner = new Scanner(reviewFile);
            
            //this gets the word to search for 
           System.out.println("Enter a word.");
           word = keyboard.next();
           
           //holds the total review score for the word searched
           int totatReviewScore=0;
        //this is the variable for how many times the score appeared in the file
            int scoreCount=0; 
            //this is the variable for the average score of the ratings gathered
            double avgScore=0;
            //this count how many times the word appeared in the the file
            int wordCount=0;
        
            
            while(reviewScanner.hasNext()&&replyForMenu==1)
            {
            
                // Read the numeric movie rating
                reviewScore = reviewScanner.nextInt();
                // Read the text of the verbal review
                reviewText = reviewScanner.nextLine();

                // If the review contains the word the user entered, print the 
                // rating and the review and continue; if it does not, process the
                // next review
                if(reviewText.contains(" "+word+" "))
                {
                    //System.out.println("Score: "+reviewScore);
                    //System.out.println("Text: "+reviewText);
                    
                    //adds to the word count 
                    wordCount++;
                    //adds to the score count
                    scoreCount++;
                    //adds to the total review score
                    totatReviewScore+=reviewScore;
                    
                    
                }
                    
                
            }  
            //System.out.printf("The average score is %.2f, and the word appearded %d times", avgScore,wordCount);
            //divides to get the total averge score within the file
            avgScore=(double) totatReviewScore/scoreCount;
            //prints out the word, how many times it appeared, and the average score 
            System.out.printf("%s appeared %d times, and the average rating is %.1f\n",word, wordCount,avgScore);
            
            //asks if the uses would like to run another word
            System.out.println("Would you like to run another word?");
            reply=keyboard.next();
            reply = reply.toLowerCase();
            //if statement to run loop again
            if(reply.equals("yes")||reply.equals("Yes"))
            {
                //answer=false;
                //answer2=true;
                answer2=true;
            }
            //else statement to end loop
            else
            {
                //(reply.equals("no") || reply.equals("No"))
                //answer2=false;
                answer2=false;
                
            
            }
            
            //boolean to run menu statement again 
            menuLoop=true;
        
              
        }  
    }
    
    //if statement for option 2 
    else if (replyForMenu==2)
    {
        //creates the scanner  for movie review once again 
        File reviewFile = new File("movieReviews.txt");
        Scanner reviewScanner = new Scanner(reviewFile);
        String fileWord;
        
        //gets the file name for the words to search
        System.out.println("Enter a file with words that you would like to scan the movie reviews for");
        fileWord= keyboard.next();
        //creates the scanner to use for file words
        File wordPileReview = new File(fileWord);
        Scanner wordPileScanner = new Scanner(wordPileReview);
        
        //creates the scoreTotal and avgScore and count varaibles again 
        double avgScoreOfAllWords=0;
        double scoreTotal2=0;
        double count2=0;
        
        //loop for the movie text file to run
        while (wordPileScanner.hasNext())
        {
            File reviewFile2 = new File("movieReviews.txt");
            Scanner reviewScanner2 = new Scanner(reviewFile2);
            
            
            //creates the word that is being searched
            word=wordPileScanner.nextLine();
            //System.out.println(word);
            
            //loop to run through the word text file 
            while(reviewScanner2.hasNext()&&replyForMenu==2)
            {
            
                // Read the numeric movie rating
                reviewScore = reviewScanner2.nextInt();
                // Read the text of the verbal review
                reviewText = reviewScanner2.nextLine();
                //System.out.println(reviewScore);

                // If the review contains the word the user entered, print the 
                // rating and the review and continue; if it does not, process the
                // next review
                if(reviewText.contains(" "+word+" "))
                {
                    //System.out.println("Score: "+reviewScore);
                    //System.out.println("Text: "+reviewText);
                    //adds to score total 
                    scoreTotal2+=reviewScore;
                    //adds to count total 
                    count2++;
                    
                }
                    
            }  
           
            
        }
        //finds the average of the scores 
        avgScoreOfAllWords+=scoreTotal2/count2;
        //tells the average score for the word
        System.out.printf("The average score for %s was %f\n",fileWord,avgScoreOfAllWords);
        //if statement to tell if the file is negative or positive 
        if(avgScoreOfAllWords>=2.01)
                System.out.printf("The overall sentiment of %s is positive.\n",fileWord);
        else 
                System.out.printf("The overall sentiment of %s is negative.\n",fileWord);
        //boolean to be able to run the menu loop once again
        menuLoop=true;
               
            
        
        
}

//if statement for menu option 3 
else if (replyForMenu==3)
{
    //resets the movie scanner 
    File reviewFile = new File("movieReviews.txt");
        Scanner reviewScanner = new Scanner(reviewFile);
        String fileWord;
        
        //asks for the files needed to run the program and creates the scanner  
        System.out.println("Enter a file with words that you would like to scan the movie reviews for");
        fileWord= keyboard.next();
        File wordPileReview2 = new File(fileWord);
        Scanner wordPileScanner2 = new Scanner(wordPileReview2);
        
        //sets the min and max and creates the variable to tell what the negative and positive word for the file is 
        double min=2, max=2;
        String wordForPos="";
        String wordForNeg="";
        
        
        //loop to run through the file that contains the words for part 3
        while (wordPileScanner2.hasNext())
        {
            
            File reviewFile3 = new File("movieReviews.txt");
            Scanner reviewScanner3 = new Scanner(reviewFile3);
            
            //creates word for running the test 
            word=wordPileScanner2.nextLine();
            //System.out.println(word);
            
            //creates variable for avgScore and count 
             double avgScorePt3=0;
            double count3=0,totalScoreReview=0;
                
            
            //loop to run through the movie review scanner 
            while(reviewScanner3.hasNext()&&replyForMenu==3)
            {
            
                // Read the numeric movie rating
                reviewScore = reviewScanner3.nextInt();
                // Read the text of the verbal review
                reviewText = reviewScanner3.nextLine();
                //System.out.println(reviewScore);
               
                
                
                
                //if statement for if the word is in the file 
                if(reviewText.contains(" "+word+" "))
                {
                   //System.out.println("Score: "+reviewScore);
                   //System.out.println("Text: "+reviewText);
                   
                   //adds to the count variable and total review score
                   count3++;
                   totalScoreReview+=reviewScore;
                   
                   
                   
                }
                
             
            
        }
       //gets the avg score of an individual word 
          avgScorePt3=(double)totalScoreReview/count3;
        
          //if statements to figure out the min and max 
         if (avgScorePt3<min)
        {
            min=avgScorePt3;
            wordForNeg=word;
        }
        if(avgScorePt3>max)
        {
            max=avgScorePt3;
            wordForPos=word;
        }
        //boolean to run menu option again 
        menuLoop=true;
        
}
        //tells what the most positive and negative word is within the file 
        System.out.printf("\nThe most positive word was %s with a score of %f\n",wordForPos,max);
        System.out.printf("The most negative word was %s with a score of %f\n",wordForNeg,min);

}
//if statement for menu option 4 
else if (replyForMenu==4)
    //tells that option for is not working 
    System.out.println("Sorry that option is not working at this momemnt. Try again later.");
    //boolean to run the menu option once again 
    menuLoop=true;
//if statement to end the program 
if(replyForMenu==5)
{
    System.out.println();
    //boolean to end the menu loop 
    menuLoop=false;
}
}
}
}


