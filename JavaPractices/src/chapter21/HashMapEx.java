package chapter21;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {

    public static void main(String[] args) {
        Map<String, Integer> set = new HashMap<>();
        set.put("Dhaka", 1205);
        set.put("Bogra", 5800);
        set.put("Naogaon", 6500);
        
        System.out.println("Display entries in HashMap: "+ set+ "\n");
        
        Map<String, Integer> set2=  new TreeMap<>(set);
        System.out.println("Display entries in  ascending order of key: "+ set2);
        
        Map<String, Integer> set3= new LinkedHashMap<>(16, .75f);
        set3.put("Smith", 30);
        set3.put("Anderson", 35);
        set3.put("Lewis", 37);
        set3.put("Cook", 40);
       
        System.out.println("\nThe age for Lewis is " + set3.get("Cook"));
        
        System.out.println("Disply entries in LinkedHashMap:  "+ set3);
        
    }
}
