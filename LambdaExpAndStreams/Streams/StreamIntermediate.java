package LambdaExpAndStreams.Streams;

import java.util.Arrays;
import java.util.List;

public class StreamIntermediate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 20, 10, 30, 40);

        numbers.stream()
                .filter(n -> n > 10)   // keep > 10
                .map(n -> n * 2)       // double them
                .distinct()            // remove duplicates
                .sorted()              // sort ascending
                .forEach(System.out::println);
    }
}
