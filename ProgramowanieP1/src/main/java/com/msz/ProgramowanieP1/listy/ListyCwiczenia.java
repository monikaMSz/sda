package com.msz.ProgramowanieP1.listy;

import java.util.*;

public class ListyCwiczenia {
    public static void main(String[] args) {
        tworzenieList();
        dodawanieElementowDoList();
        zamianaMiejscNaLiscie();
        iterowaniePoLiscie();
    }

    private static void iterowaniePoLiscie() {
        List<Integer> listaLiczb = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int liczba = random.nextInt(200);
            listaLiczb.add(liczba);//twoerzenie listy i wypelnianie
        }
        //1.sposob na wysiwetlanie listy
        for (int i = 0; i < listaLiczb.size(); i++) {
            System.out.println(String.format("%d element listy wynosi %d", i, listaLiczb.get(i)));
        }
        //drugi sposon na wyswietlanie listy
        for (Integer liczba : listaLiczb) {//kolejno elementy z listy, zeby je wyswietlic ale w tym momencie nie mozna
            // modyfikowac.zwykla for pozwala na zamiane elementow,wartosc byla zapisywana w pomocniczym liczba
            System.out.println(String.format("Kolejny element listy to: %d", liczba));
        }
        //trzeci sposob na wyswietlanie listy
        Iterator<Integer> iterator = listaLiczb.iterator();//tworzenie obiektu i wywolanie metody iterator
        while (iterator.hasNext()) {//iterator wywoluje metode hasNext
                                    // jezeli iteraotr ma koljena wartosc wejdzmy do tej petli,petla tyle razay
                                    //ile bedzie podiwadalo dlugosci listy
            Integer liczba = iterator.next();
            System.out.println("Wartość pobrana z iteratora: " + liczba);
        }
    }

    //zamiana miejsc wartosci
    private static void zamianaMiejscNaLiscie() {
        List<Integer> listaLiczb = new ArrayList<>();
        for (int i = 20; i > 10; i--) {
            listaLiczb.add(i);
        }
        System.out.println(listaLiczb);
        //Zamieniamy miejscami liczbę 13 i18
        int liczba13 = listaLiczb.get(7);
        int liczba18 = listaLiczb.get(2);
        listaLiczb.remove(2);
        listaLiczb.add(2, liczba13);
        listaLiczb.remove(7);
        listaLiczb.add(7, liczba18);
        //listaLiczb.set(2,liczba18);
        System.out.println(listaLiczb);
    }

    private static void dodawanieElementowDoList() {
        List<Integer> listaLiczb = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int liczba = random.nextInt(200);
            listaLiczb.add(liczba);
        }
        System.out.println(listaLiczb);//wysiwetlanie wypelnionej listy liczb
        listaLiczb.add(5, 500);
        System.out.println(listaLiczb);//kolejny raz wyswietlamy liste zeby bylo widac zmiane
        List<Integer> drugaLista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int liczba = random.nextInt(10);
            drugaLista.add(liczba);
        }
        System.out.println("===================");
        System.out.println("Druga lista: ");
        System.out.println(drugaLista);

        //łączenie list,dodawanie listy1 do drugiejlisty
        drugaLista.addAll(listaLiczb);
        System.out.println("Połączone listy: ");
        System.out.println(drugaLista);
    }

    private static void tworzenieList() {
        List<Integer> lista1 = new ArrayList<>();//tylko metody interfejsu list
        ArrayList<Integer> lista2 = new ArrayList<>();//wszsytkie metody klasy ArrayList niewazne czy z inteferjsu,czy samem wpisana

        List lista3 = new ArrayList();

        lista1 = new LinkedList();

        if (lista1 instanceof ArrayList) {
            ((ArrayList) lista1).ensureCapacity(123);

        }
        lista2.ensureCapacity((123));
    }
}
