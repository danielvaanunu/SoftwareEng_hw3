public class Unicorn implements Animal{
    /**
     * implements the function from Animal interface,
     * that prints a string representation of what
     * the unicorn eats
     */
    @Override
    public void eat() {
        System.out.println("The unicorn is eating rainbow cakes...");
    }

    /**
     * implements the function from Animal interface,
     * that prints a string representation of the action
     * the unicorn do in the zoo 'performance'
     */
    @Override
    public void performance() {
        System.out.println("The unicorn is flying...");
    }
}
