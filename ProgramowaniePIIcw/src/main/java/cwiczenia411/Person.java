package cwiczenia411;

public class Person {
    private String name;
    private int age;
    private double salary;
    private Sex sex;

    public Person(String name, int age, double salary, Sex sex) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
