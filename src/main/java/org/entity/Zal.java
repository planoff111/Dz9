package org.entity;

import org.controler.OrderHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Zal implements Restoraunt {

    private int tableID = generateTableID();
    private int orderID = generaOrdeID();

    @Override
    public int generateTableID() {
        Random random = new Random();
        return random.nextInt(25);

    }

    @Override
    public int generaOrdeID() {
        Random random = new Random();
        return random.nextInt(1001) + 1000;
    }

    @Override
    public void welcome() {
        Chiefs chiefs = new Chiefs();
        Castomer castomer = new Castomer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вітаємо вас в ресторані *Від Олександра*\n" +
                "Як можемо до вас звертатись? ");
        castomer.setName(scanner.next());
        System.out.println("Дуже приємно " + castomer.getName() + " № Вашого замовлення "
                + orderID + " Присядьте за вільний столик № " + tableID +
                " готувати ваше замовлення буде " + chiefs.getPosition() + " " + chiefs.getName() + " \n");

    }

    public void endOrder(HashMap<String, Integer> validOrder) {

        OrderHandler controller = new OrderHandler();
        Kitchen kitchen = new Kitchen();
        Bar bar = new Bar();
        Waitres waitres = new Waitres();
        if (!validOrder.isEmpty()) {
            System.out.println(waitres.getPosition() + " " + waitres.getName() +
                    " несе ваше замовлення " + orderID + " за столик " + tableID);
            for (Map.Entry<String, Integer> entry : validOrder.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println("Яке містить " + key + ", кількість: " + value);
            }

        } else {
            System.out.println("Не знайдено жодної позиції!");
            endOrder(controller.handleorder(controller.getOrder(), kitchen.receipt(), bar.receipt()));
        }


    }


}