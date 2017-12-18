package cwiczenia1911wielowatkowosc.wait_notify_06;

import java.util.Scanner;

public class Proc {

    public void consume() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Thread.sleep(1000);

        synchronized (this){
            System.out.println("T1 - oczekiwanie na Enter");
            scanner.nextLine();

            System.out.println("T1 - kliknięto Enter");
            notify();
            Thread.sleep(5000);
            System.out.println("T1 - zakończono blok synchronized");
        }
    }

    public void produce() throws InterruptedException {
        synchronized(this){
            System.out.println("T2 - oczekuje");
            wait();
            System.out.println("T2 - zakończone oczekiwanie");
        }
    }
}
