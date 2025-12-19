package Strings;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Strings {

    static void reverseString(String str){
        // Declare original string variable


        // Declare another string variable and initialize it with an empty string
        String b = "";

        // Iterate through each character in string "a" from the last index to the first.
        for (int i = str.length() - 1; i >= 0; i--) {

            // Extract the current character at index "i" of the "a" string
            char ch = str.charAt(i);

            // Convert the character to a String object using the "Character.toString" method
            String ch1 = Character.toString(ch);

            // Concatenate the converted character String to the end of the "b" string
            b = b.concat(ch1);
        }

        System.out.println(str);
        System.out.println(b);
    }

    public static void main(String[] args) {

        reverseString("jane");
        String str = "Hello world";


        // creating Java string using a new keyword
        String str1 = new String("World hello!");

        //CharSequence Interface
        //Classes that implement CharSequence include:

        // 1. String

        // Method 1
        String str2= "hello";
        // Method 2
        String str3= new String("hello");

        //2. StringBuffer - it is mutable in nature and it is thread safe class
        StringBuffer demoString = new StringBuffer("GeeksforGeeks");

        System.out.println(demoString.charAt(0));

        // 3. StringBuilder - creates a mutable sequence of characters and it is not thread safe
        // mainly used for single threaded program.

        StringBuilder demoString2 = new StringBuilder("hello ");
        demoString2.append("GFG");
        System.out.println(demoString2);

        // 4. StringTokenizer
        StringTokenizer st = new StringTokenizer("Java String Example");
        System.out.println(st.nextToken("E"));


        // Java String concat() Method with Examples

        // String Initialization
        String s = "hello";

        // Use concat() method for string concatenation
        s = s.concat(" world");
        System.out.println(s);

        String s1 = "Geeksfor";
        String s2 = "Geeks";

        // Concatenate the strings s1 and s2 using the concat() method and store the result back in s1.
        s1 = s1.concat(s2);

        System.out.println(s1);

        // Handling NullPointerException in String concat()

        String s3 = "Computer-";
        String s4 = null;

        // Combining above strings by passing one string as an argument


        // It will raise NullPointerException
        System.out.println(s3);


        Set<String> hs = new HashSet<>();
        hs.add("orange");
        hs.add("melon");
        hs.add("apple");
        hs.add("mango");
        System.out.println(hs.);
    }
}
