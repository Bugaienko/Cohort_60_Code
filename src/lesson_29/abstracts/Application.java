package lesson_29.abstracts;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.03.2025
 */

public class Application {

    public static void main(String[] args) {

        // Нельзя создать объект абстрактного класса
        // Animal animal = new Animal();

        Cat cat = new Cat();

        cat.eat();
        cat.sayHello();


    }
}
