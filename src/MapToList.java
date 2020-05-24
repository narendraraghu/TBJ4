import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {
    //How to convert a Map to List in Java 8
    //keySet()||entrySet()||values()||toList()||toCollection()
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");

        List<Integer> result3 = map.keySet().stream().collect(Collectors.toList());

// Java 8, Convert all Map values  to a List
        List<String> result4 = new ArrayList<>(map.values());
        System.out.println(result4);
    }

}

/*[orange, apple, banana]*/