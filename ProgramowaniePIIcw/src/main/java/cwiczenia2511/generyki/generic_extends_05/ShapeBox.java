package cwiczenia2511.generyki.generic_extends_05;

public class ShapeBox <T extends Shape> {
    private T shape;

    public ShapeBox(T shape) {
                this.shape = shape;
    }

    public T getShape() {
        return shape;
    }
    public String getNameOfShape(){
        shape.hello();
        return shape.getName();
    }

}
