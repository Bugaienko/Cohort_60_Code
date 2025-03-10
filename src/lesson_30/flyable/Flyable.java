package lesson_30.flyable;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.03.2025
 */

public interface Flyable {
    void fly();
    default void methodA() {
        System.out.println("methodA");
    }

}
