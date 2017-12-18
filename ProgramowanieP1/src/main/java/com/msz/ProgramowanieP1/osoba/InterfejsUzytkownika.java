package com.msz.ProgramowanieP1.osoba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InterfejsUzytkownika {
    public static void main(String[] args) {
        List<Osoba> listaOsob = new ArrayList<>();
        pokazListeOsob(listaOsob);

        Osoba osoba = new Osoba("Jacek", "Kkkkkk", "Warszawa", "87-765",
                "Południowa", 37, LocalDate.of(1976,6,27), "Lekarz pediatra", Plec.MEZCZYZNA);
        Osoba osoba1 = new Osoba("Mariola", "Ddddddddd", "Lublin", "65-123",
                "Wiejska", 45, LocalDate.of(1984,8,18), "Doradca-Kasjer", Plec.KOBIETA);
        Osoba osoba2 = new Osoba("Janusz", "Cccccccc", "Kraków", "76-209",
                "Wschodnia", 57, LocalDate.of(1990,9,12), "Elektryk", Plec.MEZCZYZNA);
        Osoba osoba3 = new Osoba("Wioletta", "Pppppp", "Gdańsk", "45-234",
                "Morska", 27, LocalDate.of(1990,11,25), "Nauczyciel", Plec.KOBIETA);
        Osoba osoba4 = new Osoba("Tomasz", "Rrrrrrrrrrr", "Koszalin", "87-475",
                "3 Maja", 30, LocalDate.of(1987,7,03), "Radca Prawny", Plec.MEZCZYZNA);
        Osoba osoba5 = new Osoba("Anna", "Jjjjjjj", "Zakopane", "45-132",
                "Górska", 54, LocalDate.of (1963,2,27), "Hotelarz", Plec.KOBIETA);
        Osoba osoba6 = new Osoba("Jakub", "Ssssssssss", "Bydgoszcz", "65-099",
                "Zachodnia", 40, LocalDate.of(1977,12,31) ,"Kurier", Plec.MEZCZYZNA);
        Osoba osoba7 = new Osoba("Krystyna", "Mmmmmmmmmm", "Warszawa", "34-203",
                "Poznanska", 60, LocalDate.of(1957,4,16), "Księgowa", Plec.KOBIETA);
        Osoba osoba8 = new Osoba("Mariusz", "Bbbbbbbbb", "Poznań", "28-916",
                "Północna", 32, LocalDate.of(1985,5,17), "Bibliotekarz", Plec.MEZCZYZNA);
        Osoba osoba9 = new Osoba("Alicja", "Ddddddddd", "Wrocław", "76-236",
                "Mickiewicza", 30, LocalDate.of(1987,07,03), "Adwokat", Plec.KOBIETA);

        listaOsob.add(osoba);
        listaOsob.add(osoba1);
        listaOsob.add(osoba2);
        listaOsob.add(osoba3);
        listaOsob.add(osoba4);
        listaOsob.add(osoba5);
        listaOsob.add(osoba6);
        listaOsob.add(osoba7);
        listaOsob.add(osoba8);
        listaOsob.add(osoba9);
//        System.out.println(listaOsob);

//        private static void dodajOsobyDoListy(List<Osoba> listaOsob){
//            listaOsob.dodajOsobe(Osoba.utworzOsobe("Jacek", "Kkkkkk", "Warszawa", "87-678",
//                    "Południowa 9/34", 37, "1970-08-16", "Lekarz pediatra", Plec.M));
//    }


    }


    public static void pokazListeOsob(List<Osoba> listaOsob) {

        for (Osoba os : listaOsob) {
            System.out.println(os);
        }
    }
}
