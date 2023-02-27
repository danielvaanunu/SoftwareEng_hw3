public class Zebra implements Animal{
    /**
     * implements the function from Animal interface,
     * that prints a string representation of what
     * the zebra eats
     */
    @Override
    public void eat() {
        System.out.println("The zebra is eating grass...");
    }

    /**
     * implements the function from Animal interface,
     * that prints a string representation of the action
     * the zebra do in the zoo 'performance'
     */
    @Override
    public void performance() {
        System.out.println("The zebra is running...");
    }
}
