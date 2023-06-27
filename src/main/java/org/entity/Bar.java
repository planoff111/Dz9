package org.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bar implements ReceiptData {

    @Override
    public HashMap<String, Drinks> receipt() {
        HashMap<String, Drinks> drikWithIngridients = new HashMap<>();
        drikWithIngridients.put("кава",new Drinks("Кава", List.of("Кава","Вода","Молоко","Цукор")));
        drikWithIngridients.put("чай",new Drinks("Чай", List.of("Чай","Вода","Цукор")));
        drikWithIngridients.put("кампот",new Drinks("Кампот", List.of("Кампот","Вода","Вишні","Цукор")));



        return drikWithIngridients;
    }




}
