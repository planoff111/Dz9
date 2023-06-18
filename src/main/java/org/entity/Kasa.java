package org.entity;

import java.text.DecimalFormat;

public class Kasa {



    public static double calcCost(double cost, int quat){

        return cost * quat;
    }
    public static String roundValue(double value) {
        return new DecimalFormat("#.00").format(value);
    }
}
