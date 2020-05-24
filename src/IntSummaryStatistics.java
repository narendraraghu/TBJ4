import java.util.Arrays;
import java.util.List;

public class IntSummaryStatistics {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        java.util.IntSummaryStatistics stats = primes.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();

        System.out.println(stats);
    }
}
//IntSummaryStatistics{count=10, sum=129, min=2, average=12.900000, max=29}