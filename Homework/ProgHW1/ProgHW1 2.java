import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * CSCI 221, Spring 2017, Programming HW 1
 * <Your name goes here - NEVER SUBMIT ANY FILE WITHOUT PUTTING YOUR NAME IN IT>
 *
 * This program analyzes movie review data to determine if words have a 
 * negative or positive meaning. If a word is used more often in positive 
 * reviews, it is assumed that the word is positive, and vice versa.
 * Currently, it reads review data line by line - each line is a single review in teh form:
 * <integer rating of movie> <Verbal review - text supporting the rating> <newline>
 * 
 * <Add additional comments to further the purpose of this program.>
 */
public class ProgHW1 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		// Create file instance for input
		File reviewFile = new File("movieReviews.txt");
		// This scanner instance will read from the aforementioned file, which
		// must be in your BlueJ project directory for it to find it.
		Scanner reviewScanner = new Scanner(reviewFile);
		// This scanner instance reads from the keyboard
		Scanner keyboard = new Scanner(System.in);

		int reviewScore;
		String reviewText;
		String word;

		// Ask the user to enter a word
		System.out.println("Enter a word.");
		word = keyboard.nextLine();

		// This loop iterates as long as there is text in the file		
		while(reviewScanner.hasNext())
		{
			// Read the numeric movie rating
			reviewScore = reviewScanner.nextInt();
			// Read the text of the verbal review
			reviewText = reviewScanner.nextLine();

			// If the review contains the word the user entered, print the 
			// rating and the review and continue; if it does not, process the
			// next review
			if(reviewText.contains(word))
			{
				System.out.println("Score: "+reviewScore);
				System.out.println("Text: "+reviewText);
			}
		}
	}

}
