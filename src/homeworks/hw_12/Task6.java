package homeworks.hw_12;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.02.2025
 */
/*
Task 6 * (Опционально)
Потеря данных при преобразовании.

Напишите программу, которая:

Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).

Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
Выводит значение smallNumber на экран.
Обратите внимание на полученный результат и подумайте, почему он отличается от ожидаемого.
 */

public class Task6 {
    public static void main(String[] args) {
        long bigNumber = 15_000_000_000L;
        int smallNumber = (int) bigNumber;

        System.out.println("smallNumber: " + smallNumber);
        System.out.println("long: " + Long.toBinaryString(bigNumber));
        System.out.println("int1   :0" + Integer.toBinaryString(smallNumber));

        System.out.println(Math.pow(2, 33) );
        System.out.println(Math.pow(2, 32));


    }
}
