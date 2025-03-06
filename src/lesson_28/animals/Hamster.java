package lesson_28.animals;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.03.2025
 */

public class Hamster extends Animal {

    // Ничего не переопределяем - получаем реализацию всех родительских методов по наследству


    // Переопределение метода родителя (Animal)
    @Override
    public String toString() {
        return "Hamster!";
    }
}
