package cwiczenia511.zadanie1i2ListaIKolejka;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        shop();


    }


    private static void shop() {
        Client c1 = new Client("Anna");
        Client c2 = new Client("Barbara");
        Client c3 = new Client("Jan");
        Client c4 = new Client("Jakub");
//        c1.printList();
//        c2.printList();
//        c3.printList();
//        c4.printList();

        Shop shop = new Shop();
//        System.out.println("================");
       shop.addClientsToQueue(c1,c2,c3,c4);
//        System.out.println("================");
//        shop.showQueue();
        shop.startService();
    }
}
