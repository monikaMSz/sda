package com.msz.ProgramowanieP1.sortowanie.sortowanieprzezwybor;

import com.msz.ProgramowanieP1.biblioteka.Porzadek;
import com.msz.ProgramowanieP1.sortowanie.Sortowanie;

public class SortowaniePrzezWybor implements Sortowanie {
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        for (int i = 0; i < tablicaElementow.length; i++) {
            int min = tablicaElementow[i];
            int indexMinimum = i;
            for (int j = i + 1; j < tablicaElementow.length; j++) {
                if (tablicaElementow[j] < min) {
                    min = tablicaElementow[j];
                    indexMinimum = j;
                }
            }
            //Zamieniamy miejscami minimum i pierwszą liczbę w tablicy
            //od której zaczęła się iteracja
            tablicaElementow[indexMinimum] = tablicaElementow[i];
            tablicaElementow[i] = min;
        }
        return tablicaElementow;
    }
}//do domu porzadek malejacyu <>
