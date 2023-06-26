package org.entity;
import java.util.ArrayList;
import java.util.Random;

public class Chiefs {

    private final String name = chooseChaef(listOfChief());
    private static final String position = "Chief";


    private ArrayList<String> listOfChief() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Petro");
        list.add("Olexandr");
        list.add("Eugene");
        list.add("Jora");
        list.add("Eduard");

        return list;
    }

    private String chooseChaef(ArrayList list) {
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex).toString();


    }


    public String getName() {
        return name;
    }


    public String getPosition() {
        return position;
    }


}
