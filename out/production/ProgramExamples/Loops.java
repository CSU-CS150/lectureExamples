import java.util.Scanner;

// Author: Westin Musser
// Date:
// Class: CS 150
// Email: wstnmssr@cs.colostate.edu

/*
 * Motivation:
 * Programs are very often interested in doing the same thing multiple times. whatever that 
 * "same thing" is varies across tasks, but the solution is nearly always the same: loops!
 * This program exemplifies three very basic loop structures: for, while, and do-while. 
 * Modify the existing loops to make them do more interesting things! If something goes wrong, 
 * reverting to the original code will give you working examples
 */

public class Loops {
	
	public static final String VOWELS = "aeiou";
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
//		forExample();
		
//		whileExample();
		
		doWhileExample();
	}
	
	/*
	 * For loop syntax involves three statements delimited by semicolons: 
	 * for(loop variable; loop condition; value change){}
	 * Statement 1: declare and initialize the loop variable, most commonly looks like "int i = 0"
	 * Statement 2: define the condition that must be true during any given iteration and will
	 * allow the lines of code inside the loop to execute. When this becomes false, stop looping
	 * Statement 3: change the loop variable in some way, eventually making your loop condition 
	 * false
	 */
	
	public static void forExample() {
		//print numbers 0-5
		for(int i = 0; i <= 5; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		String s0 = "for loops are cool";
		String s1 = "";
		
		//extract the vowels from a string
		for(int i = 0; i < s0.length(); i++) {
			//stop looping and do not execute further iterations
//			if(s0.charAt(i) == 'p') break;
  			//continue looping, but do not execute the rest of this iteration
//			if (s0.charAt(i) == 'o') continue;
			
			if(VOWELS.contains("" + s0.charAt(i))) {
				s1 += s0.charAt(i);
			}
		}
		System.out.println(s1);
		
	}
	
	/*
	 * While loop syntax involves only one statement with a boolean value:
	 * while(loop condition){}
	 * Statement 1: define the condition that must be true during any given iteration and will
	 * allow the lines of code inside the loop to execute. When this becomes false, stop looping
	 * This is similar to that of a for loop, but it's the only statement that the while loop 
	 * is paying attention to, so the value change that will eventually make the loop condition
	 * false should be found among the lines of code that execute each iteration; the code 
	 * inside the loop.
	 */
	
	public static void whileExample() {
		//print numbers 0-5 ... again
		int i = 0;
		while(i <= 5) {
			System.out.print(i + " ");
			i++; //without this line, the while loop will never stop iterating and eventually time out
		}
		
		System.out.println();
		
		//find summation of numbers
		int x = 1, sum = 0;
		while(x <= 10) {
			sum += x;
			x++;
		}
		System.out.printf("The sum of integers from 0 to %d is %d\n", x-1 , sum);
		
		//take off first and last characters of string until nothing is left
		String s0 = "I love while loops";
		while(s0.length() > 0) {
			System.out.println(s0);
			s0 = s0.substring(1, s0.length() - 1);
		}
	}
	
	/*
	 * Do-while loop syntax again only needs one expression, but it comes after the code to execute:
	 * do {
	 * } while (loop condition);
	 * Statement 1: define the condition that must be true after the first iteration and before any
	 * subsequent iteration and will allow the lines of code inside the loop to execute again. When this 
	 * becomes false, stop looping. The main and only significant difference between a while loop and a 
	 * do-while loop is that the block of code in a do-while loop is guaranteed to happen once. In a while 
	 * loop, the condition may be false the first time it's checked, resulting in its block of code never 
	 * being executed.  
	 */
	
	public static void doWhileExample() {
		//print numbers 10-0
		int i = 10;
		do {
			System.out.print(i + " ");
			i--;
		}while(i >= 1);
		System.out.println();
		
		//simple guessing game
		String userGuess = "";
		do {
			System.out.println("What is my name?");
			userGuess = scan.nextLine();
		}while(!"Westin".equals(userGuess));
		System.out.println("Well done, you gussed my name correctly");
		
	}

}
