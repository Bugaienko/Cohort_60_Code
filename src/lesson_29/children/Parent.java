package lesson_29.children;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.03.2025
 */

public class Parent {

    String name;

    // Автоматически добавляется при компиляции (т.к. нет ни одного)
//    public Parent() {
//        // Все поля инициализируются значениями по умолчанию для типа данных
//    }

    public Parent(String name) {
        this.name = name;
    }

    // Невозможно изменить реализацию (переопределить) в наследниках
    final void show() {
        System.out.println("Show must go on");
    }
}
