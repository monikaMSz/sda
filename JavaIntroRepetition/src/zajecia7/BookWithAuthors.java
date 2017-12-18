package zajecia7;

import java.util.Arrays;

public class BookWithAuthors {
    private String title;
    private Author[]authors;
    private double price;
    private int qty = 0;








    public BookWithAuthors (String title, Author [] authors, double price){
        this.title = title;
        this.authors = authors;
        this.price = price;

    }
    public BookWithAuthors (String title,Author []authors,double price,int qty) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }


    public String getTitle() {
        return title;
    }
    public Author[] getAuthors(){

        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String wynik = "Book[ title = " + getTitle();
        for(Author autor : authors){
            wynik = wynik + autor;
        }
        return wynik + "price "+ getPrice() + ", qty "+ getQty();
    }
    public String getAuthorNames() {
        String nazwa="";
        for(Author autor: authors){
            nazwa = nazwa + autor.getName();

        }
        return nazwa;
    }
    public void authorGender(){
        int liczbaF = 0;
        int liczbaM = 0;
        for (Author autor:authors){
            if(autor.getGender() == 'f'){
                liczbaF++;
            }
                else {
                liczbaM++;
            }

        }
        System.out.println("liczba kobiet" + liczbaF);
        System.out.println("liczba mężczyzn" + liczbaM);
    }

}
