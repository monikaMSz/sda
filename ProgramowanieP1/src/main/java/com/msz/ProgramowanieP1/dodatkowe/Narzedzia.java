package com.msz.ProgramowanieP1.dodatkowe;

import com.msz.ProgramowanieP1.biblioteka.Autor;
import com.msz.ProgramowanieP1.biblioteka.Kategoria;
import com.msz.ProgramowanieP1.biblioteka.Ksiazka;

public class Narzedzia {
    public static Ksiazka utworzKsiazke(String imie, String nazwisko, Integer wiek, String tytul,
                                        String isbn, Integer liczbyStron, Kategoria kategoria){


        Autor autor = new Autor(imie,nazwisko,wiek);
        Ksiazka ksiazka = new Ksiazka(tytul,liczbyStron,isbn, autor,kategoria);
        return ksiazka;
    }

}
