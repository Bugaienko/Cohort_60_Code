package lesson_29.abstracts;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.03.2025
 */

public class Cat extends Animal {

    @Override
    void move() {
        System.out.println("Кот передвигается");
    }

    @Override
    void eat() {
        System.out.println("Кот очень любит кушать!");
    }
}
