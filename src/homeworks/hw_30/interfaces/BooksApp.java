package homeworks.hw_30.interfaces;

import lesson_30.interfaces.Book;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.03.2025
 */

public class BooksApp {

    public static void main(String[] args) {

        Book book = new Book("Title", "Author");

        book.defaultMethod();
    }
}
