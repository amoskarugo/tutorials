package Arrayss;

public class Geeks {

    public static void main(String[] args) {
        int[] arr = {32,45,85,23, 12, 98, 11};



//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] % 2 == 1)
//                System.out.print(arr[i] + " ");
//        }

        int[] numbers = java.util.stream.IntStream.range(1, 6).toArray();
        for (int number: numbers)
            System.out.print(number + " ");

        System.out.println();

        int[] age = java.util.stream.IntStream.rangeClosed(23,30).toArray();

        for (int a: age)
            System.out.print(a + " ");


        System.out.println();
    }
}
