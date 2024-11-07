public sealed interface UpdateTyreInterface
    permits Bicycle, Car, Truck{
    // Update method
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
