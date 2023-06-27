package org.entity;

import java.util.ArrayList;
import java.util.List;

public class Dish {
    public Dish() {
    }

    private String name;

    private List<String> products;

    public Dish(String name, List<String> products) {
        this.name = name;
        this.products = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public List<String> getProducts() {
        return products;
    }


}
