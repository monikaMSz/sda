package com.msz.ProgramowanieP1.zbiorset;

import com.msz.ProgramowanieP1.biblioteka.*;
import com.msz.ProgramowanieP1.dodatkowe.Narzedzia;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Cwiczenia {
    public static void main(String[] args) {
        Set<Ksiazka> hashSet = new HashSet<>();
//        Set<Ksiazka> treeSet = new TreeSet<>(new PorownywarkaKsiazek(Kryterium.TYTUL,Porzadek.MALEJACO);
        Set<Ksiazka> treeSet = new TreeSet<>();

        Ksiazka ksiazka = Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 219, "Pan Tadeusz",
                "22222333333", 400, Kategoria.EPOPEJA);
        Ksiazka ksiazka2 = Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 219, "Dziady",
                "22222333333", 300, Kategoria.EPOPEJA);
        Ksiazka ksiazka3 = Narzedzia.utworzKsiazke("Hanya", "Yanagihara", 40, "Małe Życie", "33333333333",
                850, Kategoria.DRAMAT);
        Ksiazka ksiazka4 = Narzedzia.utworzKsiazke("Ken", "Kesey", 70, "Małe Życie",
                "444444444444", 350, Kategoria.DRAMAT);
        Ksiazka ksiazka5 = Narzedzia.utworzKsiazke("J.K.", "Rowling", 50, "Harry Potter",
                "5555555555", 400, Kategoria.BAJKA);
        Ksiazka ksiazka6 = Narzedzia.utworzKsiazke("Herman", "Hesse", 100, "Demian", "6666666666",
                350, Kategoria.DRAMAT);

        System.out.println(ksiazka.equals(ksiazka2));
        hashSet.add(ksiazka);
        treeSet.add(ksiazka);
        hashSet.add(ksiazka2);
        treeSet.add(ksiazka2);
        hashSet.add(ksiazka3);
        treeSet.add(ksiazka3);
        hashSet.add(ksiazka4);
        treeSet.add(ksiazka4);
        hashSet.add(ksiazka5);
        treeSet.add(ksiazka5);
        hashSet.add(ksiazka6);
        treeSet.add(ksiazka6);

        //dodawanie iterowanie po liscie

//        for (Ksiazka ks : hashSet) {
//            System.out.println(ks);
//       }
//       Iterator<Ksiazka> iterator = hashSet.iterator();
//        while (iterator.hasNext()) {
//            Ksiazka ks = iterator.next();
//           System.out.println(ks);

        //dodawanie iterowanie po liscie


//        }
//        hashSet.remove(ksiazka);

        System.out.println(hashSet);
        System.out.println(treeSet);


    }
}
