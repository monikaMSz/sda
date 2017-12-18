package com.msz.ProgramowanieP1.listy;

import java.util.ArrayList;
import java.util.List;

public class listyZad1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        dodawanieElementowdoListy(list);
        wyswietlListe(list);
        zwiekszOWartoscPoprzednika(list);
        wyswietlListe(list);
        dzielenieLiczbyParzystej(list);
        wyswietlListe(list);
        MinMaxSumList wyniki = zwrocMinMaxISumeElementowListy(list);//zmianna klasy, ktorej wynikiem jest moteda
        System.out.println(String.format("Suma elementów listy: %d. Minimum: %d. Maksimum: %d",
                wyniki.getSuma(),wyniki.getMin(),wyniki.getMax()));

    }

    private static void wyswietlListe(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n====================");
    }


    private static List<Integer> dodawanieElementowdoListy(List<Integer> list) {


        for (int i = 1; i <= 10; i++) {//i=0/w parametrze int ile elementow i+1
            int liczba = i;
            list.add(liczba);

        }
        return list;
    }

    private static List<Integer> zwiekszOWartoscPoprzednika(List<Integer> list) {

        for (int i = 2; i < list.size(); i += 3) {
            int liczba1 = list.get(i);
            int liczba2 = list.get(i - 1);
            list.set(i, liczba1 + liczba2);
        }
        return list;
    }
    private static List<Integer> dzielenieLiczbyParzystej(List<Integer>list){
        for(int i=0;i< list.size();i++){
            if(list.get(i) % 2 == 0){
                list.set(i,list.get(i)/2);
            }
        }return list;
    }
    private static MinMaxSumList zwrocMinMaxISumeElementowListy(List<Integer>list) {//
        int sum=list.get(0);
        int min = list.get(0);//ustawianmy jako pierwszy el na naszej liscie
        int max = list.get(0);
        for(int i =1; i<list.size();i++){
            int liczba=list.get(i); //aktualkne miejsce liczby
            sum+=liczba;//sumowanie elementy
            if(liczba<min){
                min=liczba;
            }
            if(liczba>max){
                max=liczba;
            }
        }
        return new MinMaxSumList(sum,max,min);
    }
}
