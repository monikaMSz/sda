package cwiczenia1911wielowatkowosc.thread_pool_05;

public class Task implements Runnable {

    private int id;

    public Task(int id){
        this.id=id;
    }
    @Override
    public void run() {
        System.out.println("Rozpoczynam zadanie: "+ id);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Zakończono zadanie: "+ id);

    }
}
