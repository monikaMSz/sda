package cwiczenia2511.anonymous;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    String introduce() {
        return String.format("Hello!, I'm %s,%s ",name,age);
    }
}
