package com.msz.ProgramowanieP1.pesel;

import java.util.Scanner;

public class PeselUi {
    //ilosc -11znakow
    //yyMMddxxxxx (rok,miesiac,dzien,przedostatnia plec,ostatnia suma kontrolna
    //weryfikacja daty urodzenia i dla osob po 2000 do miesiaca musimy dodac 20
    //dzien w miesiacu czyli nie ma 30 dni w lutym
    //nieparzysta liczba to mezczyzna,parzysta -kobieta
    //suma kontrolna


    public static void main(String[] args) {//przynajmniej jedna metoda musi obslugiwac wyjatek przez try/catch
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj PESEL do weryfikacji: ");
        String pesel =skaner.nextLine();
        //Miejsce na wywołanie metdy weryfikującej
        try {
            boolean poprawny = PeselWeryfikator.czyPoprawny(pesel);
            if(poprawny) {
                System.out.println("Podany PESEL jest prawidłowy");//w deklaracji metody mamy, że może zwrócić wyjątek wywołujemy try.catch
            }else{
                System.out.println("POdany PESEL jest błędny");
            }
        } catch (Exception e) {
            System.out.println("Podany PESEL jest błędny.Przyczyma błędu: " + e.getMessage());

        }


    }
}
