package com.msz.ProgramowanieP1.parzystosc;

import java.util.Scanner;

public class Wielokrotnosc {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        String liczbaUzytkownika = skaner.nextLine();
        try {
            Integer liczba = Integer.parseInt(liczbaUzytkownika);//mozna zrobic dwie zmienne liczbaY i liczbaX

            System.out.println("Podaj drugą liczbę:/Podaj wielokrotność liczby która chcesz uzyskać");
            liczbaUzytkownika = skaner.nextLine();//mozna stworzyc druga zmienna string liczbaY ale mozna korzystac z tej
            Integer liczba2 = Integer.parseInt(liczbaUzytkownika);//wielokrotnosc

            if (liczba2 >= 0) {
                int wynik= liczba * liczba2;
                System.out.println(wynik);
            } else {
                System.out.println("nie ma takiej wielokrotności");
            }
        } catch (NumberFormatException e) {
            System.out.println( "Podałeś ciąg znaków niebędących liczbą");

        }
    }
}
