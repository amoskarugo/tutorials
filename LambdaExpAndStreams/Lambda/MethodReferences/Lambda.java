package LambdaExpAndStreams.Lambda.MethodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {

    @FunctionalInterface
    interface ZeroParameter{

        void display();
    }

    @FunctionalInterface
    interface Functional {
        int operation(int a, int b);
    }
    public static void main(String[] args) {
        Add add = Integer::sum;

        int sum = add.addition(12, 10);

        System.out.println(sum);


        //Types of Lambda Parameters

        // 1. Lambda with Zero Parameters


        // Lambda expression with zero parameters
        ZeroParameter zeroParamLambda = ()
                -> System.out.println(
                "This is a zero-parameter lambda expression!");

        // Invoke the method
        zeroParamLambda.display();

        // 2. Lambda with a Single Parameter

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("All elements:");
        list.forEach(System.out::println);

        System.out.println("Even elements:");
        list.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });


        // 3. Lambda Expression with Multiple Parameters

        // Using lambda expressions to define the operations
        Functional add1 = (a, b) -> a + b;
        Functional multiply = (a, b) -> a * b;

        // Using the operations
        System.out.println(add1.operation(6, 3));
        System.out.println(multiply.operation(4, 5));

        //Examples in Collections / Streams

        List<String> names = Arrays.asList(
                "Alice", "Bob", "Charlie", "Adam");

        System.out.println("All names:");
        names.forEach(name -> System.out.println(name));

        System.out.println("\nNames starting with 'A':");
        names.stream()
                .filter(n -> n.startsWith("A"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }


}
