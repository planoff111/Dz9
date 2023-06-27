package org.controler;


import org.entity.Dish;
import org.entity.Drinks;
import org.entity.Kitchen;

import java.util.*;

public class OrderHandler {


    public HashMap<String, Integer> getOrder() {
        HashMap<String, Integer> order = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ваше замовлення через кому без дублів");
        String inputItems = scanner.nextLine().toLowerCase();
        String[] items = inputItems.split(",");
        for (String item : items) {
            System.out.print("Введіть кількість для елемента " + item + ": ");
            int quant = scanner.nextInt();
            order.put(item, quant);

        }

        return order;
    }


    public HashMap<String, Integer> handleorder(HashMap<String, Integer> order,
                                                HashMap<String, Dish> dishIngredients,
                                                HashMap<String, Drinks> drinkIngredients) {
        Dish dish = new Dish();
        Drinks drinks = new Drinks();
        HashMap<String, Integer> validOrder = new HashMap<>();
        boolean foundDish = false;
        boolean foundDrink = false;
        ArrayList<String> unknownItems = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            String itemName = entry.getKey().toLowerCase();
            Integer quantity = entry.getValue();

            if (dishIngredients.containsKey(itemName)) {
                List<String> ingredients = dishIngredients.get(itemName).getProducts();
                System.out.println("ІНФО ДЛЯ ПОВАРА________________________________");
                System.out.println("Страва: " + dishIngredients.get(itemName).getName() + " Замовлення йде на кухню готуватись");
                System.out.println("Кількість: " + quantity);
                System.out.println("Список інгрідієнтів для повара " + String.join(" ", ingredients));
                System.out.println("ІНФО ДЛЯ ПОВАРА________________________________");
                foundDish = true;
                validOrder.put(itemName, quantity);
            } else if (drinkIngredients.containsKey(itemName)) {
                System.out.println("ІНФО ДЛЯ БАРМЕНА________________________________");
                List<String> ingredients = drinkIngredients.get(itemName).getProducts();
                System.out.println("Напій: " + drinkIngredients.get(itemName).getName() + " Замовлення йде на бар готуватись");
                System.out.println("Кількість: " + quantity);
                System.out.println("Список інгрідієнтів для бармена " + String.join(" ", ingredients));
                System.out.println("ІНФО ДЛЯ БАРМЕНА________________________________");
                foundDrink = true;
                validOrder.put(itemName, quantity);
            } else {
                unknownItems.add(itemName);
            }
        }

        if (!unknownItems.isEmpty()) {
            System.out.println("Невідомі назви, вони не додані до замовлення: " + String.join(", ", unknownItems));
        }

        return validOrder;

    }


}