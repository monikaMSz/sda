package cwiczenia2511.generyki.generic_methods_06;

import cwiczenia2511.generyki.generic_extends_05.Rectangle;
import cwiczenia2511.generyki.generic_extends_05.Shape;

public class ReturnMethods {

    //Metoda przyjmuje 'dowolny' typ zmiennej
    //public static void method6(Class<?> element) // <- równoznaczne
    public static <A> void method6(A element){

    }
    public static <B> B method7(B element){
        return element;
    }
    public static <C extends Shape> C method8(C shape){
        System.out.println("Przekazano: "+ shape.getName());
        return shape;
    }
    public static <A> A method9(A first, A second){
        System.out.println("Do method9 przekazano: "+ first.getClass().getSimpleName()
        + "oraz "+ second.getClass().getSimpleName());
        return first;
    }
    public static <T extends Shape, A extends Rectangle> void method10(T first,A second){

    }
}
