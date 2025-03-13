package lesson_33;

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.03.2025
 */

/*
Есть два интерфейса Iterable и Iterator

1. Iterable<T> - означает, что объекты этого класса можно последовательно перебирать (итерироваться по ним)
 Один абстрактный метод: Iterator<T> iterator() - возвращает итератор для этого набора элементов (коллекции)

2. Iterator<T> - собственно итератор, который позволяет обходить коллекцию.
    - boolean hasNext() - есть ли следующий элемент
    - T next() - возвращает следующий элемент
    - void remove() - удаляет последний возвращенный элемент (не обязателен для переопределения)

 */
public class IteratorExample {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();

        list.addAll("Hello", "World", "Java", "Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String strCurrent = iterator.next();
            System.out.println(strCurrent);
//            iterator.remove(); без переопределения метода выдает ошибку
        }

        // Цикл for-each

        // При переборе циклом for-each не рекомендуется изменять коллекцию (добавлять / удалять элементы)
        /*
        for (ТирПеременой  имяПеременной : коллекция) {
            // действие с переменной
        }
         */

        System.out.println("\n================");

        for (String strCurrent : list) {
            System.out.println(strCurrent);
        }

        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1, 2, 3, 4, 5, 6);

        // Вывести в консоль все числа, которые есть в списке умноженные на 2.

        for (Integer value : integers) {
            System.out.println(value * 2);
        }

        //
        for (int i = 0; i < integers.size(); i++) {
            Integer value = integers.get(i);
        }

        System.out.println(integers);

        System.out.println("\n===============");

        // Вывести все элементы массива циклом for-each
        int[] array = {10, 20, 30, 40, 50};


        for (int element : array) {
            System.out.println(element);
        }

    }
}




















