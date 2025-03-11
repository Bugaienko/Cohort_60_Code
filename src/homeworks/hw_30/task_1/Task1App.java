package homeworks.hw_30.task_1;

import homeworks.hw_30.interfaces.Triathlete;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.03.2025
 */

/*
Task 1

Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.

Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.

Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */

public class Task1App {

    public static void main(String[] args) {

        Triathlete triathlete = new Triathlete("Sebastian");

        triathlete.run();
        triathlete.swim();

    }
}
