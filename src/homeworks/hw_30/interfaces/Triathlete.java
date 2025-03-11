package homeworks.hw_30.interfaces;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.03.2025
 */

public class Triathlete implements Swimmer, Runner {
    private String name;

    public Triathlete(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Triathlete{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println(name + " running.");
    }

    @Override
    public void swim() {
        System.out.println(name + " swimming.");
    }
}
