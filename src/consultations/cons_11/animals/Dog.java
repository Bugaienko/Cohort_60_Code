package consultations.cons_11.animals;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.03.2025
 */

public class Dog extends Animal {

    // Чтобы создать потомка, нужно СНАЧАЛА создать объект родителя

    public Dog(String name) {
        // Первой строкой вызывается конструктор родителя
        super(name);
    }

    void bark() {
        System.out.println(name + " barks");
    }

}
