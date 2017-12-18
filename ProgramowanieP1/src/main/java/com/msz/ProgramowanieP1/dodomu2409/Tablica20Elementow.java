package com.msz.ProgramowanieP1.dodomu2409;

import java.util.Random;

public class Tablica20Elementow {
    public static void main(String[] args) {
        Random generator = new Random();
        //int liczba = 0;

        int[] tablica = new int[20];
        for (int i = 0; i < 20; i++) {
            tablica[i] = generator.nextInt(100);

        }
        wyswietlListe(tablica);
        System.out.println();
        System.out.println("najwiekszy to: " + najwiekszyElement(tablica));
        System.out.println("średnia to :" + sredniaWartosci(tablica));
        zamianaWartosci(tablica);

    }

    public static void wyswietlListe(int[] tablica) {
        for (int i = 0; i < 20; i++) {
            System.out.print(tablica[i] + " ");
        }
    }

    public static int najwiekszyElement(int[] tablica) {
        int najwiekszy = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > najwiekszy) {


                najwiekszy = tablica[i];
            }
        }
        return najwiekszy;

    }

    public static int sredniaWartosci(int[] tablica) {
        int suma = 0;
        int wynik = 0;
        for (int element : tablica) {
            suma += element;
            wynik = suma / tablica.length;
        }
        return wynik;
    }

    public static void zamianaWartosci(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < 20) {
                tablica[i] = tablica[i] * 2;
            }
            if (tablica[i] % 5 == 0) {
                tablica[i] = tablica[i] + 2;
            }
            if (tablica[i] == 50) {
                tablica[i] = tablica[i] * tablica[i];
            }
            if (tablica[i]>80) {
                tablica[i] = tablica[i]-tablica[0];
            }
            System.out.println(tablica[i]+ " ");
        }
    }

}

