public abstract class AnimalFactory {
    /**
     * we choose to implement Factory design pattern, because
     * we want to create a class that will be responsible of
     * creating objects from different classes
     */
    public abstract Animal createAnimal();
}
