package Homework3;

public class Employee {
    private final String Name;
    private final int position;
    private final String email;
    private final String phone;
    private final int age;

    public Employee(String name, int position, String email, String phone, int age) {
        Name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public int getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}
