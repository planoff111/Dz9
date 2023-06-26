package org.entity;

import java.util.ArrayList;
import java.util.HashMap;

public class Bar extends Menu implements ReceiptData {

    @Override
    public HashMap<String, ArrayList<String>> receipt() {
        HashMap<String, ArrayList<String>> drikWithIngridients = new HashMap<>();
        drikWithIngridients.put("кампот", getKampot());
        drikWithIngridients.put("кава", getKava());
        drikWithIngridients.put("чай", getTea());


        return drikWithIngridients;
    }


}
