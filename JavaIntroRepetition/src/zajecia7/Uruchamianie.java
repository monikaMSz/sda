package zajecia7;

public class Uruchamianie {

    public static void main (String[]args){
        Author author = new Author("Monika Szen", "m.sz@lk.pl" , 'f');
        System.out.println(author);
        Book book = new Book ("Awesome", author, 39.99, 4);
        System.out.println(book);
        Author[] authors = new Author[]{
                new Author("Anna W", "anna@ko.pl", 'f'),
                new Author("Jan G", "jan@ko.pl", 'm'),
                new Author("Jacek J", "jacek@wk.pl", 'm')

        };
        BookWithAuthors books = new BookWithAuthors("Still Awesome ",authors,34.99);
        System.out.println(books);
        books.authorGender();
    }
}
