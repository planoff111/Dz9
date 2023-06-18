package org.entity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bar  {
   private String nameOfDrink;
   private int quantOfDrink;

    public String getNameOfDrink() {
        return nameOfDrink;
    }

    public void setNameOfDrink(String nameOfDrink) {
        this.nameOfDrink = nameOfDrink;
    }

    public int getQuantOfDrink() {
        return quantOfDrink;
    }

    public void setQuantOfDrink(int quantOfDrink) {
        this.quantOfDrink = quantOfDrink;
    }

    public void listOfDrinks(){
        ArrayList<String> drink = new ArrayList<>();
        drink.add("Кава");
        drink.add("Чай");
        drink.add("Кисіль");
        drink.add("Компот");

    }
}
