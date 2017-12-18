package com.msz.ProgramowanieP1.biblioteka;

public enum Kategoria {
    SCI_FI("Science-fiction"), DRAMAT("Dramat"), KOMEDIA("Komedia"), BAJKA("Bajka"), EPOPEJA("Epopeja"), IT("IT");//enum jest juz kompletny tak naprawde
    //w tej formie to juz jest wywolanie konstrukotra
    // jezeli checmy stworzyc jeszzcze zmienna to
    //5 oniektow klasy Kategoria

    private String czytelnaNazwa;//stworzyc konstruktor do tego bo wszytskie inne konstreukotry sa wypisane

    private Kategoria(String czytelnaNazwa){
        this.czytelnaNazwa = czytelnaNazwa;
    }

    public String getCzytelnaNazwa() {
        return czytelnaNazwa;
    }
}
