package org.entity;


import java.util.Random;

public class Zal {

    private int tableID;
    private int orderID;

    public int generatetableID(){
        Random random = new Random();
        tableID = random.nextInt(1)+23;
        return tableID;

    }
    public int generaOrdeID(){
        Random random = new Random();
        orderID = random.nextInt(1001)+1000;
        return orderID;

    }


}
