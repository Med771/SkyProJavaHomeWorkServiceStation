public final class Car
        extends Transport
        implements UpdateTyreInterface, CheckEngineInterface{
    // Constructor
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
