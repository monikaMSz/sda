package com.msz.ProgramowanieP1.kolejki;

import java.util.*;

public class KolejkiCwiczenia {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {//klasa anonimowa, klasy takie definijuemy wtedy gdzie dana klasa
            //bedzie wykorzystywana i nigdzie injdziej.tam gdzie chcemy ja wyslac to ja tam tworzymy.metoda wymaga stworzenia obiektu
            //ktory bedzie wykorzystany do metody.sortowanie wymaga obiektu klasy comparator, albo obiektu implementujacego

            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(o2)) {
                    return 0;
                } else if (o1.intValue() > o2.intValue()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };

        Queue<Integer> linkedList = new LinkedList<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>(comparator);

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int liczba = random.nextInt(100);
            linkedList.offer(liczba);
            priorityQueue.offer(liczba);//dodawanie liczb do kolejek
        }

        System.out.println(linkedList);
        System.out.println(priorityQueue);//prQ sortuje dopiero po tym jak dodamu do komparatora
//iterujemy po kolejnych elementach kolejki
 //       wyswietlKolejke(linkedList);

//        wyswietlKolejke(priorityQueue);

        //sprawdzanie czy kolejka jest pusta
    while(!priorityQueue.isEmpty()){
        System.out.print(priorityQueue.poll() +" ");
    }
        /*Iterator<Integer> iterator;
        iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }*/
        System.out.println(" ");
    }

    private static void wyswietlKolejke(Queue<Integer> queue) {
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(" ");
    }
}
