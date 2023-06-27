package org.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kitchen implements ReceiptData {

    @Override
    public HashMap<String, Dish> receipt() {
        HashMap<String, Dish> dishWithIngridients = new HashMap<>();
        dishWithIngridients.put("вареники", new Dish("Вареники",List.of("Тісто","Мука","Вода","Мясо","Сіль","Морква")));
        dishWithIngridients.put("борщ", new Dish("Борщ",List.of("Вода","Цибуля","Буряк","Мясо","Сіль","Морква","Картопля")));
        dishWithIngridients.put("суп", new Dish("Суп",List.of("Вода","Вода","Мясо","Сіль","Морква")));
        dishWithIngridients.put("уха", new Dish("Уха",List.of("Вода","Риба","Сіль","Морква")));
        dishWithIngridients.put("пюре", new Dish("Пюре",List.of("Картопля","Мясо","Сіль","Цибуля")));
        dishWithIngridients.put("гречка", new Dish("Гречка",List.of("Гречка","Цибуля","Вода","Мясо","Сіль","Морква")));

        return dishWithIngridients;
    }


}
