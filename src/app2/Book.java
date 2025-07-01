package app2;

import java.util.List;

public class Book {
    private String title;
    private List<String> authors;

    public Book(String title, List<String> authors) {
        this.title = title;
        this.authors = authors;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Книга: " + title + "автор: " + authors;
    }
}
