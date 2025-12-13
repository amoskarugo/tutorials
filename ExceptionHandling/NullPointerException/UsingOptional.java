package ExceptionHandling.NullPointerException;

import java.util.Optional;

public class UsingOptional {
    public static void main(String[] args) {
        String s = "ALEX";
        Optional<String> name = Optional.ofNullable(s);

        // Safe way to access
        System.out.println(name.orElse("Default Name").toLowerCase()); // prints: Default Name
    }
}
