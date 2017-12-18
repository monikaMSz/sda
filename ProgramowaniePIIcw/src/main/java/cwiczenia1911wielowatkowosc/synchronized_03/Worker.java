package cwiczenia1911wielowatkowosc.synchronized_03;

public class Worker {

    private int count = 0;

    private synchronized void increment() {
        count = count + 1;
    }
    public void secondRun(){
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10_000 ; i++) {
                    increment();

                }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10_000 ; i++) {
                    increment();

                }
            }
        });
        t3.start();
        t4.start();


        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count(2): " + count);
    }


    public void firstRun() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    count = count + 1;
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    count = count + 1;
                }
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + count);
    }
}
