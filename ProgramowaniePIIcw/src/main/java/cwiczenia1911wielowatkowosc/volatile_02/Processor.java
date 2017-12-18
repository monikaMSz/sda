package cwiczenia1911wielowatkowosc.volatile_02;

public class Processor extends Thread {

    private volatile boolean running=true;
    @Override
    public void run() {
        while(running){
            System.out.println("Running");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Stopped");

    }
    public void stopThread(){
        running=false;
    }
}
