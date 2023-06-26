package org.entity;

import java.util.ArrayList;
import java.util.HashMap;

public class Kitchen extends Menu implements ReceiptData {

    @Override
    public HashMap<String, ArrayList<String>> receipt() {
        HashMap<String, ArrayList<String>> dishWithIngridients = new HashMap<>();
        dishWithIngridients.put("борщ", getBorch());
        dishWithIngridients.put("суп", getSup());
        dishWithIngridients.put("Уха", getUha());
        dishWithIngridients.put("вареники", getWareniki());
        dishWithIngridients.put("гречка", getGrechka());
        dishWithIngridients.put("пюре", getPure());


        return dishWithIngridients;
    }


}
