package consultations.cons_11.animals;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.03.2025
 */

public class Cat extends Animal {
    private int age;

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
