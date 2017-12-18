package zajecia7cwiczenie2;

public class Sphere extends Circle {
    public Sphere (double radius){
        super(radius);
    }
    public double getSphereVolume(){
        return 4/3* Math.PI * getRadius()*getRadius()*getRadius();
    }
    public double getSphereArea() {
        return 4 * Math.PI *getRadius()*getRadius();
    }
}
