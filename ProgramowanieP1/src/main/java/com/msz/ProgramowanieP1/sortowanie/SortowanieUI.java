package com.msz.ProgramowanieP1.sortowanie;

import com.msz.ProgramowanieP1.biblioteka.Porzadek;
import com.msz.ProgramowanieP1.sortowanie.sortowaniebabelkowe.SortowanieBabelkowe;
import com.msz.ProgramowanieP1.sortowanie.sortowanieprzezwstawianie.SortowaniePrzezWstawianie;
import com.msz.ProgramowanieP1.sortowanie.sortowanieprzezwybor.SortowaniePrzezWybor;
import com.msz.ProgramowanieP1.sortowanie.sortowanieprzezzliczanienazajeciach.SortowaniePrzezZliczanieNaZajeciach;
import com.msz.ProgramowanieP1.sortowanie.sortowanieszybkie.SortowanieSzybkie;

public class SortowanieUI {
    public static void main(String[] args) {
        int[] tablica = new int[]{2, 8, 5, 9, 6, 8};

        Sortowanie[] sortowanie = new Sortowanie[5];
        sortowanie[0] = new SortowanieBabelkowe();
        sortowanie[1] = new SortowaniePrzezWstawianie();
        sortowanie[2] = new SortowaniePrzezZliczanieNaZajeciach();
        sortowanie[3] = new SortowaniePrzezWybor();
        sortowanie[4] = new SortowanieSzybkie();

//        wyswietlTablice(tablica);
//        Sortowanie sortowanie = new SortowanieBabelkowe();
//        Sortowanie sortowanie=new SortowaniePrzezWybor();
//        Sortowanie sortowanie = new SortowaniePrzezZliczanieNaZajeciach();
//        Sortowanie sortowanie = new SortowaniePrzezWstawianie();
//        Sortowanie sortowanie = new SortowanieSzybkie();
//        tablica = sortowanie.sortuj(tablica, Porzadek.ROSNACO);
//        wyswietlTablice(tablica);
    }
//    private static int [] kopiaTablicy(int[] tablica){
//
//    }

    public static void wyswietlTablice(int[] tablica) {//z private na public znaczy jest widoczna w innych klasach. jakby nie bytła statyczna trzeba byłoby utworzyć nowy obiekt
        for (int elem : tablica) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
