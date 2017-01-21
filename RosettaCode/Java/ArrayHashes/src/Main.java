import java.util.HashMap;
import java.util.Map;

/**
 */
public class Main {
    private static final int[] numbers = {1, 2, 3, 4, 5};
    private static final String[] strings = {"one", "two", "three", "four", "five"};

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            hashMap.put(numbers[i], strings[i]);
        }
        hashMap.forEach((k, v) -> System.out.printf("Key: %s, Value: %s%n", k, v));
    }


}
