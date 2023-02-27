import java.util.ArrayList;

public class ZooUpdateAllObservers implements UpdateAll{
    public ArrayList<ZooObserver> observers;
    private String message;

    /**
     * a constructor for the class ZooUpdateAllObservers
     * that initiate new list of the zoo observers
     */
    ZooUpdateAllObservers(){
        this.observers = new ArrayList<>();
    }

    /**
     * this function sets the message we
     * want to sent to all the zoo observers
     * and notify all af the observers
     * @param message
     */
    @Override
    public void setMessage(String message) {
        this.message = message;
        notifyObserver();
    }

    /**
     * this function is responsible for notifying
     * all the zoo observers, with the message
     * that was set
     */
    public void notifyObserver() {
        for(ZooObserver zooObserver : this.observers){
            zooObserver.display(this.message);
        }
    }
}
