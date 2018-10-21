
package chapter20;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1= new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");
        
        System.out.println("A lis of cities in collection1: ");
        System.out.println(collection1);
        
        
        System.out.println("\nIs dallas in collection1? " + collection1.contains("Dallas"));
        collection1.remove("Dallas");
        System.out.println("\n" + collection1.size() + " cities are in collection1 now ");
        System.out.println("\nIs dallas in collection1? " + collection1.contains("Dallas"));
        
        Collection<String> collection2= new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");
        
        System.out.println("\nA list of cities in collection2: ");
        System.out.println(collection2);
        
        
    }
    
}
