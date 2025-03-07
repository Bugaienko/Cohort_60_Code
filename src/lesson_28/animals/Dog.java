package lesson_28.animals;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.03.2025
 */

public class Dog extends Animal {


    @Override
    public void voice() {
        // обращение к объекту родителя и вызов его реализации метода voice
        super.voice();
    }

    @Override
    public String toString() {
        return super.toString() + " | Dog. Дополнение реализации родительского метода";
    }

    public void bark() {
        System.out.println("Dog bark!");
    }
}
