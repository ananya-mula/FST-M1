package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer,String> colours = new HashMap<Integer,String>();

        colours.put(1,"Red");
        colours.put(2,"yellow");
        colours.put(3,"Orange");
        colours.put(4,"Violet");
        colours.put(5,"Pink");
        colours.put(6,"Green");

        System.out.println("The map is :" +colours);

        colours.remove(3);
        System.out.println("The new map is :" +colours);

        if(colours.containsValue("Green"))
            System.out.println("The Colour exists");
        else
            System.out.println("The Colour do not exists");

        System.out.println("The size of the map is :" +colours.size());


    }
}
