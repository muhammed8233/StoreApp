package StoreApp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("""
//                Welcome to
//
//
//                """);
        StoreApp storeApp = new StoreApp();
        Scanner input = new Scanner(System.in);
        Item[] buyItem = new Item[2];
            double totalPrice = 0.0;
        for (int i = 0; i < buyItem.length; i++) {
            System.out.println("Enter name of item");
            String name = input.next();
            System.out.println("Enter quantity");
            int quantity = input.nextInt();
            System.out.println("Enter price");
            double price = input.nextDouble();
            totalPrice += quantity * price;

           Item purchase = storeApp.buyItem(name, quantity, price);
            buyItem[i] = purchase;
        }
        System.out.println(Arrays.toString(buyItem));
        System.out.println(totalPrice);


    }
}
