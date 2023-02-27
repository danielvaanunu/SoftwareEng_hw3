public class ZooObserver {
    private String name;

    /**
     * a constructor for the ZooObserver class
     * @param name - sets the name of
     * the observer
     */
    ZooObserver(String name){
        this.name = name;
    }

    /**
     * this function prints the description
     * of an update sent to specific observer
     * @param message - we want to sent
     */
    public void display(String message){
        System.out.println("[" + this.name + "] " + message);
    }
}
