package com.msz.ProgramowanieP1.osoba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Osoba implements Comparable<Osoba> {
    private String imie;
    private String nazwisko;
    private String miasto;
    private String kodPocztowy;
    private String ulica;
    private int wiek;
    private LocalDate dataUrodzenia;
    private String zawod;


    public Osoba(String imie, String nazwisko, String miasto, String kodPocztowy, String ulica, int wiek, LocalDate dataUrodzenia, String zawod, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.ulica = ulica;
        this.wiek = wiek;
        this.dataUrodzenia = dataUrodzenia;
        this.zawod = zawod;
    }

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Osoba osoba = (Osoba) o;

        if (!imie.equals(osoba.imie)) return false;
        return nazwisko.equals(osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        int result = imie.hashCode();
        result = 31 * result + nazwisko.hashCode();
        return result;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getZawod() {
        return zawod;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miasto='" + miasto + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", ulica='" + ulica + '\'' +
                ", wiek=" + wiek +
                ", dataUrodzenia=" + dataUrodzenia +
                ", zawod='" + zawod + '\'' +
                '}';
    }

//    public static Osoba utworzOsobe(String imie, String nazwisko, String miasto, String kodPocztowy, String ulica, int wiek,
//                                    String dataUrodzenia, String zawod, Plec plec) {
//        Osoba osoba = new Osoba(imie, nazwisko, miasto, kodPocztowy, ulica, wiek, dataUrodzenia, zawod, plec);
//        return osoba;


//    }
//    public static LocalDate zamienStringaDateNaLocalDate(String dataUrodzenia){
//        String date=" ";
//        LocalDate localDate=LocalDate.parse(date);
//   return localDate;
//    }

    @Override
    public int compareTo(Osoba o) {
        return this.imie.compareTo(o.imie);
    }


//    public void dodajOsobe(Osoba osoba) {
//        List<Osoba> lista = new ArrayList<>();
//        if (osoba != null) {
//            lista.add(osoba);
//        }
//    }
}