import java.util.*;

class Solution {
    public static void main(String[] argh) {
        String[] names = {"uncle sam", "tom", "harry"};
        int[] numbers = {99912222, 11122222, 12299933};
        Map<String, Integer> mapa = new HashMap<>(); //tworzenie mapy

        for (int i = 0; i < names.length; i++) {//for zwykłe bo dwie tablice
            mapa.put(names[i], numbers[i]);

        }


        String[] query = {"uncle sam", "uncle tom", "harry"};
        // sprawd� czy w mapie wyst�puj� powy�sze warto�ci,
        // je�li tak wypisz nazw� oraz numer np. tom = 11122222
        // je�li nie - wy�wietl "nie znaleziono"
        for(String item : query){//for each bo jest tylko jedna tablica
            if(mapa.containsKey(item)){
                System.out.println(item + " = " + mapa.get(item));//get zwraca wartosc/oniekit przypisany do key
            }else{
                System.out.println("nie znaleziono");
            }

        }
    }
}