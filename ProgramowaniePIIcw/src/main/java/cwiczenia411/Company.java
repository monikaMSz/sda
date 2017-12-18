package cwiczenia411;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private List<Person> EmployeeList = new ArrayList<Person>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    void addEmpolyees(Person... people) {
        System.out.println("Lista osób do dodania: " + people.length);

        for (Person poeples : people
                ) {
            EmployeeList.add(poeples);

        }
    }

    void showAllEmplyees() {
        for (Person person : EmployeeList
                ) {
            showEmployeesData(person);

        }

    }

    void showEmplyeesBySex(Sex sex) {
        for (Person person : EmployeeList) {
            if (sex.equals(person.getSex()))
                showEmployeesData(person);
        }
    }

    void averageSalary(Sex sex) {
        double sum = 0;
        double average = 0;
        for (Person person : EmployeeList) {
            if (sex.equals(person.getSex())) {

                for (Person personP : EmployeeList
                        ) {
                    sum += personP.getSalary();
                //    average = sum /;
                }


            }


        }
        System.out.println("średnia pensji wynosi :" + average);


    }
    void SalaryRaise(double kwotaPodwyzki){
        for(Person person:EmployeeList){
            person.setSalary(person.getSalary() + kwotaPodwyzki);
            showEmployeesData(person);

        }
    }
    void sumaPensji(){
        double suma=0;
        for (Person person:EmployeeList
             ) {suma+=person.getSalary();


        }System.out.println("Suma pensji wynosi " +suma);
    }
    void sumaPensji(double pensja){
        double suma=0;
        for (Person person:EmployeeList
                ) {suma+=person.getSalary();


        }System.out.println("Suma pensji wynosi " +suma);
    }
    private void showEmployeesData(Person person) {
        System.out.println(String.format("%s,%s,%s.l,%s zł", person.getName(), person.getSex(),
                person.getAge(), person.getSalary()));
    }
}
