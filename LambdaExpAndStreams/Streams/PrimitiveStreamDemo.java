package LambdaExpAndStreams.Streams;

import java.util.stream.IntStream;

public class PrimitiveStreamDemo {
    public static void main(String[] args) {
        IntStream.range(1, 5).forEach(System.out::println);
    }
}
