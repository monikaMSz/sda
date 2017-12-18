package com.msz.ProgramowanieP1.biblioteka;

public class Ksiazka implements Comparable<Ksiazka>{
    private String tytul;
    private Integer liczbyStron;
    private String isbn;
    private Autor autor;
    private Kategoria kategoria;


    public Ksiazka(String tytul, Integer liczbyStron, String isbn, Autor autor, Kategoria kategoria)
    { this.tytul = tytul;
        this.liczbyStron = liczbyStron;
        this.isbn = isbn;
        this.autor = autor;
        this.kategoria = kategoria;

    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Integer getLiczbyStron() {
        return liczbyStron;
    }

    public void setLiczbyStron(Integer liczbyStron) {
        this.liczbyStron = liczbyStron;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

//    public void setKategoria(Kategoria kategoria) {
//        this.kategoria = kategoria;
//    }
//    public Integer getRokWydania(){return rokWydania;}
//    public void setRokWydania(Integer rokWydania){this.rokWydania=rokWydania;}

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", liczbyStron=" + liczbyStron +
                ", isbn='" + isbn + '\'' +
                ", autor=" + autor +
                ", kategoria=" + kategoria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ksiazka ksiazka = (Ksiazka) o;

        return isbn.equals(ksiazka.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;//czy nie poownujemy referencji czyli wskaznikiem do obiektu w pamieci,czy te zmienne nie wskazuja na ten sam obiekt w pamieci
//        if (o == null || getClass() != o.getClass()) return false;//spr czy jest tego samego typu
//
//        Ksiazka ksiazka = (Ksiazka) o;

        //if (!liczbyStron.equals(ksiazka.liczbyStron)) return false;
        //return tytul.equals(ksiazka.tytul);
//        return compareTo(ksiazka) == 0;
//    }

//    @Override
//    public int hashCode() {
//        int result = tytul autor.hashCode();
//        return result;
//    }
        @Override
    public int compareTo(Ksiazka o) {
        return this.tytul.compareTo(o.tytul);//porownaj moj tytul z ta przekazna w parametrze
   }
}
