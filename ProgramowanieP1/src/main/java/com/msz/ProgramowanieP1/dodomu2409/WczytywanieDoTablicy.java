package com.msz.ProgramowanieP1.dodomu2409;

import java.util.Scanner;

public class WczytywanieDoTablicy {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        int wielkosc = 5;
        int[] tablicaWartosci = new int[wielkosc];
        System.out.println("Podaj liczbę:");

        try {
            String number = skaner.nextLine();
            Integer liczba = Integer.parseInt(number);
            for (int i = 1; i < tablicaWartosci.length; i++)
                number = skaner.nextLine();

                for(int item:tablicaWartosci)
                    System.out.println(item);


        } catch (NumberFormatException e) {
            System.out.println("Podałeś ciąg znaków niebędących liczbą");

            //System.out.println("Podaj kolejna liczbe: ");
            //number=skaner.nextLine();

        }
        System.out.println(tablicaWartosci);
    }
}