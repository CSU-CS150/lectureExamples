/**
 * Contains examples used in lecture 3
 * https://docs.google.com/presentation/d/1pKVKTT7icfbJkPgnsE8XWmEX-Mv7t_FvL653w39BtiY/edit#slide=id.g40605ba44f_0_6
 */
public class BranchingSlideExamples {

    /**
     * Part of iClicker quiz for branching
     * @param y - value to check against x (0)
     * @return x < y
     */
    public boolean isPositive(int y) {

        int x = 0;
        if (x < y) {
            return true;
        }
        return false;
    }

    /**
     * complicated way to check for signs
     * @param y - value to check
     * @return either -1 for negative values, 0 for 0, or 1 for positive values of y
     */

    public int signCheck(int y) {
        int x = 0;
        if(y > x) {
            x = -y;
        }
        if(y < x) {
            x = y;
        }
        if (y+x < x) {
            return -1;
        }
        if (x-y < x ) {
            return 1;
        }
        return 0;
    }


    public static void main(String args[]) {
        BranchingSlideExamples br = new BranchingSlideExamples();
        System.out.println(br.isPositive(10));

        System.out.println(br.signCheck(0));
        System.out.println(br.signCheck(-100));
        System.out.println(br.signCheck(100));
    }
}

