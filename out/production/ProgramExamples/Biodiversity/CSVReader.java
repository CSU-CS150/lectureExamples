import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CSVReader {
	/*
	 * Keep a scanner and deliminator accessible to 
	 * this file and all of its methods. 
	 */
	private Scanner fileScanner;
	private static final String DELIMINATOR = ",";
	
	public void initialize(String file){
		/*
		 * Initialize the scanner to a file object
		 * and it can now read the csv data. Make 
		 * one call to .nextLine() because the 
		 * first line is column labels and this
		 * throws it out. Put this in a try-catch 
		 * block to handle problems reading the 
		 * file.
		 */
	}
	
	public boolean hasNext() {
		/*
		 * Was the scanner initialized? Does the scanner
		 * itself have a next line to read? If both are 
		 * true, return True. If either are false, return 
		 * False. This adds a null check to the stock 
		 * .hasNext() method.
		 */
		return false;
    }
	
	public String[] getNext() {
		/*
		 * If hasNext() returns True, get the next line 
		 * from the scanner. If that line is non-empty, 
		 * then turn that string into a string array, 
		 * splitting on your deliminator. Return that 
		 * array. What about if hasNext() is false?
		 */
		return null;
	}
	
	
	
}
