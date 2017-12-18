package com.msz.ProgramowanieP1.sortowanie;

import java.util.ArrayList;
import java.util.List;

public class SortowaniePrzezZliczanie {
    public static void main(String[] args) {


        int[] tablica1 = new int[]{5, 3, 8, 1, 1, 3, 8, 6, 4, 5};
        int[] zliczenia = new int[10];
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < tablica1.length; i++) {

            zliczenia[tablica1[i]] += 1;




        }SortowanieUI.wyswietlTablice(zliczenia);
        for (int i = 1; i < zliczenia.length; i++)
            if (zliczenia[i] > 0) {
            for(int j=1;j<zliczenia[i];j++)
                lista.add(i);


            }
        System.out.println(lista);
    }
}