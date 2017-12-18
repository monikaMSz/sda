package sda.code.intermediate.part1.exercises.patterns;

import sda.code.intermediate.part1.exercises.data.Person;

public class PersonBuilder {
    private String firstName;
    private String lastName;

    public PersonBuilder withFirstName(String firstName) {
        this.firstName=firstName;
        return this;


    }

    public PersonBuilder withLastName(String lastName) {
      this.lastName=lastName;
      return this;
    }

    private void validate() {
        if(firstName==null){
            throw new InvalidBuilderState("First name must be set");

        }if(lastName==null){
            throw new InvalidBuilderState("Last name must be set");

        }
    }

    public Person build() {
        validate();
        return new Person(firstName,lastName);
    }
}