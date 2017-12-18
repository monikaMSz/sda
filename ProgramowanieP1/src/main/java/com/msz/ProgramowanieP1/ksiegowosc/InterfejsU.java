package com.msz.ProgramowanieP1.ksiegowosc;

import com.msz.ProgramowanieP1.osoba.Plec;

import java.util.*;
import java.util.stream.Collectors;

public class InterfejsU {
    public static void main(String[] args) {
        String sciezkaDoPliku = "C:/Users/RENT/Downloads/bazaZarobki.csv";
        List<Map<String, Object>> wierszePliku = NarzedziaCsv.wczytajCsvZPliku(sciezkaDoPliku);
//        System.out.println(wierszePliku.get(0));
        List<Persona> osoby = NarzedziaCsv.zamienMapeNaPersone(wierszePliku);

        //pobieranie osob, wszystkie osoby o imieniu Adam filter(po lewej nazwa zmiennej->waqrunek
        List<Persona> adamowie = osoby.stream().filter(persona -> persona.getImie().equals("Dariusz"))
                .collect(Collectors.toList());

        Human person = new Human();
       person.osobyOImieniuDariusz(osoby);

//       System.out.println();
//        wyswietlListe();
//        System.out.println(adamowie.size());

        //zwrócić nazwiska z listy
        List<String> nazwiska = osoby.stream().map(persona -> persona.getNazwisko()).collect(Collectors.toList());
//        System.out.println(nazwiska);

        //lista unikalnych nazwisk
        Set<String> nazwiskaUnikalne = osoby.stream().map(persona -> persona.getNazwisko()).collect(Collectors.toSet());
//        System.out.println(nazwiskaUnikalne);

        //osoby starsze niz 35 lat i nazwiska zaczynajace sie na litere S
        List<Persona> starszeNiz35INazwiskoNaS = osoby.stream().filter(persona -> persona.getWiek() >= 35 && persona.getNazwisko().charAt(0) == 'S')
                .collect(Collectors.toList());
//        wyswietlListe(starszeNiz35INazwiskoNaS);


        //osoby w wieku produkcyjnym
        List<Persona> wiekProdukcyjny = osoby.stream().filter(persona -> {
            if (persona.getPlec().equals(Plec.KOBIETA)) {
                return persona.getWiek() >= 18 && persona.getWiek() < 59;
            } else {
                return persona.getWiek() >= 18 && persona.getWiek() < 64;
            }
        }).collect(Collectors.toList());
//        wyswietlListe(wiekProdukcyjny);


        //osoby mieszkajace w Gdansku lub w Warszawie
        List<Persona> osobyZGdanskaLubWarszawy = osoby.stream().filter(persona -> persona.getMiasto().equals("Gdańsk") ||
                persona.getMiasto().equals("Warszawa")).collect(Collectors.toList());
//        wyswietlListe(osobyZGdanskaLubWarszawy);


        //osoby urodzone w maju
        List<Persona> osobyUrodzoneWMaju = osoby.stream().filter(persona -> persona.getDataUrodzenia()
                .getMonthValue() == 05).collect(Collectors.toList());
//        wyswietlListe(osobyUrodzoneWMaju);

        //osoby których kod pocztowy zaczyna się od cyfry 9
        List<Persona> kodPocztowyZaczynajacySieOd9 = osoby.stream().filter(persona -> persona.getKodPocztowy().substring(0, 1)
                .equals("9")).collect(Collectors.toList());
//              wyswietlListe(kodPocztowyZaczynajacySieOd9);


        //lista unikalnych zawodow
        Set<String> unikalneZawody = osoby.stream().map(persona -> persona.getZawod()).collect(Collectors.toSet());
//        System.out.println(unikalneZawody);

        //Wyświetl pierwsze 20 osób z najwyższymi dochodami; metoda sorted przekazujemy obiekty
        List<Persona> pierwsze20OsobZNajwyzszymiZarobkami = osoby.stream().sorted((o1, o2) -> o2.getZarobki().compareTo(o1.getZarobki()))
                .limit(20).collect(Collectors.toList());
//        wyswietlListe(pierwsze20OsobZNajwyzszymiZarobkami);
//        System.out.println("====================");
        //Innym sposobem wyświetlanie 20 osób z najwyzszymi dochodami

        List<Persona> copy = new ArrayList<>(osoby);
        Collections.sort(copy, new Comparator<Persona>() {//kazde wywolanie klasy anonimowej ktora ma jedna metode moze byc zamienione na lambda
            @Override
            public int compare(Persona o1, Persona o2) {
                return o2.getZarobki().compareTo(o1.getZarobki());
            }
        });
        List<Persona> pierwsze20OsobZZarobkamiPoInnemu = copy.subList(0, 20);
//        wyswietlListe(pierwsze20OsobZZarobkamiPoInnemu);

        //Wyświetlić listę osób, których nazwisko zaczyna się na literę C
        List<Persona> nazwiskoNaC = osoby.stream().filter(persona -> persona.getNazwisko().charAt(0) == 'C')
                .collect(Collectors.toList());
//       wyswietlListe(nazwiskoNaC);

        //Wyświetlić średnią zarobków dla osób w przedziale 21-30
        Double sredniaZarobkow = osoby.stream().filter(persona -> persona.getWiek() > 21 && persona.getWiek() < 30).
                mapToInt(persona -> persona.getZarobki()).average().getAsDouble();
//        System.out.println(sredniaZarobkow);

        //Wyświetlić ilość kobiet i mężczyzn w zestawieniu
        Long ilośćKobiet = osoby.stream().filter(persona -> persona.getPlec().equals(Plec.KOBIETA)).count();
        System.out.println(ilośćKobiet);

        Long iloscMezczyzn = osoby.stream().filter(persona -> persona.getPlec().equals(Plec.MEZCZYZNA)).count();
        System.out.println(iloscMezczyzn);
        int[] wynik = osoby.stream().map(persona -> {
            if (persona.getPlec().equals(Plec.KOBIETA)) {
                return new int[]{1, 0};
            } else {
                return new int[]{0, 1};
            }
        }).reduce(new int[2], (a, b) -> {
            a[0] = a[0] + b[0];//ilosc kobiet
            a[1] = a[1] + b[1];//ilosc mezczyzn
            return a;
        });
//        System.out.println(wynik[0] + " " + wynik[1]);

        //praca domowa: osoby w wieku 21-40lat na Pracownik

        List<Pracownik> wWieku2041NaPracownik = osoby.stream().filter(persona -> persona.getWiek() > 21 && persona.getWiek() < 40)
                .map(persona -> {
                    Pracownik pracownik = new Pracownik();
                    pracownik.setImie(persona.getImie());
                    pracownik.setNazwisko(persona.getNazwisko());
                    pracownik.setPensja(persona.getZarobki());
                    return pracownik;
                }).collect(Collectors.toList());
//        wyswietlListePracownik(wWieku2041NaPracownik);
//        System.out.println(wWieku2041NaPracownik);

        //praca domowa: osoby na J i sumowanie ich pensji

        Integer osobyNaJISumaPensji = osoby.stream().filter(persona -> persona.getWiek() > 21 && persona.getWiek() < 40)
                .map(persona -> {
                    Pracownik pracownik = new Pracownik();
                    pracownik.setImie(persona.getImie());
                    pracownik.setNazwisko(persona.getNazwisko());
                    pracownik.setPensja(persona.getZarobki());
                    return pracownik;
                }).filter(pracownik -> pracownik.getImie().charAt(0) == 'J')
                .mapToInt(pracownik -> pracownik.getPensja()).sum();
        System.out.println(osobyNaJISumaPensji);
        //dla każdego stanpowiska wyświetlić średnią zarobków


        //wyświetlić ilość osób pracujacych w danym mieście


    }

    //       public List<Persona> ListaOsobWgMiasta(List<Persona>osoby,String miasto) {
//      List<Persona> lista = osoby.stream().filter(persona -> {
//              for( persona.getMiasto().equals(miasto));
//               return lista;
//    }


    //    private static void wyswietlListePracownik(List<Pracownik> lista) {
//        for (Pracownik pracownik : lista) {
//            System.out.println(pracownik);
//        }
//    }



    private static List<Persona> wyswietlListe(List<Persona> lista) {
        for (Persona persona : lista) {
            System.out.println(persona);
        }
        return lista;
    }
}

