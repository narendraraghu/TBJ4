import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntToList {
    public static void main(String[] args) {
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17};
        ArrayList<Integer> list = IntStream.of(primes)
                .boxed().collect(Collectors.toCollection(ArrayList::new));

        System.out.println(list);
    }
}
