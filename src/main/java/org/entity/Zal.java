package org.entity;

import org.controler.OrderHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Zal  {

    private int tableID = generateTableID();
    private int orderID = generaOrdeID();


    public int generateTableID() {
        Random random = new Random();
        return random.nextInt(25);

    }


    public int generaOrdeID() {
        Random random = new Random();
        return random.nextInt(1001) + 1000;
    }


    public void welcome() {
        Chiefs chiefs = new Chiefs();
        Customer castomer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вітаємо вас в ресторані *Від Олександра*\n" +
                "Як можемо до вас звертатись? ");
        castomer.setName(scanner.next());
        System.out.println("Дуже приємно " + castomer.getName() + " № Вашого замовлення "
                + orderID + " Присядьте за вільний столик № " + tableID +
                " готувати ваше замовлення буде " + chiefs.getPosition() + " " + chiefs.getName() + " \n");

    }

    public void endOrder(HashMap<String, Integer> validOrder,HashMap<String,Double> priceData) {

        OrderHandler controller = new OrderHandler();
        Fiscalization fiscalization = new Fiscalization();
        Kitchen kitchen = new Kitchen();
        Bar bar = new Bar();
        Waitres waitress = new Waitres();

        if (!validOrder.isEmpty()) {
            System.out.println(waitress.getPosition() + " " + waitress.getName() +
                    " несе ваше замовлення " + orderID + " за столик " + tableID);

            double totalCost = 0.0;

            for (Map.Entry<String, Integer> entry : validOrder.entrySet()) {
                String itemName = entry.getKey();
                Integer quantity = entry.getValue();
                Double price = priceData.get(itemName);

                System.out.println("Яке містить " + itemName + ", кількість: " + quantity);
                System.out.println("Ціна: " + itemName + " - " + price);

                totalCost += price * quantity;
            }

            System.out.println("Загальна вартість замовлення: " + totalCost);
        } else {
            System.out.println("Не знайдено жодної позиції!");
            endOrder(controller.handleorder(controller.getOrder(), kitchen.receipt(), bar.receipt()), fiscalization.dataForPrro());
        }

    }


}