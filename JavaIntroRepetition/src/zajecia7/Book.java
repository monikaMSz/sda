package zajecia7;

public class Book {
    private String title;
    private Author author;
    private double price;
    private int qty = 0;

    public Book (String title, Author author, double price){
        this.title = title;
        this.author = author;
        this.price = price;

    }
    public Book (String title,Author author,double price,int qty) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getTitle(){
        return title;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString() {
       return "Book title: "+ getTitle()+", "+ author.toString() + ", price: " + getPrice() + ", qty: " + getQty();
    }
}
