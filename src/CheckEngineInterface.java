public sealed interface CheckEngineInterface
        permits Car, Truck{
    // Check method
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
