import java.util.ArrayList;
import java.util.List;

// Component class (Employee)
class Employee {
    private String name;
    private String position;
    private List<Employee> subordinates;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee: [Name=" + name + ", Position=" + position + "]";
    }
}

// Main class to demonstrate Composite Pattern
public class Composite{
    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO");

        Employee headSales = new Employee("Robert", "Head of Sales");
        Employee headMarketing = new Employee("Michael", "Head of Marketing");

        Employee clerk1 = new Employee("Laura", "Marketing Clerk");
        Employee clerk2 = new Employee("Bob", "Marketing Clerk");

        Employee salesExecutive1 = new Employee("Richard", "Sales Executive");
        Employee salesExecutive2 = new Employee("Rob", "Sales Executive");

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        // Print all employees of the organization
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
