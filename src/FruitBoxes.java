/**
 * @author Albert Lionelle <br>
 *     lionelle@colostate.edu <br>
 *     Computer Science Department <br>
 *     Colorado State University
 * @version 1.0
 */
public class FruitBoxes {

    private FruitBox boxOne = new FruitBox("apples", "apples and oranges");
    private FruitBox boxTwo = new FruitBox("oranges", "apples");
    private FruitBox boxThree = new FruitBox("apples and oranges", "oranges");





    public void checkBoxes() {

        // do work to find out that box three labeled apples and oranges; simplified for example

        if(boxThree.label.equals("apples and oranges")) {
            if(boxThree.fruit.equals("oranges")) {
                boxThree.label = "oranges";
                if(boxOne.label.equals("apples")) {
                    boxOne.label = "apples and oranges";
                    boxTwo.label = "apples";
                } else {
                    boxOne.label = "apples";
                    boxTwo.label = "apples and oranges";
                }
            } else if(boxThree.fruit.equals("apples")) {
                /// do more work here, that inverts the answers.

            }

        }




    }



}
