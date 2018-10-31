import java.util.Arrays;
import java.util.Random;

/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 1.0
 */
public class ArrayTest {




    static final String CITY_INFO_DELIMINATOR = ",";
    private String[] parseCityInfo(String cityInfo) {
        String[] parts = new String[3];
        parts[0] = cityInfo.substring(0, cityInfo.indexOf(CITY_INFO_DELIMINATOR)); // name
        parts[1] = cityInfo.substring(cityInfo.indexOf(CITY_INFO_DELIMINATOR) + 1,
                                      cityInfo.lastIndexOf(CITY_INFO_DELIMINATOR)); // lat
        parts[2] = cityInfo.substring(cityInfo.lastIndexOf(CITY_INFO_DELIMINATOR) +1); //lon
        return parts;
    }



    static final String DRACULA_REAL = "Vlad Țepeș";
    static final String DRAC = "Dracula";
    private static void findDracula(String[] vampires) {
        for(int i = 0; i < vampires.length; i++) {
            if(vampires[i] == null) continue;
            if(vampires[i].equalsIgnoreCase(DRACULA_REAL)) {
                vampires[i] = DRAC;
            }
        }
    }

    private static void vampireTest() {
        String[] vamps = {"Alucard", "Barnabas Collins",
                          null,
                          "Strahd von Zarovich", "Vlad Țepeș"};
        findDracula(vamps);
        System.out.println(vamps[4]);
    }

    static final String FULLMOON = "wolf";

    private static boolean[] transformation(String[] werecreatures) {
        boolean[] moons = new boolean[werecreatures.length];
        for(int i = 0; i < werecreatures.length; i++) {
            if(werecreatures[i] == null) moons[i] = false;
            else if(werecreatures[i].equalsIgnoreCase(FULLMOON)) moons[i] = true;
            else moons[i] = false;
        }
        return moons;
    }

    private static void wereTest() {
        String[] creatures = new String[10];
        for(int i = 0; i < creatures.length; i++) {
            if(i %2 == 0) creatures[i] = "wolf";
            else creatures[i] = "raven";
        }
        boolean[] full_moon = transformation(creatures);
        System.out.printf("%s%n", Arrays.toString(full_moon));
    }

    static final String CASPER = "casper";
    private static int findCasper(String[] spirits) {
        for (int i = 0; i < spirits.length; i++) {
            if (spirits[i] != null && spirits[i].equalsIgnoreCase(CASPER)) return i;
        }
        return -1;
    }

    private static void testGhosts() {
        String[] spirits = new String[100];
        for(int i = 0; i < spirits.length; i++) {
            if (i%3 == 0) spirits[i] = "casper";
            if (i%10 == 0) spirits[i] = "little nel";
        }

        System.out.println(findCasper(spirits));

    }

    private static void randomDice(int sides, int howMany) {
        Random rnd = new Random();

        int[] numbers = new int[howMany];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(sides) + 1;
        }

        System.out.println();
        for(int number : numbers) {
            System.out.printf("Rolled %d %n", number);
        }

        for(int i = 0 ; i < numbers.length; i++) {
            System.out.printf("Rolled %d %n", numbers[i]);
        }

    }


    private static void RHPSExampleShortHand() {
        String[] RHPS = {"Brad", "Janet", "Columbia", "Eddy", "Magenta", "Riff Raff"};
        System.out.println(RHPS[9]);

    }

    private static void RHPSExample() {

        String[] RHPS = new String[10];
        RHPS[0] = "Brad";
        RHPS[1] = "Janet";
        RHPS[2] = "Columbia";
        RHPS[3] = "Eddy";
        RHPS[4] = "Magenta";
        RHPS[5] = "Riff Raff";

        System.out.println();
        System.out.println(Arrays.toString(RHPS));



    }

    private static void sizeTest() {

        char[] barbarian = new char[5];
        barbarian[0] = 'c';
        barbarian[1] = 'o';
        barbarian[2] = 'n';
        barbarian[3] = 'a';
        barbarian[4] = 'n';

        System.out.println(Arrays.toString(barbarian));



        System.out.println(barbarian.length);
    }



    public static void main(String[] args) {
        testGhosts();
    }
}
