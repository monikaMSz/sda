package cwiczenia2511.anonymous;

public class Main {
    public static void main(String[] args) {
        person();
        computer();
    }

    private static void computer() {
        Computer c1 = new Computer();
        c1.run();
        System.out.println("=============================");

        new Computer() {
            @Override
            protected void prepare() {
                super.prepare();
                System.out.println("Extra preparing added");
            }
        }.run();

        System.out.println("=============================");

        MyComputer myComputer = new MyComputer();
        myComputer.run();



    }


    private static void person() {
        Person p1 = new Person("Zorro", 23);
        System.out.println(p1.introduce());

        System.out.println(new Person("Zdzisław", 78) {
            @Override
            String introduce() {
                return String.format("Good Evening! I'm %s", getName());
            }
        }.introduce());
    }
}
