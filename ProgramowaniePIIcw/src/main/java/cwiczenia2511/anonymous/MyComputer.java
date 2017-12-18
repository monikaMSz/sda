package cwiczenia2511.anonymous;

public class MyComputer extends Computer {
    @Override
    protected void prepare() {
        super.prepare();
        System.out.println("Overrided");
    }
}
