public class MonkeyFactory extends AnimalFactory{
    /**
     * implements the function from AnimalFactory superclass
     * @return new monkey object
     */
    @Override
    public Animal createAnimal() {
        return new Monkey();
    }
}
