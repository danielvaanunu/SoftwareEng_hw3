public class UnicornFactory extends AnimalFactory {
    /**
     * implements the function from AnimalFactory superclass
     * @return new unicorn object
     */
    @Override
    public Animal createAnimal() {
        return new Unicorn();
    }
}
