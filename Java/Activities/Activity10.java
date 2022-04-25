package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();

        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");

        System.out.println("The size id : " +hs.size());
        hs.remove("E");

        if(hs.remove("Z"))
            System.out.println("Element removed");
        else
            System.out.println("Element not present");

        System.out.println("The item consists : " +hs.contains("B"));

        System.out.println("Updated Hashset" +hs);


    }
}
