package zajecia7cwiczenie2;

public class Uruchamiam {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(3,4,"green");
        System.out.println(cylinder.getVolume());
        System.out.println(circle.getArea());
        System.out.println(cylinder);
        Sphere sphere = new Sphere(2);
        System.out.println(sphere.getSphereVolume());
        System.out.println(sphere.getSphereArea());
    }

}
