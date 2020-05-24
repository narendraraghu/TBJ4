import java.util.*;

import static java.util.stream.Collectors.toMap;

public class ArrayListToHashMap {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("ArrayList", "Vector", "LinkedList", "CopyOnWriteArrayList");

        Map<String, Integer> map8 = listOfString.stream().collect(toMap(s -> s, String::length));
        System.out.println(map8);
    }
}

//{ArrayList=9, Vector=6, LinkedList=10, CopyOnWriteArrayList=20}