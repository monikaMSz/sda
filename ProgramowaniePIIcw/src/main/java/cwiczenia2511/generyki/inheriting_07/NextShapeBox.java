package cwiczenia2511.generyki.inheriting_07;

import cwiczenia2511.generyki.generic_extends_05.Shape;

public class NextShapeBox<T extends Shape> {
    private T shape;

    public NextShapeBox(T shape) {
        this.shape = shape;
    }

    public T getShape() {
        return shape;
    }
}
