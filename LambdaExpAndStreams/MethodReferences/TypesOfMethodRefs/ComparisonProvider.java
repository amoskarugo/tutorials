package LambdaExpAndStreams.MethodReferences.TypesOfMethodRefs;

// Helper class Comparator class
class ComparisonProvider
{
    // To compare with name
    public int compareByName(Person2 a, Person2 b) {
        return a.getName().compareTo(b.getName());
    }

    // To compare with age
    public int compareByAge(Person2 a, Person2 b) {
        return a.getAge().compareTo(b.getAge());
    }
}

