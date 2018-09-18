/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class TestExample {

    public static String branchingCheck(int valOne, int valTwo, int valThree) {

        double pi = 3.14;
        String hasPie = "I like pie";
        String morePie = "I need more pie";
        String actualPie = "π";

        if (valOne > valTwo) {
            if (valOne > pi) {
                return hasPie;
            }
        } else if (valTwo >= valThree) {
            return morePie;
        } else {
            if (valThree < 3.14) {
                return actualPie;
            }
            return "The value of pi is: " + pi;
        }
        return "no pie";
    }

    public static void main(String args[]) {
        System.out.println(branchingCheck(10, 9, 8));
        System.out.println(branchingCheck(8, 10, 20));
        System.out.println(branchingCheck(0, 0, 0));
        System.out.println(branchingCheck(3, 0, 1));






    }



}
