package com.msz.ProgramowanieP1.biblioteka;

import com.msz.ProgramowanieP1.osoba.Osoba;

import java.util.*;


public class Biblioteka implements Comparable<Ksiazka> {
    private List<Ksiazka> listaKsiazek;


    private Map<Ksiazka, List<Osoba>> rejestrCzytelnikow;

    public Biblioteka() {
        this.listaKsiazek = new ArrayList<>();
        this.rejestrCzytelnikow = new HashMap<>();
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (ksiazka != null) {
            listaKsiazek.add(ksiazka);
        }
    }

    public void zapiszCzytelnika(Ksiazka wypozyczonaKsiazka, Osoba czytelnik) {
        if (rejestrCzytelnikow.containsKey(wypozyczonaKsiazka)) {
            rejestrCzytelnikow.get(wypozyczonaKsiazka).add(czytelnik);

        } else {
            rejestrCzytelnikow.put(wypozyczonaKsiazka, new ArrayList<Osoba>());
            rejestrCzytelnikow.get(wypozyczonaKsiazka).add(czytelnik);
        }

    }

    public List<String> pokazCzytelnikowWgKsiazki(Ksiazka ksiazka) {
        //w wyniku tej metody otrzymac liste imion i naziwsk osob ktore wypozyczyły dana ksiazke
        List<String> wyniki = new ArrayList<>();
        if (rejestrCzytelnikow.containsKey(ksiazka)) {
            List<Osoba> osobyZRejestru = rejestrCzytelnikow.get(ksiazka);//[poieramy z listy osoby ktore wypozyczyla ksiazke z rejestru, czyli mapy
            for (Osoba osoba : osobyZRejestru) {//po kolei oosby ktore wypozyczyly ta ksiazke i  wrzucamy do listy wynikow
                wyniki.add(osoba.getImie() + " " + osoba.getNazwisko());
            }
            return wyniki;


        } else {
            return wyniki;//zwracamy zadeklarowana liste czy li pusta liste bo nikt nie wypozyczyl ksiazki
        }
    }

    public List<Ksiazka> zwrocListeKsiazekPrzeczytanychPrzezCzytelnika(Osoba osoba) {
        List<Ksiazka> wyniki = new ArrayList<>();

        for (Ksiazka ksiazka : rejestrCzytelnikow.keySet()) {

            List<Osoba> osobyZRejestru = rejestrCzytelnikow.get(ksiazka);

            for (int i = 0; i < osobyZRejestru.size(); i++) {

                if (osobyZRejestru.get(i).equals(osoba)) {//jezeli ta osoba jest na liscie w klasie osoba trzeba stworzyc metode equals
                    wyniki.add(ksiazka);
                    break;

                }
            }
        }
        return wyniki;
//    for(Osoba os : osobyZRejestru)
//            if (osobyZRejestru.contains(ksiazka))

    }

    public Map<Ksiazka, Integer> zwrocKsiazkiPrzeczytanePrzezOsobeIloscRazy(Osoba osoba) {
        Map<Ksiazka, Integer> wyniki = new HashMap<>();
        for (Ksiazka ksiazka : rejestrCzytelnikow.keySet()) {
            List<Osoba> czytelnicy = rejestrCzytelnikow.get(ksiazka);
            for (Osoba czytelnik : czytelnicy) {
                if (czytelnik.equals(osoba)) {
                    if (wyniki.containsKey(ksiazka)) {
                        Integer poprzedniaWartosc = wyniki.get(ksiazka);
                        wyniki.put(ksiazka, poprzedniaWartosc + 1);
                    } else {
                        wyniki.put(ksiazka, 1);
                    }
                }
            }
        }return wyniki;
    }


    public List<String> pokazListeKsiazek() {
        List<String> wynik = new ArrayList<>();
        for (Ksiazka ksiazka : listaKsiazek) {
            String opis = String.format("%s, %s. %s", ksiazka.getAutor().toString(), ksiazka.getTytul(), ksiazka.getKategoria().getCzytelnaNazwa());
            wynik.add(opis);
        }
        return wynik;
    }

    public Queue<Ksiazka> zwrocListeKsiazekWgKryterium(Kryterium kryterium, Porzadek porzadek) {
        PorownywarkaKsiazek porownywarka = new PorownywarkaKsiazek(kryterium, porzadek);
        Queue<Ksiazka> wynik1 = new PriorityQueue<>(porownywarka);//kolejka wie ze edzie klasa compare iz niej szkorzysta
        wynik1.addAll(listaKsiazek);
        return wynik1;
    }


// public Set<Ksiazka> unikalneTytuly (){
//     Set<Ksiazka>unikalne = new TreeSet<>();
//    unikalne.addAll(listaKsiazek);

//     return unikalne;
// }

    public Set<Ksiazka> znajdzKsiazkePoFragmencieTytulu(String fragment) {
        Set<Ksiazka> wyniki = new TreeSet<>();
        for (Ksiazka ksiazka : listaKsiazek) {
            if (ksiazka.getTytul().contains(fragment)) {
                wyniki.add(ksiazka);
            }
        }
        return wyniki;
    }

//    public Set<Ksiazka> znajdzKsiazkeWgKryterium(Kryterium kryterium, String fragment) {
//        Set<Ksiazka> wynik = new TreeSet<>();
//
//        for (Ksiazka ksiazka : listaKsiazek) {
//
//        }return 0;
//
//    }
//    public int podajIloscKsiazekZRoku (Integer rok){
//        for (Ksiazka ksiazka : listaKsiazek)
//            if(ksiazka.getRokWydania().contains)
//    }


    @Override
    public int compareTo(Ksiazka o) {
        return 0;
    }
}
