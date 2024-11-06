public abstract sealed class Transport
        permits Car, Bicycle, Truck {
    // Init
    private final String modelName;
    private final int wheelsCount;

    // Constructor
    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    // Get
    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    // Update method
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
