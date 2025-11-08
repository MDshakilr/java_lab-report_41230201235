
class LibraryBook {
    int bookId;
    String title;
    String author;
    double price;

    LibraryBook()
    {
        bookId = 0;
        title = "Unknown";
        author = "Not Specified";
        price = 0.0;
    }


    LibraryBook(int id, String t, String a, double p)
    {
        bookId = id;
        title = t;
        author = a;
        price = p;
    }

    void updatePrice(double newPrice)
    {
        price = newPrice;
        System.out.println("Price updated to: " + price);
    }


    void updatePrice(int percentage_Increase)
    {
        price = price + (price * percentage_Increase / 100);
        System.out.println("Price increased by " + percentage_Increase + "%, New price: " + price);
    }

    void display() {

        System.out.println("Book ID " + bookId);
        System.out.println("Title    " + title);
        System.out.println("Author  " + author);
        System.out.println("Price   " + price);
    }
}


public class Library_Management {
    public static void main(String[] args) {

        LibraryBook b1 = new LibraryBook();
        LibraryBook b2 = new LibraryBook(101, "Book1", "shakikl", 750.0);
        b1.display();
        b2.display();
        b1.updatePrice(350.0);
        b2.updatePrice(10);
        b1.display();
        b2.display();
    }
}
