/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class InheritenceDemo {

    public static void main(String[] args) {
        InheritenceDemo demo = new InheritenceDemo();
        System.out.println();
        demo.runTest();
    }

    public void runTest() {
        Animal[] animals = new Animal[4];

        animals[0] = new Dog().setName("nita");
        animals[1] = new Cat().setName("cattivo");
        animals[2] = new Cat().setName("simon");
        animals[3] = new Fox();

        int puppyCounter = 0;

        for(Animal animal : animals) {
            String says = animal.says();
            if(says == null) {
                System.out.printf("No one knows what the %s says!%n", animal.getType());
            }else {
                System.out.printf("The %s says %s%n", animal.getType(), says);
            }
            if(animal instanceof Dog) puppyCounter++;
        }
        System.out.printf("%nThe number of puppies are: %d%n", puppyCounter);
    }




    public class Animal {
        String name = null;

        public Animal() {}
        public Animal setName(String pet) {
            name = pet;
            return this;
        }

        public String getType() {
            return this.getClass().getSimpleName();
        }

        public String says() {
            return null;
        }
    }

    public class Cat extends Animal {
        public String says() { return "meow";}

    }

    public class Dog extends Animal {
        public String says() { return "wolf";}
    }


    public class Fox extends Animal { }


}
