import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class AdvancedTopics {





    public static String reverseString(String arr) {
        return reverseString(arr, arr.length());
    }

    public static String reverseString(String arr, int location) {
        if(location < 1) return "";
        return arr.charAt(location-1) + reverseString(arr, location-1);
    }


    public static void fileReading(String name) {
        try {
            Scanner scanner = new Scanner(new File(name));
            System.out.println(scanner.nextDouble());

        }catch(IOException ex) {
            System.err.print("Error finding file " + ex.getMessage());
        }
    }


    public static long fib(int n) {
        if(n < 1) return 0;
        if(n == 1) return 1;
        return fib(n-2) + fib(n-1);
    }

    public static long fibIterative(int n) {
        long n1 = 0, n2 = 1, n3;
        if (n == 0) return 0;
        for (int i = 2; i <= n; i++)  {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);

        for(int i = 1; i <= 5; i++) {
            System.out.printf("%d ", fib(i));
        }
        System.out.println("END");

        for(int i = 1; i <= 47; i++) {
            System.out.printf("%d ", fibIterative(i));
        }
        System.out.println("END");
    }



}
