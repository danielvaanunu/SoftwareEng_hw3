public class ZebraFactory extends AnimalFactory{
    /**
     * implements the function from AnimalFactory superclass
     * @return new zebra object
     */
    @Override
    public Animal createAnimal() {
        return new Zebra();
    }
}
