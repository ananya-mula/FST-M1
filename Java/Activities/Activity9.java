package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();

        myList.add("John");
        myList.add("ABC");
        myList.add("HGF");
        myList.add("SUV");
        myList.add("XYZ");

        System.out.println("The third element is : " +myList.get(3));
        System.out.println("The value contains : " +myList.contains("ABC"));

        if(myList.contains("ABC"))
            System.out.println("The element exists");
        else
            System.out.println("The element does not exists");

        System.out.println("The number of elements are : " +myList.size());
        myList.remove("XYZ");
        System.out.println("The new number of elements are : " +myList.size());
    }
}
