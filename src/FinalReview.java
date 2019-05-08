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

            writer.println("1. 42 is the answer 1.0");
            writer.println("2. to the question");

            writer.close();

        }catch(FileNotFoundException ex) {
            System.err.println("Ok, this is odd, it won't let me write... ");

        }


    }

    public static void scannerTest()  {



        try {
            Scanner scanner = new Scanner(new File("input.txt")); //
            //System.out.print("This is my line to read: ");
//1. 42 is the answer 1.0
//2. to the question
            scanner.nextDouble();
            double dbl = scanner.nextDouble();
            System.out.println(scanner.next()); // line 1
            System.out.println(scanner.next()); // line 2
            System.out.println(scanner.next()); // line 3
            scanner.nextDouble();
            System.out.printf("The variable I printed is %.2f\n", dbl); // line 4

            System.out.println(scanner.nextInt());  // what is printed here?  - line 5
            String str = scanner.nextLine();

            System.out.printf("%10s's length is: %d", str, str.length());
        }catch(Exception ex) {
            //ex.printStackTrace();
            System.out.println("Exception!");
            //System.err.print("This is not a double, silly");
            //System.exit(1);
        }
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);

        /*for(int i = 0; i < arr.length; i++) {
            int smallestIndex = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[smallestIndex] > arr[j]) {
                    smallestIndex = j;
                }
            }
            int tmp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = tmp;
        }*/

    }

    public static void main(String[] args)  {
        int[] arr = {10,11,5, 4, 25, -100000};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));


        writeFile();
        scannerTest();




    }




}
