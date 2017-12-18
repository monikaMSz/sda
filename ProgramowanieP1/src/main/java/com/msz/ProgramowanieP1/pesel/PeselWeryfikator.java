package com.msz.ProgramowanieP1.pesel;

import javax.xml.bind.DataBindingException;
import java.time.DateTimeException;
import java.time.LocalDate;

public class PeselWeryfikator {
    /**
     * Metoda weryfikująca poprawnosć numeru PESEL.
     *
     * @param pesel Numer PESEL do sprawdzenia
     * @return true - jeśli PESEL hest poprawny, false - w przeciwnym wypadku
     * @throws Exception- jeśli PESEL jest niepoprawny,metoda zwróci wyjątek z
     *                    komunikatem z przyczyną nieprawidłowości
     */
    public static boolean czyPoprawny(String pesel) throws Exception {//ctrlq .w tej metodzie bedziemy wowolywac metody inne sprawdzajace
        sprawdzIloscZnakow(pesel);
        sprawdzCzyWszytskieSaCyframi(pesel);
        sprawdzDateUrodzenia(pesel);
        sprawdzSumeKontrolna(pesel);
        return true;//pesel jest pprawny jezeli sprawdzmi ilosc znakow to
    }

    private static void sprawdzIloscZnakow(String pesel) throws Exception {//podpunkt1 sprawdzmy czy string ma 11 znakow
        if (pesel == null || pesel.length() != 11) {
            throw new Exception("PESEL nie zawiera 11 znaków!");//jezeli zawiera 11 znakow to ta metoda juz nic nie robi
        }
    }

    private static void sprawdzCzyWszytskieSaCyframi(String pesel) throws Exception {//sprawdza metoda czy ten string jest cyframi
        for (int i = 0; i < pesel.length(); i++) { //nie spr czy jest nullem bo sprawdzil juz wczesniej
            zamienZnakNaCyfre(pesel, i);//zamienione to co bylo w forze na metoda i wywolana jest metoda.pozniej bedzie wydzielona met modyfikowana
            // Integer.parseInt(String.valueOf(pesel.charAt(i));//parseINt przyjmuje tylko chara dlatego opakowyujemy chara w metoda string valueof
        }
    }

    private static int zamienZnakNaCyfre(String pesel, int i) throws Exception {
        char znak = pesel.charAt(i);//tworzymy chara, pobieramy znak z lancucha
        String znakJakoString = String.valueOf(znak);//zamieniamy na stringa chara
        try {
           int cyfra = Integer.parseInt(znakJakoString);
            return cyfra; //pobieramy znak o konkretnym indkesie ze stringa,zaminiamy na string i parseint zwracala cyfre jezeli sie dalo, jesli nie to wyjatek
                            //nic nam metoda nie zwracala bo bylo void jezeli bylo ok to zakladamy ze jest ok, a jak nie to wyjatek, ale teraz dodatkowo
                            //zwraca nam zamieniona cyfre, jak nie to wyskoczy wyjatek (duzo wczesniej)
        } catch (NumberFormatException e) {
            throw new Exception("Numer PESEL zawiera niepoprawne znaki");//zamieniamy stringa na liczbe, to wszytsko daje to ponizej:
        }
    }

    private static void sprawdzDateUrodzenia(String pesel)throws Exception {
        String rokString = pesel.substring(0, 2); //metoda substring wyciaga konkretne elementy ze stringa (0,2) wyciaga wartosc pierwsza i druga
        //idzie do indeksu 2 ale noie bierze juz go
        String miesiacString = pesel.substring(2, 4);
        String dzienString = pesel.substring(4, 6);
        int rok = Integer.parseInt(rokString);//poprzednia meotda zweryfikowala ze wszytskie znaki sa cyframi nie musimy spr wyjatku
        int miesiac = Integer.parseInt(miesiacString);
        int dzien = Integer.parseInt(dzienString);
        if (miesiac < 20) {
            rok += 1900;
        } else if (miesiac < 40) {
            miesiac -= 20;
            rok += 2000;
        }//Dopisac warunki do miesiecy >40
        try {
           /* LocalDate date - zmienna ktorej nie wykorzystujemy wiec nie muismy jej deklarowac*/ LocalDate.of(rok, miesiac, dzien);
        }catch(DateTimeException e){
            throw new Exception("Data urodzenia jest nieprawidłowa");
        }
    }
    private static void sprawdzSumeKontrolna(String pesel) throws Exception{
        int [] wspolczynniki = new int [] {9,7,3,1,9,7,3,1,9,7};//wspolczynniki wartosci dzieki ktorym sprwdzmimy poprawnosc wartosci kontrolnej
        int suma=0;
        for(int i=0;i<10;i++){//wszytskie elementy numeru pesel oprcz pstatniegpo
            int cyfra = zamienZnakNaCyfre(pesel,i);
            suma +=cyfra*wspolczynniki[i];//wymnozona sumapezez wspolczynniki

        }
        int ostatniaCyfraPesel = zamienZnakNaCyfre(pesel,10);
        if(suma%10 != ostatniaCyfraPesel ){
            throw new Exception("Suma kontrolna numeru PESEL jest niepoprawna");
        }

    }
}
