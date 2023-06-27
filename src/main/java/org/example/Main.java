package org.example;

import org.controler.OrderHandler;
import org.entity.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        chooseCast(menu());


    }

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрий день!) присядете за толик? 1 - так\n" +
                "Якщо хочете покинути ресторан натисніть 2");

        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Введено недійсне значення. Будь ласка, введіть 1 або 2.");
        }
        int choose = scanner.nextInt();
        return choose;
    }

    public static void chooseCast(int choose) {
        Fiscalization fiscalization = new Fiscalization();
        OrderHandler controller = new OrderHandler();
        Kitchen kitchen = new Kitchen();
        Zal zal = new Zal();
        Bar bar = new Bar();
        File menu = new File("src\\main\\resources\\menu");
        switch (choose) {
            case 1:
                zal.welcome();
                System.out.println("Ознайомтесь, будь ласка, з нашим меню і додайте позиції у ваш ордер)");
                try {
                    String content = Files.readString(menu.toPath());
                    System.out.println(content);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                zal.endOrder(controller.handleorder(controller.getOrder(),kitchen.receipt(),
                        bar.receipt()),fiscalization.dataForPrro());

                break;
            case 2:
                System.out.println("Вже йдете( \n " +
                        "До побачення!");
                break;
            default:
                System.out.println("Немає такої опції(");
                chooseCast(menu());
                break;


        }

    }

}