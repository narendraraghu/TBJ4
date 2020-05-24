import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Distinct {
    //How to remove duplicates from Stream in Java 8 - Stream.distinct()
    public static void main(String[] args) {
        List<Integer> withDupes = Arrays.asList(10, 10, 20, 20, 30, 30, 40, 50);

        List<Integer> withOutDupes = withDupes.stream().distinct().collect(Collectors.toList());
        //or u can add as a toSet()
        //  Set<Integer> withOutDupes =withDupes.stream().collect(Collectors.toSet());
        //[50, 20, 40, 10, 30]
        System.out.println(withOutDupes);
    }
}
