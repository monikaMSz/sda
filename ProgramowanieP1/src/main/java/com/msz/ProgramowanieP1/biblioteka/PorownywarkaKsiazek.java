package com.msz.ProgramowanieP1.biblioteka;

import java.util.Comparator;

public class PorownywarkaKsiazek implements Comparator<Ksiazka> {

    private Kryterium kryterium;
    private Porzadek porzadek;
    private Integer rokWydania;

    public PorownywarkaKsiazek(Kryterium kryterium, Porzadek porzadek) {
        this.kryterium = kryterium;
        this.porzadek = porzadek;
        this.rokWydania = rokWydania;
    }
//    private int compare(Ksiazka o1,Ksiazka o2){
//        switch (rokWydania){
//
//        }
//        return 0;
//    }

    public int compare(Ksiazka o1, Ksiazka o2) {
        switch (porzadek) {
            case ROSNACO:
                return compareInternal(o1, o2);
            case MALEJACO:
                return compareInternal(o2, o1);
        }return 0;
    }

    private int compareInternal(Ksiazka o1, Ksiazka o2) {
        switch (kryterium) {
            case AUTOR:
                //if(porzadek.equals(Porzadek.ROSNACO)){
                //return compareAutor(o2,01); i w kazdym casie to samo lub zrobienie tego ifa nad swiitchami

                return compareAutor(o1, o2);
            case TYTUL:
                return o1.getTytul().compareTo(o2.getTytul());
            case KATEGORIA:
                return o1.getKategoria().getCzytelnaNazwa().compareTo(o2.getKategoria().getCzytelnaNazwa());
            case LICZBY_STRON:
                return o1.getLiczbyStron().compareTo(o2.getLiczbyStron());
            case ISBN:
                return o1.getIsbn().compareTo(o2.getIsbn());

        }return 0;
    }



    private int compareAutor(Ksiazka o1, Ksiazka o2) {
        String autor1 = o1.getAutor().toString();
        String autor2 = o2.getAutor().toString();
        return autor1.compareTo(autor2);
    }

}