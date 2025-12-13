package ExceptionHandling;

public class Test2 {
    public static void calculate(int age){
        if (age < 18)
            throw new InvalidAgeException("age must be 18 and above");

        System.out.println("message: age is valid age: " + age + " yrs");
    }

    public static void main(String[] args) {
        try {
            calculate(18);
        }catch (InvalidAgeException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
