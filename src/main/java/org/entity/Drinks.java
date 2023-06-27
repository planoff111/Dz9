package org.entity;

import java.util.List;

public class Drinks {

    public Drinks() {
    }

    private String name;

    private List<String> products;

    public Drinks(String name, List<String> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public List<String> getProducts() {
        return products;
    }
}
