public final class Truck
        extends Transport
        implements UpdateTyreInterface, CheckEngineInterface, CheckTrailerInterface{
    // Constructor
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
