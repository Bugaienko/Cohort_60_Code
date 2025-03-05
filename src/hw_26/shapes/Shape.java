package hw_26.shapes;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.03.2025
 */

public class Shape {
    protected String name;
    private String color;

    public Shape(String name) {
        this.name = name;
        this.color = "black";
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Shape: " + name + ", color: " + color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
