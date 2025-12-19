package CollectionFrameWork.listInterface;

import java.util.HashMap;
import java.util.Map;

public class Hash_map {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);

        // Iterate through the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }



        //Changing Elements in HashMap in Java

        // Initialization of a HashMap
        HashMap<Integer, String> hm
                = new HashMap<Integer, String>();

        // Change Value using put method
        hm.put(1, "Geeks");
        hm.put(2, "Geeks");
        hm.put(3, "Geeks");

        System.out.println("Initial Map " + hm);

        hm.put(2, "For");

        System.out.println("Updated Map " + hm);


        //Removing Element from Java HashMap

        // Initialization of a HashMap
        Map<Integer, String> hm1
                = new HashMap<Integer, String>();

        // Add elements using put method
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");
        hm1.put(4, "For");

        // Initial HashMap
        System.out.println("Mappings of HashMap are : "
                + hm1);

        // remove element with a key
        // using remove method
        hm.remove(4);

        // Final HashMap
        System.out.println("Mappings after removal are : "
                + hm);


        //Traversal of Java HashMap

        // initialize a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements using put method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Iterate the map using for-each loop
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
    }
}
