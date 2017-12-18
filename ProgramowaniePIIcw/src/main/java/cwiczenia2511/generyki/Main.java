package cwiczenia2511.generyki;

import cwiczenia2511.generyki.bigger_fruit_box_04.BiggerFruitBox;
import cwiczenia2511.generyki.generic_03.FruitBox;
import cwiczenia2511.generyki.generic_extends_05.*;
import cwiczenia2511.generyki.generic_methods_06.ReturnMethods;
import cwiczenia2511.generyki.generic_methods_06.VoidMethods;
import cwiczenia2511.generyki.inheriting_07.GeneralBox;
import cwiczenia2511.generyki.simple_02.SimpleFruitBox;
import cwiczenia2511.generyki.without_01.Apple;
import cwiczenia2511.generyki.without_01.AppleBox;
import cwiczenia2511.generyki.without_01.Orange;
import cwiczenia2511.generyki.without_01.OrangeBox;

public class Main {
    public static void main(String[] args) {
//        without();
//        simple();
//        generic();
//        bigger_fruit_box();
//        generic_extends();
//        generic_void_06();
//        generic_return_06();
        inheriting();
    }

    private static void inheriting() {
        GeneralBox<Square>generalBox = new GeneralBox<>(new Square());
      // GeneralBox<Circle>generalBox1 = new GeneralBox<>(new Circle());
    }

    private static void generic_return_06() {
        System.out.println(ReturnMethods.method7("abcd").getClass().getSimpleName());
        System.out.println(ReturnMethods.method7(1234).getClass().getSimpleName());

        System.out.println("================================");
        /******************************************************************/

        ReturnMethods.method8(new Circle());
        ReturnMethods.method8(new Rectangle());
        ReturnMethods.method8(new Square());

        //Przypisuje do wspólnego typu 'Shape', który jest wspólny
        //dla wszystkich zwracanych możliwości (square,circle,rectangle)
        Shape shape = ReturnMethods.method8(new Square());
        System.out.println(shape.getName());

        System.out.println(shape.getClass().getSimpleName());

        ReturnMethods.method8(new Circle()).getClass().getSimpleName();
        System.out.println(ReturnMethods.method8(new Circle()).getClass().getSimpleName());

        ReturnMethods.method8(new Rectangle()).getClass().getSimpleName();
        System.out.println(ReturnMethods.method8(new Rectangle()).getClass().getSimpleName());
        System.out.println("================================");

        /************************************************************/

        ReturnMethods.method9(new Apple(),new Orange());
        ReturnMethods.method9("Adam", 1234);
        System.out.println("================================");
        /***************************************************************/

        ReturnMethods.method10(new Circle(),new Rectangle());
        ReturnMethods.method10(new Rectangle(),new Rectangle());
        ReturnMethods.method10(new Square(),new Square());
        ReturnMethods.method10(new Circle(),new Square());
//        ReturnMethods.method10(new Circle(),new Circle());//rec/circ;sq/circ
    }

    private static void generic_void_06() {
//        ShapeBox<Rectangle>box1a=new ShapeBox<>(new Rectangle());
        ShapeBox<Circle>box1b = new ShapeBox<>(new Circle());

        VoidMethods.method1(box1b);
        System.out.println("================================");

        /*****************************************************/

        ShapeBox<Circle>box2a = new ShapeBox<>(new Circle());
        ShapeBox<Rectangle>box2b = new ShapeBox<>(new Rectangle());
        ShapeBox<Square>box2c = new ShapeBox<>(new Square());

        VoidMethods.method2(box2a);
        VoidMethods.method2(box2b);
        VoidMethods.method2(box2c);

        System.out.println("================================");

        /*********************************************************/

        ShapeBox<Rectangle>box3a = new ShapeBox<>(new Rectangle());
        ShapeBox<Square>box3b = new ShapeBox<>(new Square());
        ShapeBox<Circle>box3c = new ShapeBox<>(new Circle());

        VoidMethods.method3(box3a);
        VoidMethods.method3(box3b);
//        VoidMethods.method3(box3c);

        System.out.println("================================");

        /********************************************************/

        ShapeBox<Circle>box4a = new ShapeBox<>(new Circle());
        ShapeBox<Rectangle>box4b = new ShapeBox<>(new Rectangle());
        ShapeBox<Square>box4c = new ShapeBox<>(new Square());

        VoidMethods.method4(box4a);
        VoidMethods.method4(box4b);
        VoidMethods.method4(box4c);

        System.out.println("================================");

        /*********************************************************/

        ShapeBox<Circle>box5a = new ShapeBox<>(new Circle());
        ShapeBox<Rectangle>box5b = new ShapeBox<>(new Rectangle());
        ShapeBox<Square>box5c = new ShapeBox<>(new Square());

//        VoidMethods.method5(box4a);
        VoidMethods.method5(box4b);
//        VoidMethods.method5(box4c);



    }

    private static void generic_extends() {
        ShapeBox<Circle> shapeBox = new ShapeBox<>(new Circle());
        ShapeBox<Rectangle> shapeBox1 = new ShapeBox<>(new Rectangle());

        //Klasa "String" nie implementuje interfejsu "Shape"
//        ShapeBox<String> shapeBox2 = new ShapeBox<String>("lu uu");
        // shapeBox.getShape().hello();

        //Wywołanie jednej motedy z klasy i jednej z interfejsu
        System.out.println(shapeBox.getNameOfShape());

        ShapeBox<Square> shapeBox2 = new ShapeBox<>(new Square());
        System.out.println(shapeBox2.getShape().getName());

        ShapeBox<Rectangle> shapeBox3 = new ShapeBox<>(new Square());
        System.out.println(shapeBox3.getShape().getName());

    }

    private static void bigger_fruit_box() {
        BiggerFruitBox<Apple, Orange> biggerFruitBox = new BiggerFruitBox(new Apple(), new Orange());
        System.out.printf("Pierwszy : %s, drugi: %s\n\n", biggerFruitBox.getFirst().getClass().getSimpleName(),
                biggerFruitBox.getSecond().getClass().getSimpleName());

        BiggerFruitBox<Float, String> biggerFruitBox2 = new BiggerFruitBox(2.0f, "Did you see my bag?");
        System.out.printf("Pierwszy : %s, drugi: %s\n\n", biggerFruitBox2.getFirst().getClass().getSimpleName(),
                biggerFruitBox2.getSecond().getClass().getSimpleName());
    }

    private static void generic() {
        FruitBox<Apple> appleFruitBox = new FruitBox<>(new Apple());
        System.out.println(appleFruitBox.getFruit().getClass().getSimpleName());

        Apple newApple = new Apple();
        appleFruitBox.setFruit(newApple);
        System.out.println(appleFruitBox.getFruit().getClass().getSimpleName());

        // appleFruitBox.setFruit(new Orange()); <-nie zgodne typy

        FruitBox<Orange> orangeFruitBox = new FruitBox<>(new Orange());
        System.out.println(orangeFruitBox.getFruit().getClass().getSimpleName());

        FruitBox<String> stringFruitBox = new FruitBox<>("majimak");
        System.out.println(stringFruitBox.getFruit().getClass().getSimpleName());
    }

    private static void simple() {
        SimpleFruitBox simpleFruitBox = new SimpleFruitBox(new Orange());

        System.out.println(simpleFruitBox.getFruit().getClass().getSimpleName());

        simpleFruitBox.setFruit(new Apple());

        System.out.println(simpleFruitBox.getFruit().getClass().getSimpleName());

        simpleFruitBox.setFruit(new String());
        System.out.println(simpleFruitBox.getFruit().getClass().getSimpleName());

        simpleFruitBox.setFruit("Abcdef");
        System.out.println(simpleFruitBox.getFruit().getClass().getSimpleName());


    }

    private static void without() {
        //duplikacja kodu
        AppleBox appleBox = new AppleBox(new Apple());
        OrangeBox orangeBox = new OrangeBox(new Orange());
    }
}
