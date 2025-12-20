package LambdaExpAndStreams.MethodReferences.TypesOfMethodRefs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceMethodRefOfArbitraryObject {

    public static void main(String[] args)
    {
        List<String> personList = new ArrayList<>();

        personList.add("Vicky");
        personList.add("Poonam");
        personList.add("Sachin");

        // Method reference to String type
        Collections.sort(personList, String::compareToIgnoreCase);

        // Printing the elements(names) on console
        personList.forEach(System.out::println);
    }
}
