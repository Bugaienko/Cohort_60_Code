package homeworks.hw_12;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.02.2025
 */

/*
Task 2
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).

Вычислите среднюю температуру за неделю и выведите ее на печать.

P.S. - правильно выберите типы данных
 */

public class Task2 {
    public static void main(String[] args) {

        int t1 = 18;
        int t2 = 22;
        int t3 = 17;
        int t4 = 23;
        int t5 = 21;
        int t6 = 20;
        int t7 = 20;

        int days = 7;

        // Сумма всех чисел, деленная на количество
        int sumTemp = t1 + t2 + t3 + t4 + t5 + t6 + t7;
        System.out.println("SumTemp: " + sumTemp);

//        double averageTemp = sumTemp / days; // 141 / 7 = 20 -> 20.0
        double averageTemp = (double) sumTemp / days; // 141.0 / 7 -> 141.0 / 7.0 = 20.142...

        System.out.println("Average Temp: " + averageTemp);


    }
}
