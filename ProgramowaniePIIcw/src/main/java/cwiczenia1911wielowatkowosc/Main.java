package cwiczenia1911wielowatkowosc;

import cwiczenia1911wielowatkowosc.deadlock_07.Bank;
import cwiczenia1911wielowatkowosc.lock_04.Lock;
import cwiczenia1911wielowatkowosc.my_thread_01.MyThread;
import cwiczenia1911wielowatkowosc.synchronized_03.Worker;
import cwiczenia1911wielowatkowosc.thread_pool_05.BasicPool;
import cwiczenia1911wielowatkowosc.volatile_02.Processor;
import cwiczenia1911wielowatkowosc.wait_notify_06.App;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//        myThread();
//        myThread2();
//        runnable();
//        processor();
//        synchronizedThreads();
//        lock();
//        pool();
//        waitNotify();
        deadlock();

    }

    private static void deadlock() {
        Bank bank = new Bank();
        bank.start();
    }


    private static void waitNotify() {
        App app = new App();
        app.work();
    }

    private static void pool() {
        BasicPool basicPool = new BasicPool();
        basicPool.run();
    }

    private static void lock() {
        Lock lock = new Lock();
        lock.work();
    }

    private static void synchronizedThreads() {
        Worker worker = new Worker();
//        worker.firstRun();
        worker.secondRun();
    }


    private static void processor() {
        Processor processor = new Processor();
        processor.start();

        new Scanner(System.in).nextLine();

        processor.stopThread();
    }

    private static void runnable() {//MyThread
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello: "+Thread.currentThread().getId());

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private static void myThread2() {
        Thread thread = new Thread(new MyThread());
        thread.start();
    }

    private static void myThread() {

        System.out.println("Id głównego wątku: " + Thread.currentThread().getId());
        MyThread myThread1 = new MyThread();
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();
    }
}
