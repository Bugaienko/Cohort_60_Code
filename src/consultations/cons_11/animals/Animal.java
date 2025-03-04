package consultations.cons_11.animals;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.03.2025
 */

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }



    void eat() {
        System.out.println(name + " eats");
    }

    public String toString() {
        return "Animal " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
