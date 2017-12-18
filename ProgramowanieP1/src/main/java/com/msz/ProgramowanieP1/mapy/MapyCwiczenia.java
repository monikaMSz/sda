package com.msz.ProgramowanieP1.mapy;

import com.msz.ProgramowanieP1.biblioteka.Kategoria;
import com.msz.ProgramowanieP1.biblioteka.Ksiazka;
import com.msz.ProgramowanieP1.dodatkowe.Narzedzia;

import java.util.HashMap;
import java.util.Map;

public class MapyCwiczenia {
    public static void main(String[] args) {
        Map<String, Ksiazka> mapa = new HashMap<>();
        Ksiazka ksiazka1= Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 300, "Pan Tadeusz",
                "1234567890", 400, Kategoria.EPOPEJA);
        Ksiazka ksiazka2= Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 300, "Dziady",
                "234565767891", 400, Kategoria.EPOPEJA);
        mapa.put("1", ksiazka1);
        mapa.put("2", ksiazka2);
      Ksiazka poprzednia = mapa.put("1", ksiazka2);
      Ksiazka poprzedniaPod3 = mapa.put("3", ksiazka1);

      Ksiazka ksiazkaPod1=mapa.get("1");
        System.out.println(ksiazkaPod1);

//        mapa.remove("1");
        ksiazkaPod1 = mapa.get("1");
        System.out.println(ksiazkaPod1);

//        System.out.println(mapa);
//        System.out.println(poprzedniaPod3);
//sprawdzenie, czy taki element jest na nmapie
        System.out.println("Mapa zawiera klucz2: " + mapa.containsKey("2"));
        System.out.println("Mapa zawiera klucz1: " + mapa.containsKey("1"));

        System.out.println("Klucze:");
        for (String key: mapa.keySet()){
            System.out.println(key);
            //keyset zwraca nam zbior wszytskich kluczy jakie sa w mapie, mozna je iterowac, wysiewtlac wszytskie wartosci,posortowac w osobnym miejscu
        }
        //wysietlanie wartosci
        System.out.println("Wartości: ");
        for (Ksiazka ksiazka : mapa.values()){
            System.out.println(ksiazka);
        }
        //dostep do jednej pary w mapie, w ramach jednej iteracji petli,jedna entry
        for(Map.Entry<String, Ksiazka> entry: mapa.entrySet()){
            System.out.println("Klucz: " + entry.getKey());
            System.out.println("Wartości: " +entry.getValue());
        }
    }
}
