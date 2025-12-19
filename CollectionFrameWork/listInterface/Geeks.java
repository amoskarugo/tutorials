package CollectionFrameWork.listInterface;

import java.util.*;

public class Geeks {


    public static void main(String[] args) {
        // Creating a List of Strings using ArrayList
        List<String> li = new ArrayList<>();
        // Adding elements to object of List interface Custom elements
        li.add("java");
        li.add("c++");
        li.add("javascript");
        li.add("DSA");
        li.add("python");
        li.add(1, "Go");

        System.out.println("Elements of List are:");

        // Setting (updating) element at 1st index using set() method
        li.set(1, "Rust");
        li.remove("java"); // 1st occurrence of the object;
        li.remove(1); // removes an object at specific index.
        // Iterating through the list
        for (String s : li) {
            System.out.print(s + " ");
        }
        //Removing Elements


        System.out.println();
        //Searching Elements
        // create a list of integers
        List<Integer> al = new ArrayList<>();

        // add some integers to the list
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(2);

        // use indexOf() to find the first occurrence of an element in the list
        int i = al.indexOf(2);

        System.out.println("First Occurrence of 2 is at Index: "+i);

        // use lastIndexOf() to find the last occurrence of an element in the list
        int l = al.lastIndexOf(2);

        System.out.println("Last Occurrence of 2 is at Index: "+l);


        //Accessing Elements

        System.out.println(li.get(2));

        //Checking if an element is present or not
        System.out.println(li.contains("ruby"));


        NavigableSet<Integer> ts = new TreeSet<>();

        ts.add(45);
        ts.add(11);
        ts.add(56);
        ts.add(78);

        System.out.println(ts.contains(11));
        System.out.println(ts.first());
        System.out.println(ts.pollFirst());
    }
}
