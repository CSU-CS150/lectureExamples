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
///more loops

    public static String whatsThatWord(String word) {
        String rtn = "";
        for(int i = word.length()-1; i >= 0 ; --i) {
            rtn += word.charAt(i);

        }
        return rtn;
    }

    public static String modLoop(int count) {
        String rtn = "LOOP: ";
        for(int i = 0; i < count; i +=2) {
            if(i % 2 == 0) {
                rtn += i;
            } else {
                System.out.println("is odd");
            }
        }

        return rtn;
    }

    public static String cleanSentence(String str) {
        while (str.contains("  "))
            str = str.replace("  ", " ");
        return str;
    }

    public static String compress(String str) {
        String rtn = "";
        int counter = 0;
        for(int i = 1; i < str.length(); i++) {
             if(str.charAt(i-1) == str.charAt(i)) {
                 counter++;
             }else {
                 rtn += str.charAt(i-1) + String.valueOf(counter+1) + " ";
                 counter = 0;
             }
        }
        rtn +=  str.charAt(str.length()-1) + String.valueOf(counter+1);
        return rtn;
    }


    public static void compileExample() {

        int depth = 0;
        for (int i = 0; i < 10; i++) {
;
            for (int y = 10; y > 0; y-- ) depth += i - y;
        }
        System.out.println(depth);

    }

    public static boolean stringSearch(String strValue, char x) {
        for(int i = strValue.length() -1; i >= 0; i -= 2) {
            if(strValue.charAt(i) == x) {
                return true;
            }
        }
        return false;
    }

    public static int digitCounter(String word) {
        int index = 0;
        int rtn = 0;
        while(index < word.length()) {
            if(Character.isDigit(word.charAt(index))) {
                int value = Integer.parseInt(String.valueOf(word.charAt(index)));
                rtn += value;
            }
            index++;
        }
        return rtn;
    }

    public static String subJump(String longword, String x, String y) {
        int index = longword.indexOf(x);
        int index2 = longword.indexOf(y);
        String rtn = "";
        while(index2 >= 0) {
            rtn += longword.substring(index+1, index2) + " and ";
            index = longword.indexOf(x, index2);
            index2 = longword.indexOf(y, index);
        }
        rtn += longword.substring(index+1);
        return rtn;
    }

    public static void main(String args[]) {
        System.out.println(subJump("magenta-brad:columbia-janet",
                                         "-", ":"));
    }


}
