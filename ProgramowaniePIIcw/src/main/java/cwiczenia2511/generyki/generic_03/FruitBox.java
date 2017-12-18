package cwiczenia2511.generyki.generic_03;

public class FruitBox <T> {
    private T fruit;

    public FruitBox(T fruit) {

        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }


}
