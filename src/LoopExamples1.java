import java.util.Scanner;

/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class LoopExamples1 {

    public static void simpleLoop(int total) {

        int i = 0;
        while(i < total+1) {
            System.out.print(i + ",");
            i = i + 1;
        }
        System.out.println();
        for(int x = 0; x < total; x++) {
            System.out.print(x + ",");
        }

    }

    public static void simpleLoopNoComma(int total) {

        int i = 0;
        int lastDigit = total - 1;
        while(i < lastDigit) {
            System.out.print(i + ",");
            i = i + 1;
        }
        System.out.println(lastDigit);
        for(int x = 0; x < lastDigit; x++) {
            System.out.print(x + ",");
        }
        System.out.println(lastDigit);

    }

    public static void charShift() {

        char crypto = 'A';
        for(; crypto < 'S'; crypto++); {
            System.out.print(crypto);
        }


        crypto = 'A';
        while(crypto < 'S') {
            crypto = (char) (crypto + 1);
        }
        System.out.println(crypto);

    }

    public static void complexFor(int lines) {

        String count_up = "";

        String count_down = "";
        for(int i=0,j = lines; i < lines; i++, j--) {
           count_up += i;
           count_down += j;
        }
        System.out.println(count_up);
        System.out.println(count_down);

    }

    public static void loopFormats() {

        Scanner scan = new Scanner(System.in);

        int end = scan.nextInt();
        int start = scan.nextInt();

        while(start < end) {
            start++;
        }
        System.out.println("My Start is now: " + start);



        for(int i = 0; i < 10; i++) {
            System.out.print(i);
        }


    }


    public static void main(String args[]) {
        complexFor(10);
    }

}
