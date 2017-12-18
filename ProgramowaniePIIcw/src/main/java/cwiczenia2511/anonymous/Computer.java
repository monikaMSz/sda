package cwiczenia2511.anonymous;

public class Computer {
    void run(){
        prepare();
        System.out.println("Computer is running");
    }

    protected void prepare() {
        System.out.println("Preparing...");
    }
}
