package testProtected;

import lesson_23.Cat;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.02.2025
 */

public class Lesson23Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Test", 10, 4);

        System.out.println(cat.toString());
        cat.setAge(15);
        System.out.println(cat.getAge());

        cat.sayMeow();
        // protected и модификатор по умолчанию - в другом пакете доступа нет
        // cat.isDefault = true;

    }
}
