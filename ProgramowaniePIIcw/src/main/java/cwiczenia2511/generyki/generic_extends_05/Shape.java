package cwiczenia2511.generyki.generic_extends_05;

public interface Shape {
    String getName();

    default void hello(){
        System.out.println("Hello, I'm shape!");
    }
}
