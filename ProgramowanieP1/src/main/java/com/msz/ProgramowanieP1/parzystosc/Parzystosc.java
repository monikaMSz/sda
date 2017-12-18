package com.msz.ProgramowanieP1.parzystosc;

import java.util.Scanner;

/**
 * Klasa sprawdzająca czy liczba jest parzysta
 */

public class Parzystosc {//ctrl + q wysiwetli dokumentacje metody

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        String liczbaUzytkownika = scanner.nextLine();
        try {
            Integer liczba = Integer.parseInt(liczbaUzytkownika);
            if (liczba % 2 == 0) {
                System.out.println("Podałeś liczę parzystą");
            } else {
                System.out.println("Podałeś liczbę nieparzystą");
            }
        }catch(NumberFormatException e){//e to nazwa zmiennej bo wyjatki to klasa
            System.out.println("Podałeś ciąg znaków niebędących liczbą");
        }

    }
}


