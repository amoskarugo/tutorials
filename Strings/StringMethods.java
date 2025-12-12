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

        String s = "Hello, World!";
        System.out.println(s.concat("!!!"));

        //This method returns the index within the string of the first occurrence of the specified string.
        // If the specified string s is not found in the input string, the method returns -1 by default.
        System.out.println(s.indexOf("World"));

        //This method returns the index within the string of the first occurrence of the specified string, starting at the specified index.
        System.out.println(s.indexOf("l", 4));

        System.out.println(s.lastIndexOf("l"));

        //This method returns the index within the string of the last occurrence of the specified string.
        // If the specified string s is not found in the input string, the method returns -1 by default.
        System.out.println(s.lastIndexOf("l"));


        // This method compares this string to the specified object.
        System.out.println(s.equals("Hello, World!"));
        // This method checks if two strings are equal, without considering letter case.
        System.out.println(s.equalsIgnoreCase("hello, world!"));

        //This method compares two string lexicographically.

        String st = "Hello, World!";
        System.out.println(st.compareTo("Hello, Java!"));

        // This method compares two string lexicographically, ignoring case considerations

        String str1 = "Hello, World!";
        System.out.println(str1.compareToIgnoreCase("hello, java!"));

        //This method returns the copy of the String, by removing whitespaces at both ends.
        // It does not modify the whitespace characters present between the text

        String str2 = "   Hello, Trim!   ";
        System.out.println("'" + str2.trim() + "'");

        //This method returns a new string where all instances of oldChar are replaced by newChar.

        String str3 = "Hello, World!";
        System.out.println(str3.replace('l', 'x'));

        //This method returns true if string contains the given string.
        String str4 = "Hello, World!";
        System.out.println(str4.contains("World"));

        //This method converts the string into a new character array

        String str5 = "Hello";
        char[] chars = str5.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
        //This method returns true if string starts with this prefix.
        String str6 = "Hello, World!";
        System.out.println(str6.startsWith("Hello"));

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}
