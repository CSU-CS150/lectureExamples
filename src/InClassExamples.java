/**
 * @author Albert Lionelle <br>
 *     lionelle@colostate.edu <br>
 *     Computer Science Department <br>
 *     Colorado State University
 * @version 1.0
 */
public class InClassExamples {


    public static boolean rangeCheckWithAnd(int value) {
        return value > -100 && value < 100;
    }

    public static boolean rangeCheckWithOr(int value) {
       return !(value < -100 || value > 100);
    }

    public static String nameSplit(String line) {
        return line.substring(0, line.indexOf(','));
    }

    public static String latSplit(String line) {
        return line.substring( line.indexOf(',')+1  ,  line.lastIndexOf(',') );

    }

    public static String lonSplit(String line) {
        return line.substring( line.lastIndexOf(',') +1 );

    }


    public static void testRangeChecks() {
        System.out.println("TESTING rangeCheckWithAnd with 50. It returns: " + rangeCheckWithAnd(50) );
        System.out.println("TESTING rangeCheckWithAnd with 0. It returns: " + rangeCheckWithAnd(0) );

        System.out.println("TESTING rangeCheckWithOr with 50. It returns: " + rangeCheckWithOr(50) );
        System.out.println("TESTING rangeCheckWithOr with 0. It returns: " + rangeCheckWithOr(0) );

        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 1000);

            int randomSign = (int) (Math.random() * 10);
            if (randomSign % 2 == 0) randomNumber *= -1;

            System.out.println("TESTING rangeCheckWithAnd with " + randomNumber + " It returns: " + rangeCheckWithAnd(randomNumber) );
            System.out.println("TESTING rangeCheckWithOr with " + randomNumber + " It returns: " + rangeCheckWithOr(randomNumber) );


        }


    }

    public static void testStringSplit() {
        System.out.println("TESTING hawaii,100,102  and grabbing name. Returned: " + nameSplit("hawaii,100,102"));
        System.out.println("TESTING hawaii,100,102  and grabbing lat. Returned: " + latSplit("hawaii,100,102"));
        System.out.println("TESTING hawaii,100,102  and grabbing lon. Returned: " + lonSplit("hawaii,100,102"));
    }

    public static void main(String args[]) {
    //    testRangeChecks();
      //  testStringSplit();


    }

}
