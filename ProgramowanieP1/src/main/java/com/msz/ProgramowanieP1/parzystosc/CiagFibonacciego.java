package com.msz.ProgramowanieP1.parzystosc;

import java.util.Scanner;

public class CiagFibonacciego {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów ciągu, którą chcesz wyświetlić:");
        String liczbaUzytkownika = skaner.nextLine();
        int ostatnia = 1;
        int przedostatnia = 1;
        try {
            Integer liczba = Integer.parseInt(liczbaUzytkownika);
            if (liczba < 0) {//liczba>=0 sout liczba
                System.out.println("Ciąg F ma tylko el naturalne");
                return;
//fibonacciIteracyjnie(liczba);
                //fibonacciRekurencyjnie(liczba);
            } else {
                System.out.println(liczba);
            }
//if(liczba>=0) {
            //sout (liczba)}else{sout"nie mozna wysiwtlic ciagu"
            for (int i = 0; i <= liczba; i++) {
                //an=an-1+an-2
                if (i == 0 || i == 1) {
                    System.out.println(1);
                } else {
                    int tymczasowa = ostatnia + przedostatnia;
                    przedostatnia = ostatnia;
                    ostatnia = tymczasowa;
                    System.out.println(ostatnia);
                }
            }


        } catch (
                NumberFormatException e)

        {
            System.out.println("Ciąg znaków");

        }


    }//public static void fibonacciIteracyjnie(int liczba){

    //int ostatnia =1;
    //int przedostatnia=1;
    //(int i=0;i<=liczba;i++){
//if(i<2>{
//sout(String.format( "%d element ciagu jest rowny %d", i, 1));
//}else{
    //  int wynik = ostatnia + przedostatnia;
    // przedostatnia=ostatnia;
    // ostatnia=wynik;
    //  sout(String.format(%d element ciagu jest rowny %d, i, wynik));
    //       }
  //  public static int fibonacciRekurencyjnie(int liczba) {
        //rekurencja musi miec dobry warunek stopu/wyjscia z petli.warunkiem stopu
    //    if (liczba == 0 || liczba == 1) {
      //      System.out.println((String.format("%d element ciągu jest równy %d", liczba, 1)));
        //    return 1;
        //}
        //int wynik = fibonacciRekurencyjnie(liczba - 1) + fibonacciRekurencyjnie((liczba - 2));
        //System.out.println(String.format("%d element ciągu jest równy %d", liczba, 1));wynik w sout

    //}
}




