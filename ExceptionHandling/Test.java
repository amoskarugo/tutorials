package ExceptionHandling;

public class Test {

    public static void main(String[] args) {
        try {
            throw new MyException("my custom exception");
        }catch (MyException e){
            System.out.println("caught");
            System.out.println(e.getMessage());
        }
    }
}
