package cwiczenia2511.generyki.bigger_fruit_box_04;

public class BiggerFruitBox <A, B> {
    private A first;
    private B second;

    public BiggerFruitBox(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
