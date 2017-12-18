package com.msz.ProgramowanieP1.sortowanie.sortowanieprzezwstawianie;

import com.msz.ProgramowanieP1.biblioteka.Porzadek;
import com.msz.ProgramowanieP1.sortowanie.Sortowanie;

import java.util.ArrayList;
import java.util.List;

public class SortowaniePrzezWstawianie implements Sortowanie {

    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        List<Integer> wynik = new ArrayList<>();
        for( int i=0;i<tablicaElementow.length;i++){//iteracja bierze kazdy element listy
            if(wynik.isEmpty()){//spr czy tablica jest pusta, pojawi sie tylko raz na poczatku poki jest pusta pozniej juz ten warunek nie bedzie spelniony
                wynik.add(tablicaElementow[i]);
                continue;
            }
            boolean czyDodano = false;
            for(int j=0; j<wynik.size();j++){
                if(tablicaElementow[i]<wynik.get(j)){//sprawdzamy czy i jest wieksze od j(czyli indeks listy)
                    wynik.add(j,tablicaElementow[i]);
                    czyDodano=true;
                    break;
                }
            }
            if(!czyDodano){
                wynik.add(tablicaElementow[i]);
            }
        }
        for(int i=0;i<wynik.size();i++){
            tablicaElementow[i]=wynik.get(i);
        }
        return tablicaElementow;
    }
}
