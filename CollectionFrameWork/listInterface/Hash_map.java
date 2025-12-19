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
    }
}
