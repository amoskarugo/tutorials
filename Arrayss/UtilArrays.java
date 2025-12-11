package Arrayss;
import java.util.Arrays;

public class UtilArrays {

    static void asListArray(){


        int[] arr  = {41, 25, 87, 96, 23, 45, 12};

        int[] arr2 = {7, 5, 9, 63, 7, 2};

        // To convert the elements as List
        System.out.println("Integer Array as List: "
                + Arrays.asList(arr));

        Arrays.sort(arr);
        int intKey = 87;
        // Print the key and corresponding index
        System.out.println(
                intKey + " found at index = "
                        + Arrays.binarySearch(arr, intKey));


        System.out.println(
                intKey
                        + " found at index = "
                        + Arrays
                        .binarySearch(arr, 1, 3, intKey));



        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.compare(arr, arr2));
    }



    public static void main(String[] args) {
        asListArray();
    }
}
