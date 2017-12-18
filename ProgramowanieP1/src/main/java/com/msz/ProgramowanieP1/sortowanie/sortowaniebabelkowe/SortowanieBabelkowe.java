package com.msz.ProgramowanieP1.sortowanie.sortowaniebabelkowe;

import com.msz.ProgramowanieP1.biblioteka.Porzadek;
import com.msz.ProgramowanieP1.sortowanie.Sortowanie;
import com.msz.ProgramowanieP1.sortowanie.SortowanieUI;

public class SortowanieBabelkowe implements Sortowanie {
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        //sprawdzanie ile operacji musi być wykonanych
        int iloscOperacji = 0;
        for (int i = 0; i < tablicaElementow.length; i++) {
            System.out.println("Biorę i-ty element tablicy: "+i+" -jest to liczba: "+tablicaElementow[i]);
            for (int j = i+1; j < tablicaElementow.length; j++) {//jezeli j=i+1 to w case trzeba zamienic j z i
                System.out.println("Biorę j-ty element tablicy: "+j+" -jest to liczba: "+tablicaElementow[j]);
                iloscOperacji++;//imploementujemy kazde wejscie do petli ,ilosc wejsc do petli
                if (i != j) {//nie chcemy porównywać tego samego elementu
                    switch (porzadek) {
                        case ROSNACO:
                            System.out.println(String.format("Porównuję, czy liczba %d < %d", tablicaElementow[j],tablicaElementow[i]));
                            //czy element o indeksie 0 jest mniejszy od elementu o indeksie 1
                            if (tablicaElementow[j] < tablicaElementow[i]) {
                                System.out.println("Zamieniam miejscami liczby");
                                System.out.println(String.format("Indeksy i i j wskazują na liczby: %d, %d", tablicaElementow[i],tablicaElementow[j]));
                                //jesli jest zamień miejscami wartości w tablicy
                                int tmp = tablicaElementow[i];
                                tablicaElementow[i] = tablicaElementow[j];
                                tablicaElementow[j] = tmp;
                                System.out.println(String.format("Indeksy i i j wskazują na liczby: %d, %d", tablicaElementow[i],tablicaElementow[j]));
                            }
                            break;
                        case MALEJACO:
                            //czy element o indeksie 0 jest wiekszy od elementu o indeksie 1
                            if (tablicaElementow[j] > tablicaElementow[i]) {
                                //jesli jest zamień miejscami wartości w tablicy
                                int tmp = tablicaElementow[i];
                                tablicaElementow[i] = tablicaElementow[j];
                                tablicaElementow[j] = tmp;
                            }
                            break;
                    }

                }
            }
            SortowanieUI.wyswietlTablice(tablicaElementow);

        }
        System.out.println("Ilość operacji: " + iloscOperacji);
        return tablicaElementow;
    }
}
