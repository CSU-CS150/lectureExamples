import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class FinalReview {



    public static void stringFormat() {
        double db = 3.14159265359;
        String val = "PI";
        System.out.printf("Value of %5s is: %.2f", val, db);
    }



    public static void dowhile() {
        int n = 1;
        do {
            System.out.println(n++);
        }while(++n < 1);

    }


    public static void multiarrays() {
        double[] weight = {110.2, 250.5, 90, 50.5};
        String[] names = {"Jane", "Bob", "Elli"};
        for(int i = 0; i < weight.length; i++) {
            if(weight[i] < 60) {
                System.out.println(names[i]);
            }
        }
    }


    public static void writeFile() {

        try {
            PrintWriter writer = new PrintWriter(new File("input.txt"));

            writer.println("42 is the answer 1.0");
            writer.println("to the question");

            writer.close();

        }catch(FileNotFoundException ex) {
            System.err.println("Ok, this is odd, it won't let me write... ");

        }


    }

    public static void scannerTest()  throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("input.txt")); //

        try {
            //System.out.print("This is my line to read: ");


            double dbl = scanner.nextDouble();
            System.out.println(scanner.next());
            System.out.println(scanner.next());
            System.out.println(scanner.next());
            scanner.nextDouble();
            System.out.printf("The variable I printed is %.2f\n", dbl);
            scanner.next(); //TO
            String str = scanner.nextLine();

            System.out.printf("%10s's length is: %d", str, str.length());
        }catch(Exception ex) {
            ex.printStackTrace();
            //System.err.print("This is not a double, silly");
            //System.exit(1);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        writeFile();
        scannerTest();
        // go over files

        // go try / catch

        // scanner  -



    }




}
