package org.entity;

import java.util.ArrayList;
import java.util.HashMap;

public class Bar implements ReceiptData {

    @Override
    public HashMap<String, ArrayList<String>> receipt() {
        HashMap<String, ArrayList<String>> drikWithIngridients = new HashMap<>();
        drikWithIngridients.put("кампот", getKampot());
        drikWithIngridients.put("кава", getKava());
        drikWithIngridients.put("чай", getTea());


        return drikWithIngridients;
    }
    public static ArrayList<String> getKampot(){
        ArrayList<String> kampot = new ArrayList<>();
        kampot.add("Вода");
        kampot.add("Цукор");
        kampot.add("Вишні");

        return kampot;
    }
    public static ArrayList<String> getTea(){
        ArrayList<String> tea = new ArrayList<>();
        tea.add("Вода");
        tea.add("Цукор");
        tea.add("Чай");


        return tea;
    }
    public static ArrayList<String> getKava(){
        ArrayList<String> kava = new ArrayList<>();
        kava.add("Вода");
        kava.add("Кавові зерна");
        kava.add("Молоко");
        kava.add("Цукор");


        return kava;
    }



}
