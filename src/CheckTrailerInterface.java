public sealed interface CheckTrailerInterface
        permits Truck{
    // Check method
    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
