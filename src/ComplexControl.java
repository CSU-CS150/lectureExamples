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

    public static boolean continueAndBreak(String toSearch, String hidden) {
        String pattern = "";
        boolean found = false;
        int counter = 0;
        for(int i = 0; i < toSearch.length(); i++) {
            char tmp = toSearch.charAt(i);

            if(Character.isWhitespace(tmp)) {
                continue;
            }
            if(Character.isDigit(tmp)) {
                pattern += tmp;
                if(pattern.equalsIgnoreCase(hidden)) {
                    found = true;
                    break;
                }
            } else {
                counter++;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        continueAndBreak("1) Pixar is #1 & his 3rd company", "113");
    }


}