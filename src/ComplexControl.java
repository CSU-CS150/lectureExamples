/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class ComplexControl {

    public static void doWhileTest(int iterations) {

        int x = 0;

        do {
            x += 2;
            if (x % 2 == 0) x = 10;
            else x -= 3;

        }while(x < iterations);

        System.out.println(x);
    }


    public static void switchTest(char character) {
        switch(character) {
            case 'a':
                System.out.print("James T. Kirk");
                break;
            case 'b':
                System.out.print("John Harriman");
                break;
            case 'c':
                System.out.print("Rachel Garrett");
                break;
            case 'd':
            case 'e':
                System.out.print("Jean-Luc Picard");
                break;
            default:
                System.out.println();
                return;
        }
        System.out.printf(" - Enterprise %C\n", character);
    }

    public static void main(String[] args) {
        doWhileTest(10);


    }


}