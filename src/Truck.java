public final class Truck
        extends Transport
        implements EngineTransportsMethods{
    // Constructor
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    // Check method
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
