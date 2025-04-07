package homeworks.hw_49.validator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.04.2025
 */

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("john@gmail.com", "qwerty");

        System.out.println(person);

        System.out.println("=============\n");

        Person person1 = new Person("john.gmail.com", "qwertyQ1111");
        System.out.println(person1);

        System.out.println("=============\n");
        // TODO -> Если пароль не проходит по нескольким параметрам - выдать сообщение об ошибке
        // с указанием ВСЕХ пунктов
        Person person2 = new Person("john@gmail.com", "qwerty222222Q%");
        System.out.println(person2);
    }
}
