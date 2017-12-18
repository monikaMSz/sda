package cwiczenia511.zadanie3Mapy;

import java.util.HashMap;
import java.util.Map;

public class Company {

    Map<Integer,String> EmployeeMap = new HashMap<>();

    void addToMap(){
        EmployeeMap.put(23,"Anna Nowak");
        EmployeeMap.put(55,"Jacek Góra");
        EmployeeMap.put(67,"Witold Kowalski");
    }
    void showId(){
        System.out.println(EmployeeMap.keySet());
    }
    void showNames(){
        System.out.println((EmployeeMap.values()));
    }
    void getEmployee(int employeeId){
        if(EmployeeMap.containsKey(employeeId)){
            System.out.println(EmployeeMap.get(employeeId));
        }else{
            System.out.println("Taka osoba nie istnieje");
        }
    }
    void showEmployees(){
        for (Map.Entry<Integer,String> entry:EmployeeMap.entrySet()
             ) {
            System.out.printf("%s\t -> \t%s\n",entry.getKey(),entry.getValue());

        }
    }

}
