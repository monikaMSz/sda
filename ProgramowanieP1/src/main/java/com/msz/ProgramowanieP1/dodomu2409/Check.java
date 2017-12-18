package com.msz.ProgramowanieP1.dodomu2409;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Scanner skaner = new Scanner(System.in);

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = skaner.nextInt();

        }
        System.out.println(tablica);

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < 20) ;
            {
                tablica[i] = tablica[i] * 2;
            }


            if (tablica[i] % 5 == 0) ;
            {
                tablica[i] = tablica[i] + 2;

            }

            if (tablica[i] == 50) ;
            {
                tablica[i] = tablica[i] * tablica[i];
            }


            if (tablica[i] > 80) ;
            {
                tablica[i] = tablica[i] - tablica[0];
            }

            System.out.println(tablica[i] + " ");
        }

    }
}

