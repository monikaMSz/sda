package cwiczenia2511.generyki.inheriting_07;

import cwiczenia2511.generyki.generic_extends_05.Rectangle;

public class GeneralBox <T extends Rectangle> extends NextShapeBox<T> {
    public GeneralBox(T shape) {
        super(shape);
    }
}
