package com.msz.ProgramowanieP1.prdom7810;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filmy {
    public static void main(String[] args) {
        List<String> tytuly = new ArrayList<>();


        String tytul1 = new String("Król Lew");
        String tytul2 = new String("Blade Runner");
        String tytul3 = new String("Harry Potter i Komnata Tajemnic");
        String tytul4 = new String("Władca Pierścieni: Dwie Wieże");
        String tytul5 = new String("Solaris");
        String tytul6 = new String("Strong Woman Do Bongsun");
        String tytul7 = new String("City Hunter");
        String tytul8 = new String("Gwiezdne Wojny: Powrót Jedi");
        String tytul9 = new String("The Guardians");
        String tytul10 = new String("Straznicy Galaktyki");
        String tytul11 = new String("Zielona Mila");
        String tytul12 = new String("Wyznania Gejszy");
        String tytul13 = new String("Dom Latających Sztyletów");
        String tytul14 = new String("To");
        String tytul15 = new String("Ghost in the Shell");
        String tytul16 = new String("Mroczna wieża");
        String tytul17 = new String("Praci z Karaibów: Zemsta Salazara");
        String tytul18 = new String("Bodyguard Zawodowiec");
        String tytul19 = new String("Piękna i Bestia");
        String tytul20 = new String("Dunkierka");

        tytuly.add(tytul1);
        tytuly.add(tytul2);
        tytuly.add(tytul3);
        tytuly.add(tytul4);
        tytuly.add(tytul5);
        tytuly.add(tytul6);
        tytuly.add(tytul7);
        tytuly.add(tytul8);
        tytuly.add(tytul9);
        tytuly.add(tytul10);
        tytuly.add(tytul11);
        tytuly.add(tytul12);
        tytuly.add(tytul13);
        tytuly.add(tytul14);
        tytuly.add(tytul15);
        tytuly.add(tytul16);
        tytuly.add(tytul17);
        tytuly.add(tytul18);
        tytuly.add(tytul19);
        tytuly.add(tytul20);

//        System.out.print(tytuly);


//        wyswietlListe(tytuly);


        //lista tytulów na A(B)
        List<String> tyulyNaA = tytuly.stream().filter(tytul -> tytul.charAt(0)=='B').collect(Collectors.toList());
//        System.out.println(tyulyNaA);

        //tytuły składające się z dwóch wyrazów
        List<String>dwaWyrazy = tytuly.stream().filter(tytul->tytul.split(" ").length==2).collect(Collectors.toList());

//        System.out.println(dwaWyrazy);

        //tytuł o najdłuższej nazwie



        //lista tytulow, które maja więcej niż 5 znaków

        List<String>wiecejNiz5Znakow = tytuly.stream().filter(tytul-> tytul.length()>=5).collect(Collectors.toList());
//        System.out.println(wiecejNiz5Znakow);

        //ile tytułów składa się z 1 wyrazu,2,3 i wiecej
        Long iloscTytulowDwuWyrazowych = tytuly.stream().filter(tytul-> tytul.split(" ").length==2).count();
        System.out.println(iloscTytulowDwuWyrazowych);

        Long iloscTytulowTrzyWyrazowych = tytuly.stream().filter(tytul-> tytul.split(" ").length==3).count();
        System.out.println(iloscTytulowTrzyWyrazowych);


        Long iloscTytulowPiecioWyrazowych = tytuly.stream().filter(tytul-> tytul.split(" ").length==5).count();
        System.out.println(iloscTytulowPiecioWyrazowych);
//    public static void wyswietlListe(List<String> tytuly) {
//        for (int i = 0; i < tytuly.size(); i++) {
//            System.out.println(tytuly);
//
//        }
    }
}
