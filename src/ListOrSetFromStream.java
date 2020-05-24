import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOrSetFromStream {
//    How to get List or Set from Stream in Java

    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(-2, -1, -1, 0, 1, 2);
        Set<Integer> streamSet = stream1.collect(Collectors.toSet());
        streamSet.forEach(System.out::println);
        System.out.println("###################################");
        Stream<Integer> stream2 = Stream.of(-2, -1, -1, 0, 1, 2);
        List<Integer> streamList = (stream2.collect(Collectors.toList()));
        streamList.forEach(System.out::println);
    }


}

/*-1
0
-2
1
2
###################################
-2
-1
-1
0
1
2
*/