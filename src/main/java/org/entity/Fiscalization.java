package org.entity;

import java.util.HashMap;

public class Fiscalization implements PRRO{
    @Override
    public HashMap<String, Double> dataForPrro() {
        HashMap<String,Double> priceData = new HashMap<>();
        priceData.put("борщ", 100.0);
        priceData.put("суп", 90.0);
        priceData.put("Уха", 95.5);
        priceData.put("вареники", 75.0);
        priceData.put("гречка", 85.8);
        priceData.put("пюре", 65.90);
        priceData.put("кампот", 50.5);
        priceData.put("кава", 75.50);
        priceData.put("чай", 45.0);

        return priceData;
    }
}
