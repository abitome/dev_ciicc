import java.util.*;

class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }


}

public class Tasksheet11 {
    public static void main(String[] args){
        List<Book> books = new ArrayList<>(List.of(
                new Book("Java Programming","John Smith", 2021, 39.99),
                new Book("Python Basics",  "Jane Doe", 2020, 29.99),
                new Book("C++ Essentials", "Michael Johnson", 2019, 49.99)
        ));
        for(int x = 0; x < books.size(); x++) {
            System.out.println("Book " + (x+1));
            System.out.println("Title: " + books.get(x).title);
            System.out.println("Author: " + books.get(x).author);
            System.out.println("Year Published: " + books.get(x).yearPublished);
            System.out.println("Price: $" + books.get(x).price);
        }
    }
}
