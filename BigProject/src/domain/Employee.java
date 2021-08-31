package domain;

/**
 * @author LiuJun
 * @create 2021-8-30-16:18
 */

public class Employee {
    private String name;
    private int age;
    private double salary;
    private int id;

    public Employee() {

    }

    public Employee(String name, int age, double salary, int id) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
