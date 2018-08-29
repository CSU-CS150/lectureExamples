/**
 * Contains examples used in lecture 3
 * https://docs.google.com/presentation/d/1D7IqKrLH9Qoru7_5WT4s052wV8fdn5qgiygOb1d2ZjA/e
 *
 * @author Albert Lionelle <br>
 *     lionelle@colostate.edu <br>
 *     Colorado State University <br>
 *     Computer Science Department
 * @version 1.0 Fall 18
 */
public class CStringExamples {

    /**
     * Adds a character and int together and returns the result. This is actually a bad idea, except for very specialized
     * cases. I have this example, so there can be a discussion on the relationship between ints and characters.
     * @param a  - a character primitive
     * @param b - a value to shift
     * @return  the primitive character that would be the shifted down the ASCII chart
     */
    public char characterAddition(char a, int b) {
        return (char)(a + b);
    }

    /**
     * Contenates a String with an int - as a comparing example to the character one above.
     * @param x String object
     * @param y int value
     * @return returns the string with the int value tacked on
     */
    public String stringAddition(String x, int y) {
        return x+y;
    }



    public static void main(String args[]) {
        CStringExamples ex = new CStringExamples();
        System.out.println(ex.characterAddition('A', 2));

        char bob = 57;
        System.out.println(bob);

        System.out.println(ex.stringAddition("A", 2));

    }


}
