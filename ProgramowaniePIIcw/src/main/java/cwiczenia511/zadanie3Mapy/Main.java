package cwiczenia511.zadanie3Mapy;

public class Main {
    public static void main(String[] args) {
    //    company();
        counter();
    }

    private static void counter() {
        Counter counter = new Counter();
        counter.countWords();
    }

    private static void company() {
        Company company = new Company();
        company.addToMap();
        System.out.println("================");
        company.showId();
        System.out.println("==============");
        company.showNames();
        System.out.println("==================");
        company.getEmployee(55);
        System.out.println("------------------");
        company.showEmployees();
    }
}
