package cwiczenia1911wielowatkowosc.lock_04;

import sun.java2d.loops.GraphicsPrimitive;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lock {

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    Random random = new Random();


    public void work() {
        long start = System.currentTimeMillis();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
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
        long end = System.currentTimeMillis();

        System.out.println("Czas: "+(end-start));
        System.out.println("List1: "+list1.size());
        System.out.println("List2: "+list2.size());
        System.out.println("Suma: "+(list1.size()+list2.size()));
    }

    private void process() {
        for (int i = 0; i < 1_000; i++) {
            taskOne();
            taskTwo();
        }
    }

    private void taskTwo() {
        synchronized(lock2){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    private void taskOne() {
        synchronized (lock1){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }
}
