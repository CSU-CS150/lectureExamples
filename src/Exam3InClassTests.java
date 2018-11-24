/**
 * @author Albert Lionelle <br>
 *     lionelle@colostate.edu <br>
 *     Computer Science Department <br>
 *     Colorado State University
 * @version 1.0
 */
public class Exam3InClassTests {




    public static void main(String[] args) {
       // continueAndBreakTest();
        formatTest();

    }

    private static void formatTest() {

        System.out.printf("%4.40f", 10.3939390);

    }

    public static void continueAndBreakTest() {

        int num = 11;

        while(num < 20) {

            for(int i = 0 ; i < num; i++) {
                if (num % 3 == 0) break;
                System.out.println("Executed");
                //num++;
            }
            num++;
            System.out.printf("%d : In while%n", num);

        }


    }

}
