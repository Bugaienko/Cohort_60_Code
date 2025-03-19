package lesson_37.enums;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.03.2025
 */

public class AppTraffic {
    public static void main(String[] args) {

        Colors color = Colors.RED;
        System.out.println("color = " + color);

        Colors[] colors =  Colors.values(); // получаю массив всех значения enum

        for (Colors current : Colors.values()) {
            System.out.println(current);
        }

        // Возвращает константу Enum по указанному имени (строке)
        Colors red = Colors.valueOf("RED");

        // Enum безопасно сравнивать оператором == (не обязательно использовать equals()"
        System.out.println("color == Colors.RED: " + (color == Colors.RED));

        // У каждой константы есть порядковый номер (начиная с 0)
        System.out.println("color.ordinal(): " + color.ordinal());

        TrafficLight trafficLight =
                new TrafficLight("SN-001", "Berlin",
                        Colors.YELLOW);

        System.out.println(trafficLight);
    }
}
