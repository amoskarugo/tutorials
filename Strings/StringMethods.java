package Strings;

public class StringMethods {

    public static void main(String[] args) {

                String str = "GeeksforGeeks";

                System.out.println("Length: " + str.length());
                System.out.println("Uppercase: " + str.toUpperCase());
                System.out.println("Substring: " + str.substring(2, 6));
                //This method returns the character at ith index.
                  System.out.println(str.charAt(7));

                  // This method return the substring from the ith index character to end.
                 System.out.println(str.substring(7));
    }
}
