package com.msz.ProgramowanieP1.sortowanie;

import com.msz.ProgramowanieP1.biblioteka.Porzadek;

public interface Sortowanie {
    int[] sortuj(int[] tablicaElementow, Porzadek porzadek);
    //rozne algorytnmy sortowanie, dlatego tworzymy interface, algorytmy beda implementowaly ten interfejs
}
