package org.entity;

import java.util.ArrayList;
import java.util.Random;

public class Waitress {

    private final String name = chooseWaiter(listOfWaiters());
    private static String position = "Офіціант";

    private ArrayList<String> listOfWaiters() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Trevor");
        list.add("Ibragim");
        list.add("Pavlo");
        list.add("Max");
        list.add("Kiborg");
        list.add("Eduard");

        return list;
    }

    private String chooseWaiter(ArrayList list) {
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex).toString();


    }

    public String getName() {
        return name;
    }

    public static String getPosition() {
        return position;
    }
}
