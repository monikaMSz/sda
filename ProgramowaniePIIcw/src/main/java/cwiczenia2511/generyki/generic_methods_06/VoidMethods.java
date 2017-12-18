package cwiczenia2511.generyki.generic_methods_06;

import cwiczenia2511.generyki.generic_extends_05.Circle;
import cwiczenia2511.generyki.generic_extends_05.Rectangle;
import cwiczenia2511.generyki.generic_extends_05.Shape;
import cwiczenia2511.generyki.generic_extends_05.ShapeBox;

public class VoidMethods {

    //Shape box z Circle
    public static void method1(ShapeBox<Circle> box) {
        System.out.println("Inside1: " + box.getNameOfShape());
    }

    //Shape box z 'typem'.Należy zwrócić uwagę na ograniczenia klasy ShapeBox
    public static void method2(ShapeBox<?> box) {
        System.out.println("Inside2: " + box.getShape().getName());
    }

    //Shape box z klasą która dziedziczy po klasie Rectangle
    public static void method3(ShapeBox<? extends Rectangle> box) {
        System.out.println("Inside3: " + box.getShape().getName());
    }

    //see method2
    public static void method4(ShapeBox<? extends Shape> box) {
        System.out.println("Inside4: " + box.getShape().getName());
    }

    //super w górę od Rectangle
    public static void method5(ShapeBox<? super Rectangle>box){
        System.out.println("Inside5: " + box.getShape().getName());
    }
}
