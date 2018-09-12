/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 1.0
 */
public class Exam1inClass {

    public static boolean myMethod(int x) {
        if(x < 100) {
            if (x > 10) {
                System.out.println("In true");
                return true;
            }
        }
        System.out.println("in false");
        return false;
    }

    public static void main(String args[]) {
        System.out.println(Exam1inClass.myMethod(10));
        System.out.println(Exam1inClass.myMethod(42));
    }

}
