package com.msz.ProgramowanieP1.streamy;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamyCwiczenia {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lista.add(i + 1);
        }
        Random random = new Random();
        //Wszytskie liczby podzielne przez 2
        List<Integer> podzielnePrzez2 = lista.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }).collect(Collectors.toList());

        List<Integer> podzielnePrzez2PlusLambda = lista.stream().filter(liczba -> liczba % 2 == 0).collect(Collectors.toList());
        List<Integer> podzielnePrzez3IWiekszeOd20PlusLambda = lista.stream().filter(liczba -> liczba % 3 == 0 && liczba > 20).collect(Collectors.toList());
        //wszystkie liczby z przedziału od 0 do 50, podzielne przez 2, ale powyzej 50 beda podzielne przez 3

        List<Integer> wyniki1 = lista.stream().filter(liczba -> {
            if (liczba < 51) {
                return liczba % 2 == 0;
            } else {
                return liczba % 3 == 0;
            }
        }).collect(Collectors.toList());

        //zwraca liczby podzielne przez 2 i3, ale tylko z przedzialu 20-40,od 0-20 przez 3 i7, a jesli wieksze niz 40 to maja byc podzielne przez 4 i6

        List<Integer> wyniki2 = lista.stream().filter(liczba -> {
            if (liczba < 20) {
                return liczba % 3 == 0 && liczba % 7 == 0;
            } else if (liczba > 20 && liczba < 40) {
                return liczba % 2 == 0 && liczba % 3 == 0;
            } else if (liczba > 40 && liczba < 100) {
                return liczba % 4 == 0 && liczba % 6 == 0;
            } else {
                return false;
            }
        }).collect(Collectors.toList());
        //dla liczb od 1 do 100 chcemy zwiekszyc 3 razy
        List<Integer> wieksze3Razy = lista.stream().map(liczba -> liczba * 3).collect(Collectors.toList());

        //<0-20> *3 +2; od <21-40>*5-50;<41-100> ^2
        List<Integer> dzialania = lista.stream().map(liczba -> {
            if (liczba < 20) {
                return liczba * 3 + 2;
            } else if (liczba >= 21 && liczba < 40) {
                return liczba * 5 - 50;
            } else if (liczba >= 41 && liczba <= 100) {
                return liczba * liczba;
            } else {
                return liczba;
            }


        }).collect(Collectors.toList());

        //zamieni pierwotna liste ktora ma te warunki i sfiltrowala do wartosci ktore sa wielokrotnoscia 4.
        List<Integer> dzialania2 = lista.stream().map(liczba -> {
            if (liczba < 20) {
                return liczba * 3 + 2;
            } else if (liczba >= 21 && liczba < 40) {
                return liczba * 5 - 50;
            } else if (liczba >= 41 && liczba <= 100) {
                return liczba * liczba;
            } else {
                return liczba;
            }


        }).filter(liczba -> liczba % 4 == 0).collect(Collectors.toList());
        //1 zadanie
        Integer max = lista.stream()
                .mapToInt(liczba -> liczba * random.nextInt(100)).max().getAsInt();
        System.out.println(max);
        OptionalInt max2 = lista.stream().mapToInt(liczba -> liczba)
                .filter(liczba -> liczba > 1000)
                .max();
        if (max2.isPresent()) {
            System.out.println(max2.getAsInt());
        } else {
            System.out.println("Zbiór jest pusty");
        }
        System.out.println(max2);
        //2 zadanie
        Double srednia = lista.stream()
                .mapToInt(liczba -> liczba*random.nextInt()).average().getAsDouble();
        System.out.println(srednia);

        //3 zadanie
      Optional<Integer> pierwszaPodzielnaPrzez2 = lista.stream()
              .map(liczba-> liczba*random.nextInt(100))
              .filter(liczba -> liczba%2==0)
              .findFirst();//sprawdza ten wynik juz po pierwszym filtrze,
      if(pierwszaPodzielnaPrzez2.isPresent()){//jezeli wynik jest zapisany w obiekcie metoda present zwroci true, a jezlei mam to mozesz sobie wziac przez metoda get()
          System.out.println(pierwszaPodzielnaPrzez2.get());
      }else{
          System.out.println("Nie znaleziono wyników");
      }

//        System.out.println(podzielnePrzez2);
//        System.out.println("============");
//        System.out.println(podzielnePrzez2PlusLambda);//lambda upraszcza klasy anonimowe
//        System.out.println("============");
//        System.out.println(podzielnePrzez3IWiekszeOd20PlusLambda);
//        System.out.println("============");
//        System.out.println(lista);
//        System.out.println("============");
//        System.out.println(wyniki1);
//        System.out.println("============");
//        System.out.println(wyniki2);
//        System.out.println("============");
//        System.out.println(wieksze3Razy);
//        System.out.println("============");
//        System.out.println(dzialania);
//        System.out.println("============");
        System.out.println(dzialania2);
    }
}


