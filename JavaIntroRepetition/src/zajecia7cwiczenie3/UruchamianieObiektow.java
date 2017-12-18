package zajecia7cwiczenie3;

public class UruchamianieObiektow {

    public static void main(String[]args) {
        Circle circle = new Circle(2, "red",true);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(2,3,"red",true);
        System.out.println(rectangle);
        Square square = new Square(2,"red",true);
        System.out.println(square);

    }
}
