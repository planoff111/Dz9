package org.entity;

import java.util.Arrays;
import java.util.Random;

public class Chief extends Employee{

    public Chief(String name, String position) {
        super(name, position);

    }

    public Object[]  arrOfChiefs(){
        Chief[] chiefs = new Chief[2];
        chiefs[0] = new Chief("Petro", "Chief");
        chiefs[1] = new Chief("Ivan", "Chief");
        chiefs[2] = new Chief("Olexandr", "Chief");
        return Arrays.copyOf(chiefs, chiefs.length, Object[].class);
    }

    public String chooseOfChief(Object[] obj){
        Random random = new Random();
        int randomInd = random.nextInt(obj.length);
        Object element = obj[randomInd];
        return element.toString();
    }
}
