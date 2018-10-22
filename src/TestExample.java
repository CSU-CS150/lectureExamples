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


    public static void indexOftest() {
        String curse = "Avada Kedavra";
        int index = curse.indexOf('a', curse.indexOf('a')+1);
        System.out.println("index of a is " +index);

        String spell = "Redikulus";

        System.out.println(spell.indexOf('u', spell.length()-2));
        System.out.println(spell.lastIndexOf('u'));
        System.out.println(spell.indexOf('u', spell.indexOf('l')));

    }

    public static void debugMe(String csv) {
        char deliminator = ',';
        String numbers = "";
        String word = "";
        for(int i=0; i < csv.length(); i++) {
           char tmp = csv.charAt(i);
           if(tmp == deliminator) {
               if (! numbers.isEmpty()) {
                   int number = Integer.parseInt(numbers);
                   System.out.println(number + " divided by 2 is " + number / 2);
               }
               if( ! word.isEmpty()) System.out.println("The word is: " + word);
               numbers = "";
               word = "";

           }else
           if(Character.isDigit(tmp)) {
               numbers += tmp;
           } else {
               word += tmp;
           }
        }

        if (! numbers.isEmpty()) {
            int number = Integer.parseInt(numbers);
            System.out.println(number + " divided by 2 is " + number / 2);
        }
        if( ! word.isEmpty()) System.out.println("The word is: " + word);

    }

    public static String complexBranching(int val1, int val2, int val3) {
        String patrolum = "Expecto Patronum";
        String noItIs = "It is Leviosa";
        String light = "Lumos";
        String giveMe = "accio";



        if(val1 > val2 || val2 >= val3) {
            if(val1 < val2) {
                return patrolum;
            } else if (val3 > val1) return reverseToLower(light);
            if(val2 == val3) {
                return noItIs.substring(noItIs.lastIndexOf(" ")+1);
            }
            if(val1 > val3 && val2 > val3) {
                if (val3 < 0) {
                    return reverseToLower(giveMe);
                }
                return giveMe;
            }
            return giveMe.toUpperCase();
        }

        return light;
    }

    public static String reverseToLower(String str) {
        String rtn = "";
        for(int i = str.length()-1; i >= 0; --i) rtn += str.charAt(i);
        return rtn.toLowerCase();
    }


    public static void main(String args[]) {
       /*
       exam one
        System.out.println(branchingCheck(10, 9, 8));
        System.out.println(branchingCheck(8, 10, 20));
        System.out.println(branchingCheck(0, 0, 0));
        System.out.println(branchingCheck(3, 0, 1));
        */
        indexOftest();
        debugMe("84,hello,hitchhiker,42");

        System.out.println(complexBranching(10, 9, 8));
        System.out.println(complexBranching(0, 0, 0));
        System.out.println(complexBranching(-10, 9, 9));
        System.out.println(complexBranching(20, 20, 21));


        String spell = "Redikulus";
        System.out.println(spell.indexOf('u', spell.length()-2));
    }



}
