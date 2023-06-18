package org.entity;

import java.util.ArrayList;

public class Kitchen {

private String nameOfDish;
private int quantOfDish;

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public int getQuantOfDish() {
        return quantOfDish;
    }

    public void setQuantOfDish(int quantOfDish) {
        this.quantOfDish = quantOfDish;
    }

    public void listOfDish(){
        ArrayList<String> dishes = new ArrayList<>();
        dishes.add("Борщ");
        dishes.add("Рибна Юшка");
        dishes.add("Суп пюре");
        dishes.add("Катопля по селянськи");
        dishes.add("Пюре");
        dishes.add("Гречка");
        dishes.add("Різотто");
        dishes.add("Торт Малиновий");
        dishes.add("Тістечко Лимонне");

    }
}
