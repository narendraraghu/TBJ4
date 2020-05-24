import java.util.Arrays;
import java.util.List;

public class Optional {
    private static List<String> listOfBooks = Arrays.asList("Effective Java", "Clean Code", "Test Driven");
    /*
     * Return the first book start with a letter.
     */
    public static String getBook(String letter) {
        java.util.Optional<String> book
                = listOfBooks.stream()
                .filter(b -> b.startsWith(letter))
                .findFirst();
        return book.orElse("Book Not Found");
    }

    public static void main(String[] args) {
        System.out.println(getBook("E"));
    }
}
