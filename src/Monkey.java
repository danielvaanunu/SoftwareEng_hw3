public class Monkey implements Animal{
    /**
     * implements the function from Animal interface,
     * that prints a string representation of what
     * the monkey eats
     */
    @Override
    public void eat() {
        System.out.println("The monkey is eating a banana...");
    }

    /**
     * implements the function from Animal interface,
     * that prints a string representation of the action
     * the monkey do in the zoo 'performance'
     */
    @Override
    public void performance() {
        System.out.println("The monkey is hanging on trees...");
    }
}
