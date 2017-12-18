package cwiczenia1811wzorce_projektowe.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weather {
    private int currentTemperature;
    private List<Person> observers;

    public Weather() {
        observers = new ArrayList<>();
        currentTemperature=0;
    }
    public void addObservers(Person...people){
        observers.addAll(Arrays.asList(people));
    }
    public void update(int newTemperature){
        currentTemperature=newTemperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Person person:observers
             ) {
            if(currentTemperature>person.getMaxTemperature()){
                person.update(currentTemperature);
            }

        }
    }
}
