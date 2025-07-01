package app2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();

        library.add(new Book("Двенадцать стульев", Arrays.asList("Илья Ильф", "Евгений Петров")));
        library.add(new Book("Понедельник начинается в субботу", Arrays.asList("Борис Стругацкий", "Аркадий Стругацкий")));
        library.add(new Book("Мастер и Маргарита", Arrays.asList("Михаил Булгаков")));
        library.add(new Book("Обитаемый остров", Arrays.asList("Борис Стругацкий", "Аркадий Стругацкий")));

        List<Book> result = getBooksByAuthor(library, "Аркадий Стругацкий");

        System.out.println("Книги автора Аркадий Стругацкий:");
        for (Book b : result) {
            System.out.println(b);
        }

    }

    public static List<Book> getBooksByAuthor(List<Book> books, String author) {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getAuthors().contains(author)) {
                result.add(b);
            }
        }
        return result;

    }
}