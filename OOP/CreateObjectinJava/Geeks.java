package OOP.CreateObjectinJava;

public class Geeks implements Cloneable{

    String name = "GeeksForGeeks";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Geeks g1 = new Geeks();
            Geeks g2 = (Geeks) g1.clone();
            System.out.println(g2.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
