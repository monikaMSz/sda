package com.msz.ProgramowanieP1.sortowanie.sortowanieprzezzliczanienazajeciach;

import com.msz.ProgramowanieP1.biblioteka.Porzadek;
import com.msz.ProgramowanieP1.sortowanie.Sortowanie;

import java.util.ArrayList;
import java.util.List;

public class SortowaniePrzezZliczanieNaZajeciach implements Sortowanie{
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        int max=0;
        for(int i=0;i<tablicaElementow.length;i++){//szukanie wartosci maksymalnej
            if(tablicaElementow[i]>max){
                max=tablicaElementow[i];
            }
        }
        int[] zliczanieElementow = new int[max+1];//na podstawie maksa tworzymy nowa tablice ok wielkosci max+1
        for(int i=0;i<tablicaElementow.length;i++){
            int liczba=tablicaElementow[i];
            zliczanieElementow[liczba] += 1;
        }
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<zliczanieElementow.length;i++){
            for(int j=0;j<zliczanieElementow[i];j++){//wartosc ile ta liczba wystapila elementow zaliczanieElementow[i]
           list.add(i);//dodaj wartosc indeksu i
            }

        }
        for (int i=0;i<list.size();i++){
            tablicaElementow[i] = list.get(i);
        }
        return tablicaElementow;
    }
}//dla liczb ujemnych
