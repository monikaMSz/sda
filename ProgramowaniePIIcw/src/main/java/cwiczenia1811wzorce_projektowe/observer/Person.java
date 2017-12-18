package cwiczenia1811wzorce_projektowe.observer;

public class Person {
    private String name;
    private int maxTemperature;

    public Person(String name, int maxTemperature) {
        this.name = name;
        this.maxTemperature = maxTemperature;

    }

    public String getName() {
        return name;
    }

    public int getMaxTemperature() {
        return maxTemperature;

    }

    void update(int currentTemperature) {
        System.out.printf("Poinformuj %s, kiedy temperatura wyniesie więcej niż %s.Temperatura teraz: %s\n"
                , name, maxTemperature, currentTemperature);
    }
}
