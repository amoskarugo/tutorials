package ExceptionHandling.NullPointerException;

public class UseTernaryOperator {

    public static void main(String[] args)
    {
        String s = null;
        String m = (s == null) ? "" : s.substring(0, 5);

        System.out.println(m);

        s = "Geeksforgeeks";
        m = (s == null) ? "" : s.substring(0, 5);
        System.out.println(m);
    }
}
