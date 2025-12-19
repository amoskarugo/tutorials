package LambdaExpAndStreams.MethodReferences.TypesOfMethodRefs;

import Methods.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceMethodRef {

    public static void main(String[] args)
    {

        List<Person2> personList = new ArrayList<>();

        personList.add(new Person2("Vicky", 24));
        personList.add(new Person2("Poonam", 25));
        personList.add(new Person2("Sachin", 19));

        // A comparator class with multiple
        // comparator methods
        ComparisonProvider comparator
                = new ComparisonProvider();

        // Now using instance method reference
        // to sort array by name
        Collections.sort(personList, comparator::compareByName);

        System.out.println("Sort by Name :");

        // Using streams
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        System.out.println();

        // Using instance method reference
        // to sort array by age
        Collections.sort(personList, comparator::compareByAge);

        // Display message only
        System.out.println("Sort by Age :");

        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
    }
}
