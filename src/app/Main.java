package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books= new ArrayList<>();

        books.add(new Book("Война и мир", "Толстой"));
        books.add(new Book("Анна Каренина", "Толстой"));
        books.add(new Book("Преступление и наказание", "Достоевский"));
        books.add(new Book("Идиот", "Достоевский"));
        books.add(new Book("Мастер и Маргарита", "Булгаков"));

        List<Book> result= getBooksByAuthor(books, "Толстой");

        for (Book book:result) {
            System.out.println(book);
        }
    }
    public static List<Book> getBooksByAuthor(List<Book> list, String author){
       List<Book> result= new ArrayList<>() ;
       for (Book b : list){
           if (b.getAuthor().equalsIgnoreCase(author));
           result.add(b);

        }
        return result;
    }
}
