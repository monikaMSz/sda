package com.msz.ProgramowanieP1.biblioteka;

import com.msz.ProgramowanieP1.dodatkowe.Narzedzia;
import com.msz.ProgramowanieP1.osoba.Osoba;

import java.time.LocalDate;
import java.util.Queue;
import java.util.Set;

public class InterfejsUzytkownika {
    public static void main(String[] args) {
        Biblioteka b1 = new Biblioteka();
        Biblioteka b2 = new Biblioteka();
        dodajKsiazkiDoBibliotek(b1, b2);
        Ksiazka javaPodstawy = Narzedzia.utworzKsiazke("Ray", "Horstmann", 45,
                "Java Podstawy.Wydanie X", "1111111111", 989,
                Kategoria.IT);
        Ksiazka javaTechnikiZaawansowane=Narzedzia.utworzKsiazke("Cay", "Horstmann", 45,
                "Java Techniki Zaawansowane", "2222222222", 989, Kategoria.IT);

       System.out.println(b1.pokazListeKsiazek());

       System.out.println(b2.pokazListeKsiazek());

        System.out.println(b1.pokazCzytelnikowWgKsiazki(javaPodstawy));

        b1.zapiszCzytelnika(javaPodstawy, new Osoba("Jan", "Kowalski", LocalDate.of(1979, 05, 25)));
        b1.zapiszCzytelnika(javaPodstawy, new Osoba("Alicja", "Duda", LocalDate.of(1979, 05, 25)));
        b1.zapiszCzytelnika(javaPodstawy, new Osoba("Anna", "Nowak" , LocalDate.of(1989, 07, 28)));
        b1.zapiszCzytelnika(javaPodstawy, new Osoba("Jakub", "Nowicki", LocalDate.of(1967, 12, 21)));
        b1.zapiszCzytelnika(javaPodstawy, new Osoba("Maria", "Kowal", LocalDate.of(1956,11,23)));

        b1.zapiszCzytelnika(javaTechnikiZaawansowane, new Osoba ("Jan", "Kowalski", LocalDate.of(1979, 05, 25)));
        b1.zapiszCzytelnika(javaTechnikiZaawansowane, new Osoba ("Anna", "Nowak", LocalDate.of(1979, 05, 25)));
        b1.zapiszCzytelnika(javaTechnikiZaawansowane, new Osoba ("Janusz", "Kowalski", LocalDate.of(1979, 05, 23)));
        b1.zapiszCzytelnika(javaTechnikiZaawansowane, new Osoba ("Marta", "Kowalska", LocalDate.of(1985, 05, 28)));
        b1.zapiszCzytelnika(javaTechnikiZaawansowane, new Osoba ("Jakub", "Nowicki", LocalDate.of(1967, 12, 21)));
        b1.zapiszCzytelnika(javaTechnikiZaawansowane, new Osoba ("Monika", "FFFFFF", LocalDate.of(1979, 04, 25)));


        System.out.println(b1.pokazCzytelnikowWgKsiazki(javaPodstawy));
        System.out.println(b1.pokazCzytelnikowWgKsiazki(javaTechnikiZaawansowane));


        System.out.println("===============");
        Queue<Ksiazka> ksiazkiPoAutorze = b1.zwrocListeKsiazekWgKryterium(Kryterium.ISBN, Porzadek.MALEJACO);//przypisujemy kryt aut do zmiennej ksiazkipoaut
        while (!ksiazkiPoAutorze.isEmpty()) {
            Ksiazka ksiazka = ksiazkiPoAutorze.poll();
            System.out.println("Czytelnicy książki o tytule " + ksiazka.getTytul() + ": "
                    + b1.pokazCzytelnikowWgKsiazki(ksiazka));//
        }
        System.out.println(b1.zwrocListeKsiazekPrzeczytanychPrzezCzytelnika(new Osoba ("Jan", "Kowalski",
                LocalDate.of(1988,03,23))));
        System.out.println(b1.zwrocKsiazkiPrzeczytanePrzezOsobeIloscRazy(new Osoba ("Jan", "Kowalski",
                LocalDate.of(1988,03,23))));
//           System.out.println(ksiazkiPoAutorze.poll());
//        }
//       b2.unikalneTytuly();
//       System.out.println(b2.unikalneTytuly());

//        Set<Ksiazka> ksiazkiWB1 = b1.znajdzKsiazkePoFragmencieTytulu("a");
//        System.out.println(ksiazkiWB1);
//
//        Set<Ksiazka> ksiazkiWB2 = b2.znajdzKsiazkePoFragmencieTytulu("Dem");
//        System.out.println(ksiazkiWB2);
    }

    private static void dodajKsiazkiDoBibliotek(Biblioteka b1, Biblioteka b2) {

        Ksiazka javaPodstawy = Narzedzia.utworzKsiazke("Ray", "Horstmann", 45,
                "Java Podstawy.Wydanie X", "1111111111", 989,
                Kategoria.IT);//kategroria tak jakbysmy sie odwolywali do statycznych obiekpotw

        b1.dodajKsiazke(javaPodstawy);

        Ksiazka javaTechnikiZaawansowane=Narzedzia.utworzKsiazke("Cay", "Horstmann", 45,
                "Java Techniki Zaawansowane", "2222222222", 989, Kategoria.IT);
        b1.dodajKsiazke(javaTechnikiZaawansowane);


        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 214, "Pan Tadeusz",
                "2222233333", 300, Kategoria.EPOPEJA));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Dan", "Brown", 55, "Inferno",
                "1111155555", 500, Kategoria.SCI_FI));
        b2.dodajKsiazke(javaPodstawy);
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Cay", "Horstmann", 45,
                "Java Techniki Zaawansowane", "2222222222", 944, Kategoria.IT));


        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Hanya", "Yanagihara", 40, "Małe Życie",
                "33333333333", 850, Kategoria.DRAMAT));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Ken", "Kesey", 70, "Lot Nad Kukułczym Gniazdem",
                "444444444444", 350, Kategoria.DRAMAT));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("J.K.", "Rowling", 50, "Harry Potter",
                "5555555555", 400, Kategoria.BAJKA));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Herman", "Hesse", 100, "Demian",
                "6666666666", 256, Kategoria.DRAMAT));

    }


}
