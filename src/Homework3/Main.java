package Homework3;

public class Main {
    public static void main(String[] args) {
        final Employee employee = new Employee("Mark Kaminskyi",4, "kaminskyimark97@gmail.com", "0978109841", 26);
        System.out.println("Employer data.");
        System.out.println("Name:" + employee.getName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone:" + employee.getPhone());
        System.out.println("Age: " + employee.getAge());
        System.out.println(System.lineSeparator());
        Car.start();
    }
}
