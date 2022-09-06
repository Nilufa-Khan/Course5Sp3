import java.util.*;

public class Student {
    public static void main(String[] args) {
        //implementing hashset
        //set is a reference variable and hashset is a implementation class
        //set produce unorderd and unique value
         Set<Integer> integerSet = new HashSet<>();
        integerSet.add(12);
        integerSet.add(11);
        integerSet.add(13);
        integerSet.add(12);//it not added as it is a duplicate
        integerSet.add(18);
        System.out.println("integerSet = " + integerSet);
        System.out.println("Iterate through hash set");
        Iterator<Integer> integerIterator = integerSet.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
        System.out.println("Using for loop");
        for (Integer val : integerSet) {
            System.out.println("val = " + val);
        }
        System.out.println(integerSet.size());

        System.out.println("HashMap interface");
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(123, "Nilufa");
        integerStringMap.put(124, "Raj");
        integerStringMap.put(128, "Shamim");
        integerStringMap.put(121, "Virat");
        integerStringMap.put(120, "Mohon");
        System.out.println("integerStringMap = " + integerStringMap);
        System.out.println("TreeMap interface");
        //treeMap extend the sortedMap hence the keys are in sorted order
        TreeMap<Integer, String> stringMap = new TreeMap<>();
        stringMap.put(1, "Rahul");
        stringMap.put(10, "Javed");
        stringMap.put(12, "Neeraj");
        stringMap.put(9, "Alka");
        stringMap.put(5, "Sunaina");
        System.out.println("stringMap = " + stringMap);//it will give sorted output as per the key element
        System.out.println(stringMap.containsKey(12));
        System.out.println(stringMap.containsValue("Alka"));
        System.out.println(stringMap.firstEntry());
        System.out.println(stringMap.lastEntry());
        System.out.println("Higher key = " + stringMap.higherEntry(10));//in map higher key is 12 it return
        System.out.println(stringMap.higherKey(34));//return null cause there are no such key
        System.out.println("Hashmap elements");
        System.out.println("stringMap = " + stringMap);
        System.out.println("Set view of map elements");
        System.out.println(stringMap.entrySet());
        System.out.println("Iterate through for each loop");
        System.out.println("Key  : " + " value ");
        for (Map.Entry<Integer, String> val : stringMap.entrySet()) {  //entry set return set view of the map that is Map.Entry<k,v>
            System.out.println(val.getKey() + " : " + val.getValue());  //iterating through the map entry to retrieve the key value pair by using getkey()
            //and getValue() method
        }
        System.out.println("Calling method iterate using key set");
    }

    public static void iterateUsingKeySet (Map < Integer, Student > map){
        for (Integer key : map.keySet()) {  //keyset() method return all the keys from the map
            System.out.println("key = " + map.get(key));
        }
    }
    public static void iterateUsingValue (Map < Integer, Student > map){
        for (Student val : map.values()) {  //this map.values() method return all the values from the map
            System.out.println("val = " + val);
        }

        }
    }
