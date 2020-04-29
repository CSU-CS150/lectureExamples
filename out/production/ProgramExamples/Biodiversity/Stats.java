//import java.util.Scanner;

public class Stats {
	
	/*
	 * Class variables for total, endangered, and
	 * threatened counts.  
	 */

	public static void main(String[] args) {
		Stats P6 = new Stats();
		P6.processFile(args[0]);
		P6.percents();
	}
	
	
	
	
	private void processFile(String file) {
		/*Provided
		 * Create an object of type CSVReader to use the methods
		 * in the other file. Initialize that object to the file 
		 * that holds your data. As long as the underlying 
		 * scanner is not null and there's information left in 
		 * the file, keep reading. Whatever the next line is, 
		 * pass it to processLine() as an array of Strings.
		 */
		CSVReader reader = new CSVReader();
		reader.initialize(file);
		while (reader.hasNext()) {
			processLine(reader.getNext());
		}
	}

	public void processLine(String[] line) {
		/*
		 * Input is a single line from the data csv. Determine 
		 * if the category is "Animal" or otherwise and 
		 * increment the appropriate counter. Based on
		 * the status (Endangered or Threatened), increment the
		 * corresponding counter. These counters are class
		 * variables, so they can be used in percents() with ease.
		 */
	}

	public void percents() {
		/*
		 * Calculate percentages for endangered and threatened 
		 * animals and plants. Following the provided format 
		 * in the instructions, print out these numbers
		 */
	}
}
