package com.msz.ProgramowanieP1.ksiegowosc;

import java.util.ArrayList;
import java.util.List;

public class Human {
    //ZAMIANA STREAMÓW NA PĘTLE I INSTRUKCJE WARUNKOWE

    //ZAD 1 OSOBY O IMIENIU DARIUSZ
    public List<Persona> osobyOImieniuDariusz(List<Persona> osoby) {
       List<Persona> dariusze = new ArrayList<>();
        for (Persona person : osoby) {

//            Persona persona = new Persona();//??????
            if (person.getImie().equals("Dariusz")) ;
            dariusze.add(person);//??persony
        }
//        return dariusze;
//    System.out.print(dariusze);
//        System.out.println();
        return dariusze;
    }


//ZAD 2 NAZWISKA Z LISTY
//    public List<Persona> nazwiskaZListy(List<Persona> osoby) {
//        List<Persona> nazwiska = new ArrayList<>();
//        for (Persona persony : osoby) {
//            persona.getNazwisko()
//            add

//        }
//    }

//ZAD 3 UNIKALNE NAZWISKA
//    public Set<Persona> uniklalneNazwiska(List<Persona>osoby){
//        Set<Persona> unikalne = new HashSet<>();
//        (to samo co w poprzednim)
//    }

//ZAD 4 STARSZE NIZ 35 I NAZIWSKO NA S
//    List<Persona> starszeINaS = new ArrayList<>();
//    for(int i =0; i<osoby.size();i++){
//        if(persona.getWiek>35 && persona.getNaziwsko().charAt==('S'));
//        add
//    }

//ZAD 5 WIEK PRODUKCYJNY



}