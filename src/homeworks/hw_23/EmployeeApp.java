package homeworks.hw_23;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.02.2025
 */

public class EmployeeApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Max", 25, 5000.00);

        employee.info();

        System.out.println(employee.getName());

        Employee peter = new Employee("Peter", 45, 1000.00);

        System.out.println(peter.getSalary());
        peter.setSalary(1050);

        peter.info();
    }
}
