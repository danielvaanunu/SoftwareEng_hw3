import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class Zoo {
    private static Zoo instance = null;
    private int happinessLevel = 2;
    private int hungerLevel = 3;
    private ArrayList<Animal> animals;
    private static int unicornCount = 0; // the total amount of unicorns in the zoo
    private static int zebraCount = 0; // the total amount of zebras in the zoo
    private static int monkeyCount = 0; // the total amount of monkeys in the zoo
    private ZooUpdateAllObservers zooUpdateAllObservers;

    /**
     * constructor of the zoo class,
     * creates new list of the animals that are in the zoo,
     * and creates new list that will help us to notify changes
     * to the zoo observers
     */
    private Zoo() {
        this.animals = new ArrayList<>();
        this.zooUpdateAllObservers = new ZooUpdateAllObservers();
    }

    /**
     * we choose to implement Singleton design pattern, because
     * we want to create only one instance of zoo object
     * @return the single instance of zoo object
     */
    public static Zoo getInstance() {
        if (instance == null) {
            System.out.println("Creating zoo...");
            instance = new Zoo();
        } else {
            System.out.println("The zoo already exists...");
        }
        return instance;
    }

    /**
     * 1- this function prints the string representation of
     *    what every animal in our zoo eats
     * 2- notifying to all observers that the animals are being fed
     * 3- reducing the animals hunger level by 1
     */
    public void feedAnimals() {
        for (Animal animal : this.animals) {
            if (animal instanceof Unicorn) {
                ((Unicorn) animal).eat();
            }
            if (animal instanceof Zebra) {
                ((Zebra) animal).eat();
            }
            if (animal instanceof Monkey) {
                ((Monkey) animal).eat();
            }
        }

        System.out.println("Notifying observers:");
        this.zooUpdateAllObservers.setMessage("The animals are being fed");

        if (this.hungerLevel > 1) {
            this.hungerLevel--;
        }
    }

    /**
     * 1- this function prints the string representation of
     *    the 'performance' every animal in our zoo does
     * 2- notifying to all observers that the animals are being watched
     * 3- increasing the animals happiness level by 1
     * 4- increasing the animals hunger level by 1
     */
    public void watchAnimals(){

        for (Animal animal : this.animals) {
            if (animal instanceof Unicorn) {
                ((Unicorn) animal).performance();
            }
            if (animal instanceof Zebra) {
                ((Zebra) animal).performance();
            }
            if (animal instanceof Monkey) {
                ((Monkey) animal).performance();
            }
        }
        System.out.println("Notifying observers:");
        this.zooUpdateAllObservers.setMessage("The animals are being watched");

        if(this.happinessLevel < 5){
            this.happinessLevel++;
        }if(this.hungerLevel < 5){
            this.hungerLevel++;
        }
    }

    /**
     * 1- this function adds to the zoo animals list
     *    @param animal
     * 2- checks the type of the animal added,
     *    updates all the zoo observers and
     *    increasing the static counter of
     *    the animal type
     */
    public void addAnimal(Animal animal) {
        System.out.println("Notifying observers:");

        this.animals.add(animal);
        if (animal instanceof Unicorn){
            this.zooUpdateAllObservers.setMessage("Unicorn has been added to the zoo!");
            unicornCount++;
        } if (animal instanceof Zebra){
            this.zooUpdateAllObservers.setMessage("Zebra has been added to the zoo!");
            zebraCount++;
        } if (animal instanceof Monkey){
            this.zooUpdateAllObservers.setMessage("Monkey has been added to the zoo!");
            monkeyCount++;
        }
    }

    /**
     * this function prints the zoo's animals information
     * according to the task
     */
    public void showAnimalsInfo() {
        int total = unicornCount + monkeyCount + zebraCount;
        System.out.println("The zoo contains total of " + total + " animals:");
        System.out.println("- Zebra: " + zebraCount);
        System.out.println("- Unicorn: " + unicornCount);
        System.out.println("- Monkey: " + monkeyCount);
        System.out.println("Happiness level: " + this.happinessLevel);

        if (this.happinessLevel < 3) {
            System.out.println("The animals are not happy, you should watch them...");
        } else {
            System.out.println("The animals are very happy, keep working hard...");
        }

        System.out.println("Hunger level: " + this.hungerLevel);

        if (this.hungerLevel > 3) {
            System.out.println("The animals are hungry, you should feed them...");
        }
    }

    /**
     * this function adds new
     * @param zooObserver
     * to the zoo observers list
     * that is in zooUpdateAllObservers list
     */
    public void addObserver(ZooObserver zooObserver){
        this.zooUpdateAllObservers.observers.add(zooObserver);
    }

    /**
     * this function removes existing
     * @param zooObserver
     * from the zoo observers list
     * that is in zooUpdateAllObservers list
     */
    public void removeObserver(ZooObserver zooObserver){
        this.zooUpdateAllObservers.observers.remove(zooObserver);
    }

}
