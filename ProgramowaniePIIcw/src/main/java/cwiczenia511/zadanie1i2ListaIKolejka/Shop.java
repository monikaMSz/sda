package cwiczenia511.zadanie1i2ListaIKolejka;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Shop {
    Queue<Client> clientQueue=new LinkedList<>();

    void addClientsToQueue(Client...clients){
        for (Client client:clients
             ) {
            System.out.println("Do kolejki dodano " + client.getName());
            clientQueue.offer(client);

        }
    }

    void showQueue() {
        for (Client client : clientQueue
                ) {
            System.out.println("Do kolejki dodano " + client.getName());
        }
    }
    public void startService(){
        System.out.println("Liczba klientów w kolejce " + clientQueue.size());
        Random random = new Random();
        double income =0;

        while(!clientQueue.isEmpty()){
            Client client=clientQueue.poll();
            System.out.println(client.getName());
            Iterator<Product> it = client.getShoppingList().iterator();
            while(it.hasNext()){
                Product product = it.next();
                System.out.printf(" -%s %.2f zł\n",product.getProductName(),product.getPrice());
                income+=product.getPrice();
                it.remove();

                try {
                    Thread.sleep(random.nextInt(2000));
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
        System.out.println("Liczba klientów po obsłudze " + clientQueue.size());
        System.out.printf("Dochód z zakupów  %.2f zł",income);
    }

}
