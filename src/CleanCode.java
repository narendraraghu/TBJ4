import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class CleanCode {
    //How to write Clean Code using Java 8 Lambda and Stream
    public static void main(String[] args) {
        Collection<String> myList = Arrays.asList("ArrayList", "Vector", "LinkedList", "CopyOnWriteArrayList");
        long listEndsWithList = myList.stream()
                .filter(element -> element.endsWith("List"))
                .count();
        System.out.println("Number of List classes which ends with word list :" + listEndsWithList);

    }
}
//OutPut : Number of List classes which ends with word list :3