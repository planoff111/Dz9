package org.entity;

import java.util.ArrayList;

public class Sklad {

    private String productName;
    private int productQuant;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuant() {
        return productQuant;
    }

    public void setProductQuant(int productQuant) {
        this.productQuant = productQuant;
    }

    public void listOfProducts(){
        ArrayList<String> product = new ArrayList<>();
        product.add("Картопля");
        product.add("Риба");
        product.add("Рис");
        product.add("Гречка");
        product.add("Мясо");
        product.add("Буряк");
        product.add("Сир");
        product.add("Гриби");
        product.add("Сир");
        product.add("Лимон");
        product.add("Малина");
        product.add("Цукор");
        product.add("Борошно");
        product.add("Крем");
        product.add("Цибуля");
        product.add("Морква");

    }
}
