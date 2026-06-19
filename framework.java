/*
 * framework.java
 * Topic: Collections and common utilities
 * Concepts: ArrayList, HashSet, HashMap, frequency counting, simple phonebook
 * How to run: javac framework.java && java framework
 * Notes: A series of small examples using Java Collections Framework.
 */
import java.util.*;

public class framework {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();

        a1.add("hardik");
        a1.add("Shrey");
        a1.add("Jasmine");
        a1.add("Ryyan");
        a1.add("Harsh");

        System.out.println("the studnet name are ");
        for (String i : a1) {
            System.out.println(i);
        }

        // Remove duplicates using hashSet
        // hashset doesnt contain duplicate values

        HashSet<Integer> set = new HashSet<>();

        set.add(12);
        set.add(20);
        set.add(130);
        set.add(12);
        set.add(20);

        System.out.println(set);

        // list in java

        List<Integer> l1 = new ArrayList<>();

        l1.add(12);
        l1.add(20);
        l1.add(130);
        l1.add(12);
        l1.add(20);

        for (int i : l1) {
            System.out.print(i + " ");
        }

        Collections.sort(l1); // used to sort the list
        System.out.println(l1);

        // store employee records in hasmap;

        HashMap<String, Integer> m1 = new HashMap<>();

        m1.put("hardik", 20);
        m1.put("Abhishek", 21);
        m1.put("Ryyan", 22);
        m1.put("Sharma", 23);
        m1.put("Aditi", 26);
        m1.put("kaushal", 28);

        System.out.println(m1);

        m1.clear();// used to clear the hashmap

        System.out.println(m1);

        boolean ans = m1.containsKey("hardik");
        System.out.println(ans);

        int[] arr = { 1, 2, 3, 5, 6, 7, 5, 4, 3, 3, 24, 5, 6, 71, 1, 1, 2, 3 };

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int key = 0;
        for (Map.Entry<Integer, Integer> e1 : freq.entrySet()) {
            if (e1.getValue() > max) {
                max = e1.getValue();
                key = e1.getKey();
            }
        }
        System.out.println("the elm with most freq is " + key);

        // implement a phonebook using hashmap

        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("hardik", 933634578);
        phoneBook.put("Ryyan", 93363407);
        phoneBook.put("Kartik", 933634512);
        phoneBook.put("shraddha", 93363452);
        phoneBook.put("Anuj", 9336312);
        phoneBook.put("laxman", 933634421);
        phoneBook.put("Ramesh", 932234421);
        System.out.println(phoneBook.get("laxman"));
        System.out.println(phoneBook.containsKey("Ramesh"));

    }
}
