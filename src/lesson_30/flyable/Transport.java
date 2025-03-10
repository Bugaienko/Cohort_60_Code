package lesson_30.flyable;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.03.2025
 */

public abstract class Transport {
    int capacity;
    int amountPassengers;

    public Transport(int capacity) {
        this.capacity = capacity;
    }
    abstract boolean takePassenger();

    public int getCapacity() {
        return capacity;
    }
}
