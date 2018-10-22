import java.util.Scanner;

/**
 * Methods used in methods lecture 5
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 1.0
 */
public class MethodLecture {

    public static String getName() {
        return "Melody Pond";
    }


    public static void main(String args[]) {
        System.out.println(overloaded(42));
    }

    // more methods lecture

    public String myDoctor = "The 10th Doctor";
    public static String getDoctor() {
        String myDoctor = "The 9th Doctor";
        return myDoctor;
    }



    public static String overloaded(int x) {
        return overloaded(x, "Answer");
    }

    public static String overloaded(int x, String str) {
        return "The " + str + " is " + x;
    }



}
