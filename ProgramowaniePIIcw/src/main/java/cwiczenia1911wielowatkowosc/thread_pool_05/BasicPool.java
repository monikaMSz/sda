package cwiczenia1911wielowatkowosc.thread_pool_05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BasicPool {
    public void run() {
        //Liczba obługujących zadania
        ExecutorService executorSerivice =
                Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            executorSerivice.submit(new Task(i));

        }
        System.out.println("Wszystkie zadania zostały dodane");
        executorSerivice.shutdown();
    }
}
