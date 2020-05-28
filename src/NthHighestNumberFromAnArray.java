import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NthHighestNumberFromAnArray {
    public static void main(String[] args) {
        int[] listOfInteger = {1, 3, 45, 8, 7, 1, 9, 6};
        int n = 4;
        System.out.println(getNthLargestNumber(listOfInteger, n));
    }
    private static int getNthLargestNumber(int[] listOfInteger, int n) {
        List<Integer> integerList2 = IntStream.of(listOfInteger).boxed().sorted().collect(Collectors.toList());
        return integerList2.get(integerList2.size()-n);
    }
}

/*My Working Solution Was
*   int getNthLargestNumber(int[] listOfInteger, int n) {
        if(listOfInteger.length==0&&listOfInteger.length<n)
        {
            return -1;
        }
        if(n<0)
        {
            return  -1;
        }

        for (int i = 0; i < listOfInteger.length; i++) {
            for (int j = 0; j < listOfInteger.length; j++) {
                if (listOfInteger[i] < listOfInteger[j]) {
                    int temp = listOfInteger[i];
                    listOfInteger[i] = listOfInteger[j];
                    listOfInteger[j] = temp;
                }
            }
        }
        return listOfInteger[listOfInteger.length-n];
    }*/