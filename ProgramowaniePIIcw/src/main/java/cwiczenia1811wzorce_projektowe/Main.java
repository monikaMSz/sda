package cwiczenia1811wzorce_projektowe;

import com.sun.org.apache.xpath.internal.SourceTree;
import cwiczenia1811wzorce_projektowe.builder.User;
import cwiczenia1811wzorce_projektowe.facade.Facade;
import cwiczenia1811wzorce_projektowe.factory.Document;
import cwiczenia1811wzorce_projektowe.factory.DocumentGenerator;
import cwiczenia1811wzorce_projektowe.observer.Person;
import cwiczenia1811wzorce_projektowe.observer.Weather;
import cwiczenia1811wzorce_projektowe.singleton.DataBase;
import cwiczenia1811wzorce_projektowe.strategy.*;

import java.util.Scanner;

import static cwiczenia1811wzorce_projektowe.factory.DocumentGenerator.DocumentType.HTML;
import static cwiczenia1811wzorce_projektowe.factory.DocumentGenerator.DocumentType.TXT;

public class Main {
    public static void main(String[] args) {
//        builder();
//        factory();
//        facade();
//        obserever();
//        singleton();
        strategy();
    }

    private static void strategy() {
        System.out.println("10 + 5 =" + strategyHelper(new OperationAdd(),10,5));
        System.out.println("10 - 5 =" + strategyHelper(new OperationSubstract(),10,5));
        System.out.println("10 / 5 =" + strategyHelper(new OperationDivide(),10,5));
        System.out.println("10 * 5 =" + strategyHelper(new OperationMultiply(),10,5));

//        int result = 0;
//        try {
//            Calculator calculator = new Calculator(new OperationAdd());
//            result = calculator.executeStrategy(10, 5);
//            System.out.println("10 + 5 = " + result);
//
//            calculator = new Calculator(new OperationSubstract());
//            result = calculator.executeStrategy(10, 5);
//            System.out.println("10 - 5 = " + result);
//
//            calculator = new Calculator(new OperationDivide());
//            result = calculator.executeStrategy(10, 5);
//            System.out.println("10 / 5 = " + result);
//
//            calculator = new Calculator(new OperationMultiply());
//            result = calculator.executeStrategy(10, 5);
//            System.out.println("10 * 5 = " + result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
    private static Integer strategyHelper(Strategy strategy,int one,int two){
        try {
            return  new Calculator(strategy).executeStrategy(one,two);
        } catch (Exception e) {
            e.printStackTrace();
        }return null;
    }

    private static void singleton() {
        DataBase db = DataBase.getInstance();
        db.saveData("bultaorune");
        db.saveData("FIIIIIIIIIIIIIIIRE");
        db.show();
        DataBase db2 = DataBase.getInstance();
        db2.saveData("ku sonul naemirojwo");
        db2.saveData("save me save me");
        db.show();
        db2.show();

    }

    private static void obserever() {
        Person p1 = new Person("Asia", 25);
        Person p2 = new Person("Karolina", 28);
        Person p3 = new Person("Józefa", 30);
        Person p4 = new Person("Arek", 23);
        Person p5 = new Person("Stanisław", 20);

        Weather weather = new Weather();
        weather.addObservers(p1, p2, p3, p4, p5);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nPodaj temperaturę: ");
            int currTemperature = scanner.nextInt();
            weather.update(currTemperature);

            System.out.println();
        }
    }

    private static void facade() {
        Facade system = new Facade();
        system.activate();

        system.deactivate();
    }

    private static void factory() {
        DocumentGenerator generator = new DocumentGenerator();
        String myText = "Ne ppi\r\ntam nunmul";

        Document txt = generator.createDocument(myText, TXT);
        txt.saveFile("mojplik");
        //  txt.setTextToSave(myText);
        System.out.println();

        Document html = generator.createDocument(myText, HTML);
        html.saveFile("mojplik");

        //System.out.println(txt.getTextToSave());

    }

    private static void builder() {
        User user = new User.UserBuilder()
                .firstName("Jan")
                .lastName("Kowalski")
                .age(77)
                .address("Koszalin")
                .phoneNumber("98476372982")
                .build();

        System.out.println(user.toString());
    }

}
