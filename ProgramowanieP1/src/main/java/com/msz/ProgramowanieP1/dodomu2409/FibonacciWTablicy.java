package com.msz.ProgramowanieP1.dodomu2409;

import java.util.Scanner;

public class FibonacciWTablicy {
    public static void main(String[] args) {

        int liczbaElementowFib = 0;
        Scanner skaner = new Scanner(System.in);


        System.out.println("Podaj liczbę");
        String liczbaUzytkownika = skaner.nextLine();

        try {
            Integer liczba = Integer.parseInt(liczbaUzytkownika);
            if (liczba < 0) {
                System.out.println("Ciąg Fibonacciego zawiera tylko elementy naturalne");
                return;
            }
            fibonacciIteracyjnie(liczba);
            //int wynik = fibonacciRekurencyjnie(liczba);
           // System.out.println("Ostatni element ciągu to " + wynik);
        } catch (NumberFormatException e) {
            System.out.println("Wprowadzono niepoprawne dane");
        }
    }

    public static void fibonacciIteracyjnie(int liczbaElementow) {
        int[] tablicaFibonacci = new int[liczbaElementow];

        tablicaFibonacci[0] = 1;
        tablicaFibonacci[1] = 1;
        for(int i=2;i<liczbaElementow;i++){
            tablicaFibonacci[i]=tablicaFibonacci[i-1]+tablicaFibonacci[i-2];
        }
        for (int i = 0; i < liczbaElementow; i++) {
            if (i < 2) {
                System.out.println(String.format("%d element ciągu jest równy %d",i, 1));
            } else {
               // int wynik = ostatnia + przedostatnia;
               // przedostatnia = ostatnia;
               // ostatnia = wynik;
                System.out.println(i + "liczba = "+ tablicaFibonacci[i]);
            }
        }
    }

    public static int fibonacciRekurencyjnie(int liczbaElementow) {
        if (liczbaElementow == 0 || liczbaElementow == 1) {
            return 1;
        }
        int wynik = fibonacciRekurencyjnie(liczbaElementow - 1) + fibonacciRekurencyjnie(liczbaElementow - 2);
        return wynik;
    }
    //public static int wyswietlTabliceFib(int[]tablicaFib){
    //    for(int i=0;i<tablicaFib.length;i++){
    // tablicaFib[i]=[i]+
    //}
    // }

}
