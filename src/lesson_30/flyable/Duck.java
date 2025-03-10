package lesson_30.flyable;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.03.2025
 */

// Множественная реализация интерфейсов
public class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }



}


// Class B extends A, A extends C; != class B extend A, C;