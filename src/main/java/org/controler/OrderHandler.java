package org.controler;


import java.util.*;

public class OrderHandler {


    public HashMap<String, Integer> getOrder() {
        HashMap<String, Integer> order = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ваше замовлення через пробіл без дублів");
        String inputItems = scanner.nextLine().toLowerCase();
        String[] items = inputItems.split(" ");
        for (String item : items) {
            System.out.print("Введіть кількість для елемента " + item + ": ");
            int quant = scanner.nextInt();
            order.put(item, quant);

        }

        return order;
    }


    public HashMap<String, Integer> handleorder(HashMap<String, Integer> order,
                                                HashMap<String, ArrayList<String>> dishIngredients,
                                                HashMap<String, ArrayList<String>> drinkIngredients) {
        HashMap<String, Integer> validOrder = new HashMap<>();
        boolean foundDish = false;
        boolean foundDrink = false;
        ArrayList<String> unknownItems = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            String itemName = entry.getKey().toLowerCase();
            Integer quantity = entry.getValue();

            if (dishIngredients.containsKey(itemName)) {
                ArrayList<String> ingredients = dishIngredients.get(itemName);
                System.out.println("Страва: " + itemName + " Замовлення йде на кухню готуватись");
                System.out.println("Кількість: " + quantity);
                System.out.println("Інгредієнти: " + String.join(", ", ingredients));
                foundDish = true;
                validOrder.put(itemName, quantity);
            } else if (drinkIngredients.containsKey(itemName)) {
                ArrayList<String> ingredients = drinkIngredients.get(itemName);
                System.out.println("Напій: " + itemName + " Замовлення йде на бар готуватись");
                System.out.println("Кількість: " + quantity);
                System.out.println("Склад: " + String.join(", ", ingredients));
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