package cwiczenia511.zadanie1i2ListaIKolejka;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    private String name;
    private List<Product> shoppingList = new ArrayList<>();

    public Client(String name) {
        this.name = name;
        addToShoppingList();

    }

    void addToShoppingList() {
        Random random = new Random();

        int listSize = random.nextInt(5) + 1;
        for (int i = 0; i < listSize; i++) {
            shoppingList.add(new Product(Product.exampleNames[random.nextInt(Product.exampleNames.length)],
                    random.nextDouble() * (random.nextInt(100))));
        }


    }

    void printList() {
        System.out.printf("\nZakupy klienta: %s\n", name);
        double sum = 0;
        for (Product product : shoppingList
                ) {
            System.out.println(String.format("%s- %.2f zł", product.getProductName(), product.getPrice()));
            sum += product.getPrice();

        }
        System.out.printf("Suma zakupów: %.2f zł\n", sum);

    }

    public String getName() {
        return name;
    }

    public List<Product> getShoppingList() {
        return shoppingList;
    }
}
