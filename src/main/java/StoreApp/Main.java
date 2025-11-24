package StoreApp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StoreApp storeApp = new StoreApp();
        double totalPrice = 0.0;
        double billTotal;
        double subTotal = 0.0;
        double vat = 7.5;
        double amount;
        double balance;
        double discount = 5.0;

        Scanner input = new Scanner(System.in);
        System.out.println("""
                Welcome to semicolon store
                Would you like to purchase an item
                YES
                NO
                """);
        String choice = input.next();
        ArrayList<Item> item = new ArrayList<>();
        if(choice.equalsIgnoreCase("yes")){
            do {
                System.out.println("Enter name of item");
                String name = input.next();
                System.out.println("How many pieces");
                int quantity = input.nextInt();
                System.out.println("How much per unit");
                double price = input.nextDouble();
                discount = (discount / 100) * price;
                vat = (vat / 100) * price;
                subTotal += quantity * price;
                billTotal = subTotal - discount + vat;
               Item purchase = (storeApp.buyItem(name, quantity, price, totalPrice));
                item.add(purchase);

                System.out.println("Add more items?");
                choice = input.next();
            }while (choice.equalsIgnoreCase("yes"));

            System.out.println("please enter customer details for receipt ");
            System.out.println("Cashier name");
            String cashier = input.next();
            System.out.println("please enter customer name:");
            String customerName = input.next();
            System.out.println("please enter customer address");
            String address = input.next();
            System.out.println("please enter customer Phone number");
            String telPhone = input.next();
            System.out.println();
            Customer customerDetail = storeApp.invoice(cashier, customerName,
                    address, telPhone, LocalDateTime.now());


            System.out.println("Kindly pay this: " + billTotal);
            System.out.println();
            System.out.println("How much did the customer give to you");
             amount = input.nextDouble();
             balance = amount - billTotal;


            System.out.println();

            System.out.println("""
                       SEMICOLON STORES
                       MAIN BRANCH
                       LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                       TEL: 09043225543
                       """);

            System.out.printf("%s%s%n%s%s%n%s%s%n%s%s%n ", "Cashier: ",customerDetail.getCashier(),
                    "CustomerName: ",customerDetail.getName(),
                    "ADDRESS: ",customerDetail.getAddress(),
                    "TEL: ", customerDetail.getTelNumber());
            System.out.println("Transaction Date: " + LocalDateTime.now());
            System.out.println("==================================================");
            System.out.printf("%10s%10s%10s%10s%n", " ITEM", " QTY", " PRICE", " TOTAL");
            System.out.println("--------------------------------------------------");
            for (int i = 0; i < item.size(); i++) {
                System.out.printf("%10s%10d%10.2f%10.2f%n", item.get(i).getName(), item.get(i).getQuantity(),
                        item.get(i).getPrice(), item.get(i).getTotalPrice());

            }
            System.out.println("--------------------------------------------------");
            System.out.printf("%20s%.2f%n%20s%.2f%n%20s%.2f%n ","Sub Total: ", subTotal,
                    "discount: ", discount, "VAT @ 17.50: ", vat );
            System.out.println("==================================================");
            System.out.printf("%20s%.2f%n%20s%.2f%n%20s%.2f%n ", "BillTotal: " ,billTotal,
                    "Amount Paid: ", amount, "Balance: ", balance);
            System.out.println("==================================================");
            System.out.println("      THANKS FOR YOUR PATRONAGE");
            System.out.println("==================================================");

        }else {
            System.out.println("Thanks for our store ");
            System.exit(700);
        }
    }
}
