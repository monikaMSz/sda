package cwiczenia411;

public class Main {
    public static void main(String[] args) {
        //   rectangle();
        //  array();
        //  company();
        oneDimArray();
    }
    private static void oneDimArray() {
        OneDimensionalArray array= new OneDimensionalArray();
  // array.show();
    array.fillArray();
  //      System.out.println("===============");
        array.show();
        array.minMax();
        array.average();
        array.stosunekSredniej();


    }

    private static void company() {
        Company company = new Company("PGE");
        Person p1 = new Person("Anna", 45, 1500.00, Sex.FEMALE);
        Person p2 = new Person("Aga", 40, 1500.00, Sex.FEMALE);
        Person p3 = new Person("Kuba", 43, 2000.00, Sex.MALE);
        Person p4 = new Person("Jarosław", 34, 2000.00, Sex.MALE);
        company.addEmpolyees(p1, p2, p3, p4);
        company.showAllEmplyees();
        System.out.println("---------------");
        company.showEmplyeesBySex(Sex.FEMALE);
        System.out.println("---------------");
        company.averageSalary(Sex.FEMALE);
        System.out.println("---------------");
        company.SalaryRaise(400);
        System.out.println("---------------");
        company.sumaPensji();
        System.out.println("---------------");
      company.sumaPensji();
    }

    private static void array() {
    //    System.out.println("------------------");
        TwoDimensionalArray array = new TwoDimensionalArray(5, 5);
//        array.show();
        array.fillArray(5, 38);
//        System.out.println("+++++++++++++++++++");
        array.show();
        System.out.println("+++++++++++++++++++");

//        array.showRow(2);
//        System.out.println("----------------------");
//        array.showColumn(1);
//        System.out.println("===============");
//        array.sumRowCol();
        //array.removeRow(2);
   //     array.changeRows();
    //   array.minMax();
      //  array.min();
        array.changeUp();
       // array.show();
    }

    private static void rectangle() {
        Rectangle rectangle = new Rectangle();

        rectangle.readSize(6, 8);
        rectangle.printRectangle("o");
        rectangle.printRectangle();
        rectangle.printFrame("o");
        rectangle.printFrame();
        System.out.println(rectangle.area(6, 8));
        rectangle.area();
    }
}
